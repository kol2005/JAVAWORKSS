package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

public class BookServiceImpV1 implements BookService {

	Scanner scan; // Ű���忡�� �� �Է¹ޱ� ���� �غ�
	
	// �Է¹��� ���� ���� ����Ʈ ������ �غ�
	List<BookVO> bookList;
	
	//������ �޼���
	// scan �� bookList �� ����Ҽ� �ֵ��� �ʱ�ȭ, ����
	public BookServiceImpV1() {
		scan = new Scanner(System.in);
		//Ŭ������ ����Ϸ��� code �� �ۼ��ߴµ�
		// ������ ����
		// Ctrl + Shift + O : �ڵ� import ����
		bookList = new ArrayList<BookVO>();
	}
	
	// service.input(30); 30�� �����͸� �Է� �޾ƶ�
	public void input(int count) {
		
		for ( int i = 0 ; i < count ; i++) {
			this.input();
		}
	}
	@Override
	public void input() {
		
		System.out.print("������ȣ > ");
		String strNum = scan.nextLine();
		
		System.out.print("������ > ");
		String strName = scan.nextLine();
		
		System.out.print("���� > ");
		String strWriter = scan.nextLine();
		
		System.out.print("���ǻ� > ");
		String strComp = scan.nextLine();
		
		/*
		 * �� App���� ����ڰ� �����͸� �Է��ϴ� �߿�
		 * �����̳�, ���ǿ����� ���ڰ� �ƴ� ���ڿ��� 
		 * �Է��ϰ� �Ǹ� ���ڿ��� ���ڷ� �ٲٴ� ��������
		 * NumberFormatException �� �߻��� ���̴�
		 * 
		 * �� App ���� NumberFormatException �� �߻��� Ȯ����
		 * �ſ�(0.00000001%) ����
		 * 
		 * �̷� ��� ����ڰ� �Է��ϴ� ��������
		 * �ణ�� �Ǽ��� �ϰ� �Ǿ
		 * �տ��� �Է��ߴ� ��� �����͸� �Ұ� �ȴ�
		 * 
		 * ������ ���忡���� ���ٸ� �ǹ̰� ����
		 * �߰� �ڵ尡 ��� ��������
		 * ����� ���忡���� �ſ� ������ �ڵ尡 �ȴ�
		 * 
		 * ����� ���忡�� ���� �ڵ带 �ۼ��ϱ� ����
		 * �����ڴ� �̷� ��Ȳ����
		 * �߻��� �� �ִ� exception �� �����ϰ�
		 * ������ �ذ����� ������ �Ѵ�
		 * =exception handling �̶�� �Ѵ�
		 * 
		 * 1. ���� ����ڰ� �����̳�, ���ǿ����� ���ڿ��� �����Ͽ�
		 * �Է��� ��� �ȳ� �޼����� �����ְ�, ���� ���� �Է��ϵ���
		 * �����ϴ� �ڵ带 �ۼ�
		 */
		System.out.print("���� > ");
		String strPrice = scan.nextLine();
		int intPrice = 0;
		/*
		 * ����ó��
		 * ����ڰ� App�� ����ϴ� �߿�
		 * �����͸� �Է��ϰų� � ������ �����Ҷ�
		 * Run time error �� �߻��� Ȯ���� 1/100000000 �̶�
		 * 		�ִٸ� �� app �� ����ڿ��� ����� ��Ʈ������ �ټ� �ִ�
		 * 
		 * �����ڴ� �׷��� ��Ȳ�� ������ �ʱ� ����
		 * 		�����Ҽ� �ִ� ���ܰ� �߻��� �ڵ忡�� 
		 * 		���� ó���� ���־�� �Ѵ�
		 * 
		 * ����ó���� ������ �ʼ� �׸����� �ν�����
		 */
		/*
		 * ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ��
		 * 		try { } �� �ۼ��Ѵ�
		 * ���� ���ܰ� �߻��� ��� ó���� �ڵ��
		 * 		catch() { } �� �ۼ��Ѵ�
		 */
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ݿ� ���ڿ��� ���Ե�!!");
			System.out.println("���� ���� ������ �߰����� ����");
			return;
		}
		
		System.out.print("���ǿ��� > ");
		String strPubYear = scan.nextLine();
		int intPubYear = 0;
		try {
			intPubYear = Integer.valueOf(strPubYear);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ǿ����� ���ڿ��� ���Ե�!!");
			System.out.println("���� ���� ������ �߰����� ����");
			return;
		}
		
		// 1. Ű����� �Է¹��� �����͸� vo �� �����Ͽ� ����
		BookVO bookVO = new BookVO();
		bookVO.setStrNum(strNum);
		bookVO.setStrName(strName);
		bookVO.setStrWriter(strWriter);
		bookVO.setStrComp(strComp);
		bookVO.setIntPrice(intPrice);
		bookVO.setIntPubYear(intPubYear);
		
		// 2. ������ vo�� bookList �� �߰�
		bookList.add(bookVO);

	}

	@Override
	public void list() {
		// TODO Auto-generated method stub

		System.out.println("==============================================");
		System.out.println("���� ���� �϶�ǥ");
		System.out.println("==============================================");
		System.out.println("ISBN\t������\t���ǻ�\t����\t����\t���ǿ���");
		System.out.println("----------------------------------------------");
		int nSize = bookList.size();
		for(int i = 0 ; i < nSize ; i++) {
			BookVO vo = bookList.get(i);
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getStrComp()+"\t");
			System.out.print(vo.getStrWriter()+"\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
			
		}
	}

	@Override
	public void view(int index) {
		// TODO Auto-generated method stub
		
		System.out.println("=====================================================");
		System.out.println("ISBN : " + bookList.get(index).getStrNum());
		System.out.println("������ : " + bookList.get(index).getStrName());
		System.out.println("���ǻ� : " + bookList.get(index).getStrComp());
		System.out.println("���� : " + bookList.get(index).getStrWriter());
		System.out.println("���� : " + bookList.get(index).getIntPrice());
		System.out.println("���ǿ��� : " + bookList.get(index).getIntPubYear());
		System.out.println("=====================================================");
		
		
	}

	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub
		
		int nSize = bookList.size();
		for (int i = 0 ; i < nSize ; i ++) {
			if(bookList.get(i).getStrName().equalsIgnoreCase(strName)) {
				this.view(i);
				break; // ���ʷ� �߰ߵ� 1���� ������ Ȯ���ϰ� ��ħ
			}
		}

	}

}
