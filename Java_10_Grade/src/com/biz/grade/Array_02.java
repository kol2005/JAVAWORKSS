package com.biz.grade;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {
		int[] intKor = new int[5];
		int[] intEng = new int[5];

		Random rnd = new Random();

		int sumKor = 0;
		int sumEng = 0;
		System.out.println("Kor\tEng");
		System.out.println("------------------------------");
		for (int i = 0; i < intKor.length; i++) {

			// 51~100���� ���� 1���� �����϶�
			// intKor[i] = rnd.nextInt(50)+51;
			// 0~99���� ����1���� �����϶�
			// rnd.nextInt(100);
			
			// 1 ~ 100 ���� ���ڸ� 1�� �����϶�
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			System.out.printf("%d\t%d\n", intKor[i], intEng[i]);

			sumKor += intKor[i];
			sumEng += intEng[i];
		}
		System.out.println("-------------------------------");
		System.out.println(sumKor + "\t" + sumEng);
		System.out.println("===============================");
	}
}
