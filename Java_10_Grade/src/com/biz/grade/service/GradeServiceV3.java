package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV3 {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;

	private int[] sum;
	private int[] avg;

	private Scanner scan;

	// ������(�޼���) �����
	// public ���� ����
	// �޼��� �̸��� Ŭ���� �̸��� ����
	// return type �� ����
	// (void, int, String ��� Ű���� ������ ����)
	public GradeServiceV3(int length) {

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
		this.sum[index] = intTotal/3;
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
	// ���� ������ �������� �������� ������ �����ߴ���
	// ������ �� ������ �Ǿ��µ�,
	// ���������� ������ ������ ���׹����� �Ǿ���
	
	// ������ 
	// ������ ������ �ٲٸ鼭
	// �� ������ ������ ������� �ʾƼ� �߻��� ����
	
	// ������ ������ �ٲٸ鼭, ������ ������ �ٲٴ�
	// �ڵ�� ������ ����
	public void sort() {
		for (int i = 0; i < sum.length; i++) {
			for (int j = i + 1; j < sum.length; j++) {
				// �������� ����
				if (sum[i] > sum[j]) {

					// �迭�� �� ��ҿ� ����� ������
					// ���� �ٲٴ� �ڵ�
					int _temp = sum[i];
					sum[i] = sum[j];
					sum[j] = _temp;
					
					//��������
					_temp = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _temp;

					//��������
					_temp = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _temp;

					//��������
					_temp = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _temp;

				}
			}
		}

	}

}
