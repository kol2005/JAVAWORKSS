package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankServiceV2;

public class BankExec_04 {

	public static void main(String[] args) {
		
		BankServiceV2 bs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		//���¹�ȣ
		String strAccNum = "0001";
		// balance : �ܰ�(�����ܰ�)
		int intBalance = 100000;
		
		// ���¹�ȣ�� 0001 �̰�, �ܰ� 1000000 �� ���ο� ���� �ν��Ͻ��� ������
		bs = new BankServiceV2(strAccNum,intBalance);
		
		while(true) {
		
		System.out.println("===========================================");
		System.out.println("���ѷ� ����");
		System.out.println("===========================================");
		System.out.println("1.��ȸ 2.�Ա� 3.��� 0.����");
		System.out.println("-------------------------------------------");
		System.out.print("����>>");
		String strMenu = scanner.nextLine();
		int intMenu = Integer.valueOf(strMenu);
		
		if(intMenu == 0) {
			System.out.println("��������");
			break;
		}
		/*
		 * Java ������
		 * switch(���ڿ�, ����, ����...) ����
		 * ������ ���ڿ��� ��� �ణ�� ���� �߻� ���ɼ� ����
		 */
		switch (intMenu) {
		case 1:// label, goto ����� ����Ҷ� ���� Ű����
			System.out.println("������ȸ");
			break;
		case 2:
			System.out.println("�Ա�ó��");
			break;
		case 3:
			System.out.println("���ó��");
			break;

		
		
		}
			
		}
		

	}

}
