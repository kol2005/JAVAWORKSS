package com.biz.java;

public class Var_05 {

	public static void main(String[] args) {
		
		//���������Ҷ� 0���� ����
		//== ��������� clear ��� �Ѵ�.
		int num1 = 0;
		
		/*
		 * 1. num1�� ����� ��(0)�� CPU�� ����
		 * 2. ����10�� CPU�� ����
		 * 3. �� ��(0,10)�� ����
		 * 4. �� ����� num1 ������ ����
		 * ==> num1�� ���� 10 �������Ѷ�
		 */
		num1 = num1+10;
		
		/*
		 * 1. num1�� ����� ��(10)�� CPU�� ����
		 * 2. ����5�� cpu�� ����
		 * 3. �� ��(10,5)�� �����ϰ�
		 * 4. �� ����� num1 ������ ����
		 * ==> num1�� ���� 5 �������Ѷ�
		 */
		num1 = num1+5;
		

	}

}