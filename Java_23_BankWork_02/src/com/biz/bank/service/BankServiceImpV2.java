package com.biz.bank.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.biz.bank.domain.BankInfo;

public class BankServiceImpV2 extends BankServiceImpV1 {
	
	@Override
	public void output() throws Exception {
		// TODO ���ó��
		
		this.viewAcc();// ������ȸ
		
		if(bookVO == null)return;
		
		System.out.print("��ݾ�>>");
		String strOutput = scanner.nextLine();//Ű���忡�� ��ݾ� �Է�
		int intOutput = Integer.valueOf(strOutput);//�Է¹��� ��ݾ� ���ڷ� ��ȯ
		int intBalance = bookVO.getBalance();//VO���� �ܾ� �޾ƿ���
		if(intBalance < intOutput) {//�ܾ׺��� ��ݾ��� ������ �ǵ��ư���
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		if( intOutput < 0) {
			System.out.println("��ݾ��� 0�� �̻��̾�� ��!!");//��ݾ��� - ������ �ǵ��ư���
			return;
		}
		intBalance -= intOutput;//�ܾ� - ��ݾ�
		bookVO.setBalance(intBalance);//�ܾ� - ��ݾ� ����� ���� �ܾ� VO �� �ٽ� ���
		
		// �ŷ�����, ���� ����
		// Java 1.8 ���� ���Ӱ� ������ ��¥ Ŭ����
		// Date Ŭ�������� �߻��� ��¥ ���� �������� �̽���
		// ���κ� �ؼҵ� ���ο� Ŭ����
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String lastDate = localDate.format(df);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark(BankInfo.REMARK.OUTPUT);
		this.accListWrite(BankInfo.REMARK.OUTPUT,intOutput);
		this.bookWriter(bookFile);
		
		//bookVO.setBalance(bookVO.getBalance() - intOutput); 
	}
	
}
