package com.biz.string.exec;

import java.util.Random;

public class StringEx_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		/*
		 * ���� ���� 10���� �����ϴ� �ݺ�������
		 * ������ ������ 3�� ��ġ ���ڵ��� ���� ���Ͻÿ�
		 * (������ġ�� 0���� �̴�)
		 */
		int index = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int rNum = rnd.nextInt();
			if(rNum < 0) {rNum *= -1;
			}
			String strNum = rNum + "";
			String[] strNum1 =strNum.split("");
			System.out.println("������ : "+strNum);
			System.out.println("3����ġ �� : "+strNum1[3]);
				index += Integer.valueOf(strNum1[3]);
				
			System.out.println("3����ġ �հ� : "+index);
			System.out.println("-----------------------");
		}
		int nSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int rNum = rnd.nextInt();
			if(rNum < 0) {rNum *= -1;
			}
			String strNum = rNum + "";
			int intNum = Integer.valueOf(strNum.substring(3,4));
			nSum += intNum;
			System.out.println(rNum);
			System.out.printf("%4d\n",intNum);
			System.out.println("--------------------");
		}
		System.out.println("�հ� : " + nSum);
		

	}

}
