package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("================");
		System.out.println("ȸ������");
		System.out.println("�̸�>> ");
		String strName = scanner.nextLine();
		
		System.out.print("��ȭ��ȣ>> ");
		String strTel = scanner.nextLine();
		
		System.out.println("�ּ�>> ");
		String strAddr = scanner.nextLine();
		
		System.out.println("-----------------");
		System.out.println("=================");
		System.out.println("ȸ�� ���� ȯ��");
		System.out.println("�̸� : " + strName);
		System.out.println("��ȭ : " + strTel);
		System.out.println("�ּ� : " + strAddr);
				

	}

}
