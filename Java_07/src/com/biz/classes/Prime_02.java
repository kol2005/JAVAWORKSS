package com.biz.classes;

import java.util.Scanner;

public class Prime_02 {

	public static void main(String[] args) {
		
		PrimeService pService = new PrimeService();
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Ű����� ���ڸ� �Է¹޾Ƽ�
		 * �Է��� ���ڰ� -1 �̸� ������ �����ϰ�
		 * �׷��� ������ �Է��� ���ڸ� 
		 * 	PrimeService.checkPrime() �޼��忡�� ������
		 * 	�Ҽ����� �Ǻ��ϴ� ����
		 */
		while(true) {
			System.out.print("����(-1 : ����) >> ");
			String strNum = scanner.nextLine();
			
			//������ ��ȯ
			int num = Integer.valueOf(strNum);
			
			//�Է��� ���ڰ� 0���� ������ �ݺ��� ����
			if (num < 0)break;
			
			// PrimeService �� checkPrime() �޼��忡��
			// num ������ ��� ���� ������
			pService.checkPrime(num);
			System.out.println("==========================");
			
		}
		System.out.println("GAME OVER!!");
		
	}

}
