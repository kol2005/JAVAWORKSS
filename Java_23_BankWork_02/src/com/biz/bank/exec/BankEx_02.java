package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImpV2;

public class BankEx_02 {

	public static void main(String[] args) {
		
		BankService bs = new BankServiceImpV2();
		Scanner scanner = new Scanner(System.in);
		String bookFile = "src/com/biz/bank/Ȱ�������������.txt";
		//((BankServiceImpV1)bs).bookFile=bookFile;
		
		try {
			/*
			 * ���Ͽ��� ������ ���� �� ������ �����ϴ� ��������
			 * ���� � �������� app �� �ߴܵǸ�
			 * �׵��� ������ ��, ��ݳ����� �޸𸮿��� �ֱ� ������
			 * ��� ����� ������
			 * 
			 * app �� ���� �����ϸ� ó������ 
			 * 		�ٽ� �����Ͱ� �ʱ�ȭ �Ǿ� ������
			 * 
			 * �׷���, ������� �Ϸ�Ǵ� ����
			 * 		���������� �����Ͽ� �������� app�� ���� �����ϸ�
			 * 		���� ���� ���� �������� ������ �� �ֵ��� �� ���̴�
			 * 
			 * �׸���, �ݺ��������� ���� ���� ����
			 * 		������ �о� ����Ʈ�� �����ϴ� ���� ���� �����Ѵ�
			 */
			while(true) {
				
				// ���¿��忡�� ������ �о����
				bs.readBook(bookFile);
				
				System.out.println("=================================================");
				System.out.println("Ȱ��� ���� ���� v1");
				System.out.println("=================================================");
				System.out.println("1.���帮��Ʈ 2.������ȸ 3.�Ա� 4.��� 0.����");
				System.out.println("-------------------------------------------------");
				System.out.print("�Է�>>");
				String strMenu = scanner.nextLine();
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu == 0)break;
				else if(intMenu == 1) {
					//bs.bookList();
				}else if(intMenu == 2) {
					bs.viewAcc();
				}else if(intMenu == 3) {
					// �Ա�ó�� �Ŀ� ���������� �����ϵ��� �ص� ������
					// �ڵ带 �ۼ��ϴ� �߿� �������� method ȣ����
					// ������ ���� �ֱ� ������ input() method ����
					// bookWriter() method �� ȣ���ϵ��� �ڵ带 �ۼ�
					bs.input();
					//bs.bookWriter(bookFile);
				}else if(intMenu == 4) {
					bs.output();
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	

	}

}
