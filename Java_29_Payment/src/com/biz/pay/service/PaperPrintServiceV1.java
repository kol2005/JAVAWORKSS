package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

/*
 * PayReadService ���� pay.txt ������ ���� ������ ��������
 * => payStrList
 * ���� ����(����Ʈ)�� �ѻ������ �޿��� ���� PaperMakeService��
 * ������ �ϰ� ȭ��ż��� ����� ����� �����ͼ�
 * console �� �����ٰ�
 */
public class PaperPrintServiceV1 {
	
	PayReadServiceV1 pr;
	PaperMakeServiceV1 pm;
	List<List<PaperVO>> paperAllList;
	
	// ExŬ�������� ���� �̸��� �����Ҷ� ���� ����
	String payFile;
	
	public PaperPrintServiceV1() {
		pr = new PayReadServiceV1();
		pm = new PaperMakeServiceV1();
	}
	// PaperPrintServiceV1 pp = new PaperPrintServiceV1("pay.txt");
	public PaperPrintServiceV1(String payFile) {
		// �⺻�����ڸ� ȣ���ؼ�
		// pr ��ü�� pm ��ü�� �����ϰ� �ν��Ͻ��� ����� �д�
		this();// �⺻�����ڸ� ȣ���϶�
		this.payFile = payFile;
	}
	// pp.setPayFile("pay.txt")
	public void setPayFile(String payFile) {
		this.payFile = payFile;
	}
	
	public void printPaper() throws Exception {
		String payPath = "src/com/biz/pay/";

		
		PrintWriter fineOut;
		for(List<PaperVO>paperList: this.paperAllList) {
			PrintWriter fileOut = new PrintWriter(payPath + paperList.get(0).getMember());
			fileOut.println("=======================================");
			fileOut.print("�����ȣ : "+ paperList.get(0).getMember() );
			fileOut.println(", �޿��� : "+paperList.get(1).getMember());
			fileOut.println("---------------------------------------");
			
			for(PaperVO pVO : paperList) {
				fileOut.printf("%s\t%d\n",pVO.getPaper(),pVO.getCount());
				
			}
			fileOut.close();
			
		}
		pr.readPay(this.payFile);
		List<String> payStrList = pr.getPayStrList();
	}
	public void viewpaper() throws Exception {
		for(List<PaperVO> paperList : this.paperAllList) {
		
		System.out.println("=======================================");
		System.out.print("�����ȣ : "+ paperList.get(0).getMember() );
		System.out.println(", �޿��� : "+paperList.get(1).getMember());
		System.out.println("---------------------------------------");
		
		
		//paperAllList.add(paperList);
		for(PaperVO pVO : paperList) {
			System.out.printf("%s\t%d\n",pVO.getPaper(),pVO.getCount());
		}
		}
	}
	
	public void makePaperList() throws Exception {
		// pay.txt ������ �о payStrList �� �����ϴ� ����
		pr.readPay(this.payFile);
		List<String> payStrList = pr.getPayStrList();
		paperAllList = new ArrayList<List<PaperVO>>();
		
		// payStrList �� ���ڿ�(String)�� ����ִ� List ���̱� ������
		// for �ݺ����� �̿��ؼ� �Ѱ��� ������ �ȴ�
		for(String pay : payStrList) {
			// pay ���:�޿� ������ ���ڿ��� ����ִ�
			// pay�� ���, �޿� �κ����� ����
			String[] pays = pay.split(":");
			// pays[0] ���
			// pays[1] �޿���
			
			// ���ڿ��� �Ǿ��ִ� �޿����� ���������� ��ȯ
			int intPay = Integer.valueOf(pays[1]);
			
			// �޿����� pm Ŭ������ ������ �ؼ� ȭ��ż��� ���
			pm.make(intPay);
			List<PaperVO> paperList = pm.getPaperList();
			paperList.get(0).setMember(pays[0]);
			paperList.get(1).setMember(pays[1]);
			
			paperAllList.add(paperList);

			
			
		}
	}
	
	
	
}
