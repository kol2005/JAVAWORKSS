package com.biz.grade;

import java.util.Scanner;

public class Grade_02 {

	/*
	 * ������� ������� ������ ����� �������� ����, type�� ������� ���� Ŭ����(Grade_02)�� ����� ��� method ����
	 * ����(�б�, ����, ���� ���)�� �Ҽ� �ִ�
	 * 
	 * � method���� ��������� ���� �����ϸ� �ٸ� method���� �� ���� �о ������ �����Ҽ� �ִ�
	 * 
	 * ������� ���������� public : �ƹ��� ���Ѿ��� ��������� �����Ҽ� �ִ� privaet : ���� Ŭ������ �ִ� method������
	 * �����Ҽ� �ִ�
	 * 
	 * ���� Ŭ������ main() �޼��尡 ������ ��� ��������� static�� ������ �׷��߸��� main() �޼��忡�� ��������� ���� �Ҽ�
	 * �ִ�
	 * 
	 * ���� main() �̿� �ٸ� method���� static�� �پ�� �Ѵ�
	 */

	// 1. intKor �迭������ static ���� ����
	// �迭�� ������ �������� ���� ����
	// �迭�� ���� ����Ҽ� ���� �ܰ�
	private static int[] intKor;

	// Scaaner Ŭ������ scanner static ��ü�� ����
	// ���� scanner�� ����� �� ���� �ܰ�
	private static Scanner scanner;

	public static void main(String[] args) {

		// 2. intKor �迭������ 5���� �迭�� ����
		// �迭�� ����� �غ� �� �ܰ�
		intKor = new int[5];

		// scanner ��ü�� ����ؼ� Ű���忡�� ���� �Է�
		// ���� �� �ְ� �غ� �� �ܰ�
		scanner = new Scanner(System.in);

		// �迭�� ������ŭ �ݺ��� �ڵ�
		for (int i = 0; i < intKor.length; i++) {
			input(i);
		}

		//for (int i = 0; i < intKor.length; i++) {
			//System.out.print(intKor[i] + ", ");
		//}

	}// main end

	public static void input(int index) {
		System.out.print("���� �Է� : ");
		String strnum = scanner.nextLine();
		intKor[index] = Integer.valueOf(strnum);
	}
}
