package com.biz.bank.exec;

import java.util.Scanner;

public class BankExec_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//���¹�ȣ
		String strAccNum = "0001";
		// balance : �ܰ�(�����ܰ�)
		int intBalance = 100000;
		
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
		}else if(intMenu == 1) {
			System.out.println("������ȸ");
			/*
			 * 1. ���¹�ȣ�� �Է¹ޱ�
			 * 2. ��ġ�ϴ� ���¹�ȣ�� ������
			 * 3. ���³����� �����ֱ�
			 */
			System.out.print("���¹�ȣ>>");
			String strAccKeyIn = scanner.nextLine();
			if(strAccKeyIn.equals(strAccNum)) {
				System.out.println("=================");
				System.out.printf("���¹�ȣ: %s\n",strAccNum);
				System.out.printf("�ܰ� : %d\n", intBalance);
				System.out.println("=================");
			}else {
				System.out.println("���¹�ȣ�� ����!!");
			}
		}else if(intMenu == 2) {
			System.out.println("�Ա�ó��");
			/*
			 * 1. ���¹�ȣ �Է�
			 * 2. ���¹�ȣ ��ġ�ϸ� �Աݾ� �Է�
			 * 3. �����ܾ� = �Աݾ� + �����ܾ�
			 */
			System.out.print("���¹�ȣ>>");
			String strAccKeyIn = scanner.nextLine();
			if(strAccKeyIn.equals(strAccNum)) {
				System.out.println("=================");
				System.out.printf("���¹�ȣ: %s\n",strAccNum);
				System.out.printf("�ܰ� : %d\n", intBalance);
				System.out.println("=================");
				System.out.print("�Աݾ�>>");
				String strInput = scanner.nextLine();
				int intInput = Integer.valueOf(strInput);
				intBalance += intInput;
				
			}else {
				System.out.println("���¹�ȣ�� ����!!");
			}
		}else if(intMenu == 3) {
			System.out.println("���ó��");
			/*
			 * 1. ���¹�ȣ �Է�
			 * 2. ��ġ�ϸ� ��ݱ׾� �Է�
			 * 3. �ܾ�(�ܰ�) >= ��ݱݾ� �̸� ���ó��
			 * 4. �ܾ�(�ܰ�) < ��ݱݾ� �̸� ��ݰź�
			 */
			System.out.print("���¹�ȣ>>");
			String strAccKeyIn = scanner.nextLine();
			if(strAccKeyIn.equals(strAccNum)) {
				System.out.println("=================");
				System.out.printf("���¹�ȣ: %s\n",strAccNum);
				System.out.printf("�ܰ� : %d\n", intBalance);
				System.out.println("=================");
				System.out.print("��ݾ�>>");
				String strOutput = scanner.nextLine();
				int intOutput = Integer.valueOf(strOutput);
				if(intBalance >= intOutput) {
					intBalance -= intOutput;
				}else {
					System.out.println("�ܾ׺���!! ��ݺҰ�!!");
				}
			}else {
				System.out.println("���¹�ȣ�� ����!!");
			}
		}
		
	}

}
