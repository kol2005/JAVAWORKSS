package com.biz.grade;

import java.util.Scanner;

public class Grade_01 {

	public static void main(String[] args) {

		/*
		 * ������ �迭 intKor�� 5�� ���� ������ �迭�� �����ϰڵ�.. Ű����(��ɾ�) �迭�� �̸� ������ �迭 5���� ����
		 */
		int[] intKor = new int[5];

		// Scanner Ŭ������ ����ϰڴ�
		// scanner ��ü�� �����ϰڴ�
		// scanner �� �ý��۰� �����϶�
		Scanner scanner = new Scanner(System.in);
		
		//�迭�� ������ŭ �ݺ��� �ڵ�
		for (int i = 0; i < intKor.length; i++) {
			System.out.print("���� �Է� : ");
			String strnum = scanner.nextLine();
			intKor[i] = Integer.valueOf(strnum);
		}

		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i] + ", ");
		}

	}
}
