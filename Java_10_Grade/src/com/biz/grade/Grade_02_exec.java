package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {

	private static int[] intKor;

	private static Scanner scanner;

	public static void main(String[] args) {
		intKor = new int[5];
		scanner = new Scanner(System.in);
		for (int i = 0; i < intKor.length; i++) {
			input(i);
		}
		// main()���� �迭�� ������ŭ �ݺ�������
		// view() �޼��忡�� ������ ǥ���϶�� ����
		for (int i = 0; i < intKor.length; i++) {
			view(i);
		}

		// �ƿ� intKor �迭�� ��°�� view() �޼��忡�� ������
		// �˾Ƽ� ǥ���϶�� ����
		view(intKor);
	}// main end

	public static void input(int index) {
		System.out.print((index + 1) + "���� ���� : ");
		String strnum = scanner.nextLine();
		intKor[index] = Integer.valueOf(strnum);
	}

	public static void view(int index) {
		System.out.println((index + 1) + "�� ���� : " + intKor[index]);
	}

	public static void view(int[] intKor) {
		for (int i = 0; i < intKor.length; i++) {
			System.out.println((i + 1) + "�� : " + intKor[i]);
		}
	}
}
