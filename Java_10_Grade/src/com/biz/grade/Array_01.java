package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		Random rnd = new Random();

		int total = 0;
		int Avg = 0;

		// rnd ��ü�� ����ؼ� intNum �迭 50����
		// ���� ���ڸ� ä���ֱ�
		// 1 ~ 100 ���� ���� ���� ����...

		// i ���� 0 ~ (intNum.length - 1)

		// i ���� intNum.length - 1 ���� ������
		// intNum[i] = 100 �ڵ带 �����϶�
		// �� ���ȿ� i ���� 1�� �����Ѵ�
		for (int i = 0; i < intNum.length; i++) {
			
			// rnd ��ü�� �ִ� nextInt() method ��
			// 1 ~ 100 ���� �߿�
			// ���� 1���� ����
			// intNum �迭�� i ��°�� ������ �ٿ�
			intNum[i] = rnd.nextInt(100) + 1;

			// intNum �� i ��° ���� �о
			// total �� (���) ���϶�
			total += intNum[i];
		}
		Avg = total / intNum.length;
		System.out.println("��ü �հ� : " + total + " ��� : " + Avg);

	}
}
