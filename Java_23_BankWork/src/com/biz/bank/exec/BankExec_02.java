package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankServiceV1;

public class BankExec_02 {

	public static void main(String[] args) {
		
		BankServiceV1 bs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		//���¹�ȣ
		String strAccNum = "0001";
		// balance : �ܰ�(�����ܰ�)
		int intBalance = 100000;
		
		// ���¹�ȣ�� 0001 �̰�, �ܰ� 1000000 �� ���ο� ���� �ν��Ͻ��� ������
		bs = new BankServiceV1(strAccNum,intBalance);
		
		while(true) {
		
		System.out.println("===========================================");
		System.out.println("���ѷ� ����");
		System.out.println("===========================================");
		System.out.println("1.��ȸ 2.�Ա� 3.��� 0.����");
		System.out.println("-------------------------------------------");
		System.out.print("����>>");
		String strMenu = scanner.nextLine();
		int intMenu = Integer.valueOf(strMenu);
		if(intMenu == 0) break;
		else if(intMenu == 1) {
			// ������ȸ
			bs.viewAcc();
		}else if(intMenu == 2) {
			// �Ա�ó��
			bs.viewAcc();
			bs.input();
		}else if(intMenu == 3) {
			// ���ó��
			bs.viewAcc();
			bs.output();
		}
		}
		System.out.println("��������");

	}

}
