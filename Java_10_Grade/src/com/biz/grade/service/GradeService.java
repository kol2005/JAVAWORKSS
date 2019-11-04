package com.biz.grade.service;

import java.util.Scanner;

public class GradeService {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;

	private int[] sum;

	private Scanner scan;

	// ������(�޼���) �����
	// public ���� ����
	// �޼��� �̸��� Ŭ���� �̸��� ����
	// return type �� ����
	// (void, int, String ��� Ű���� ������ ����)
	public GradeService(int length) {

		// ���⿡�� 4�� ��� �迭�������� ����Ҽ� �ֵ���
		// �����ϴ� ��(����)�� ����
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];
		sum = new int[length];
		scan = new Scanner(System.in);

	}// GradeService() end

	// �迭�� ������ŭ �� ������ ������ �Է�
	public void input() {
		for (int i = 0; i < intKor.length; i++) {
			System.out.print((i + 1) + "���� >> ");

			// 1.������ ����Ͽ� 3�ٷ� �ۼ��� �ڵ�
			// String strKor = scan.nextLine();
			// int intKor = Integer,valueOf(strKor);
			// this.intKor[i] = intKor;

			// 2. ���ڿ� ���� ����� ���� �ʰ� 2�ٷ� �ۼ��� �ڵ�
			int intKor = Integer.valueOf(scan.nextLine());
			this.intKor[i] = intKor;

			// 3. ������ ������ �������� �ʰ� 1�ٷ� �ۼ��� �ڵ�
			System.out.print((i + 1) + "���� >> ");
			this.intEng[i] = Integer.valueOf(scan.nextLine());

			//
			System.out.print((i + 1) + "���� >> ");
			intMath[i] = Integer.valueOf(scan.nextLine());

		}
	}// input() end

	public void view() {
		System.out.println("===================================");
		System.out.println("���� �϶�ǥ");
		System.out.println("-----------------------------------");
		System.out.println("����\t����\t����");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\n", intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("===================================");
	}

}
