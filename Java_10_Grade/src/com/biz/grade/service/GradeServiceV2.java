package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV2 {

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
	public GradeServiceV2(int length) {

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
			this.inputKor(i);
			this.inputEng(i);
			this.inputMath(i);
			this.total(i);
		}
	}// input() end

	// private
	// �� method �� GradeServiceV2 Ŭ������ ���� �ִ�
	// method ������ ȣ���Ҽ� �ֵ�.
	private void inputKor(int index) {
		System.out.print((index + 1) + "���� >> ");
		this.intKor[index] = Integer.valueOf(scan.nextLine());
	}
	

	private void inputEng(int index) {
		System.out.print((index + 1) + "���� >> ");
		this.intEng[index] = Integer.valueOf(scan.nextLine());
	}

	private void inputMath(int index) {
		System.out.print((index + 1) + "���� >> ");
		intMath[index] = Integer.valueOf(scan.nextLine());
	}

	private void total(int index) {
		int intTotal = this.intKor[index];
		intTotal += this.intEng[index];
		intTotal += this.intMath[index];

		this.sum[index] = intTotal;
	}

	public void view() {
		System.out.println("===================================");
		System.out.println("���� �϶�ǥ");
		System.out.println("-----------------------------------");
		System.out.println("����\t����\t����\t����");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\t%d\n", 
					this.intKor[i], this.intEng[i], this.intMath[i], this.sum[i]);
		}
		System.out.println("===================================");
	}

	// ���� ������ �������� �������� ������ ����
	public void sort() {
		for (int i = 0; i < sum.length; i++) {
			for (int j = i + 1; j < sum.length; j++) {
				// �������� ����
				if (sum[i] > sum[j]) {

					int _temp = sum[i];
					sum[i] = sum[j];
					sum[j] = _temp;

				}
			}
		}

	}

}
