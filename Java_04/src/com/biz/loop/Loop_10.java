package com.biz.loop;

public class Loop_10 {

	public static void main(String[] args) {
		/*
		 * 2���� ����(num1, num2)�� �����Ͽ�
		 * num1 ���� num2 ������ ������ ���
		 *  
		 */
		
		int num1 = 5;
		int num2 = 255;
		
		int sum = 0;
		for (int i = num1 ; i <= num2 ; i++) {
			sum += i;
		
		}
		System.out.printf("%d ���� %d ������ ���� : %d\n",num1,num2,sum);
		
	}

}
