package com.biz.grade;

import java.util.Random;

public class Array_03 {

	public static void main(String[] args) {

		int[] intNum = new int[50];

		// ������ ���� ���鶧 ����� ������ �غ�
		Random rnd = new Random();

		System.out.println("==========================");
		System.out.println("1 ~ 100���� ¦���� ǥ�� 50ȸ");
		for (int i = 0; i < intNum.length; i++) {
			
			// 1��
			// ���� ���� �����ؼ�
			// num ������ ���� �ߴٰ�
			// num ������ ����� ����
			// �ٽ� intNum �� i ��° ��ҿ� ����
			//int num = rnd.nextInt(100)+1;
			//intNum[i] = num;
			
			// 2��
			// ���� ���� �����ؼ�
			// ���� intNum �� i ��° ��ҿ� ����
			intNum[i] = rnd.nextInt(100) + 1;
			
			// �迭�� ����� ��ҵ� �߿�
			// ¦������ ����Ʈ�� ������
			if (intNum[i] % 2 == 0) {
				// if(intNum[i] == 2) break;
				System.out.println(i + " ��° : " + intNum[i]);
			}
		}
		System.out.println("==================================");
		// �迭�� ����� ��ҵ� �߿�
		// ¦������ ���� ���ΰ�?
		int intSum = 0;
		for(int i = 0;i<intNum.length;i++) {
			if(intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}
		System.out.println("¦������ �� : " + intSum);

	}

}
