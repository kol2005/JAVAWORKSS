package com.biz.bank.service;

import java.util.Scanner;

public class BankServiceV2 {

	int intBalance = 0;
	String strAccNum ;
	
	Scanner scanner = null;
	
	// BankServiceV1 �� ������
	public BankServiceV2() {
		scanner = new Scanner(System.in);
	}
	
	// BankServiceV1 �� �Ǵٸ� ������
	// ���¹�ȣ�� �ܾ��� �Ķ���ͷ� �޴� ������
	public BankServiceV2(String strAccNum,int intBalance) {
		this.strAccNum = strAccNum;
		this.intBalance = intBalance;
		scanner = new Scanner(System.in);
	}
	
	// ���� ���¹�ȣ�� ������
	// �ܾ��� �����ְ� true �� return
	// ���¹�ȣ�� ������ ���ٴ� �޼����� ���̰� false �� return
	public boolean viewAcc() {
		System.out.print("���¹�ȣ>>");
		String strAccKeyIn = scanner.nextLine();
		if(strAccKeyIn.equals(strAccNum)) {
			System.out.println("=================");
			System.out.printf("���¹�ȣ: %s\n",strAccNum);
			System.out.printf("�ܰ� : %d\n", intBalance);
			System.out.println("=================");
		}else {
			System.out.println("���¹�ȣ�� ����!!");
			return false;
		}
		return true;
	}
	
	public void input() throws NumberFormatException{
		System.out.println("�Ա�ó��");
		System.out.println("=============================");
		/*
		 * 1. viewAcc ���� ó��
		 * 2. �Ա��� �ް�
		 * 3. �����ܾ� = �Աݾ� + �����ܾ�
		 */
		//if(strAccKeuIn.equals(strAccNum)) {
			//System.out.println("���¹�ȣ ����");
		
			System.out.print("�Աݾ�>>");
			String strInput = scanner.nextLine();
			int intInput = Integer.valueOf(strInput);
			intBalance += intInput;
	}
	
	// output() method �� ����Ǵ� ���� NumberFormat.... �� �߻��ϸ�
	// ȣ���� ���� �˷����
	public void output() throws NumberFormatException{
		System.out.println("���ó��");
		System.out.println("==============================");
		/*
		 * 2. ����� �ް�
		 * 3. �ܾ� >= ��� : �ܾ� = �ܾ� - ��ݾ�
		 * 		�ܾ� < ��� : ��ݰź�
		 */
		System.out.print("��ݾ�>>");
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		if(intBalance >= intOutput) {
			intBalance -= intOutput;
		}else {
			System.out.println("�ܾ׺���!! ��ݰź�!!");
		}
	}
	
	
}
