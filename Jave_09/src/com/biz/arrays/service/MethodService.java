package com.biz.arrays.service;

import java.util.Random;
import java.util.Scanner;

public class MethodService {

	private int intSum;

	/*
	 * method �� ���� �Ҷ� (method �ڵ带 �ۼ��Ҷ�) void method() : return ���� �ְų� ���ų� ������ �����ϴ�
	 * Ű���� method() int method() String method() float method() boolean method()
	 * double method() char method() ScoreVO method() StudentVO method() BookVO
	 * method() : : : ������ �����ϴ� Ű���带 ������(Varriable Type)�̶�� �ϴµ� ���� Ű���尡 method() ����
	 * ���� ��Ÿ���� return tupe �̶�� �Ѵ� �̶� �� Ű����� return ���� ���Ե� ���� ������ ���谡 �ִ� int method()
	 * { return 0;} String method() { return "���ѹα�"; } float method() { return false
	 * ; } ScoreVO method() { return sVO ; }
	 * 
	 * return �� ; ���忡�� ���� ������ Ÿ��(date type) �� method() ���ǹ��� �ۼ��� �ش�
	 *
	 * method type �� double ���ε� return ���� ���Ե� ���� "00" ���ڿ��̹Ƿ� �� �ڵ�� syntax error�� ����
	 * double method() { return "00" ; }
	 */

	// void �� method �̹Ƿ� return ���� ���û����̴�
	// ��� �ȴ�!!
	public void consoleView() {
		System.out.println("���� �ֿܼ� ǥ���ϴ� method()");
		return;
	}

	// return num; ������
	// num ������ date type �� int ���̴�
	// ���� �� method�� ���𹮿���
	// int Ű���尡 ���ԵǾ�� �Ѵ�
	// ���� return ���� ���Ե� ���� ������
	// �ּ��� return 0; �̶�� �����̶� �ϼ��Ǿ�� �Ѵ�
	public int numRet() {
		int num = 100 + 200 + 300;
		return num;
	}

	// method �� return type�� String(���ڿ�)���̹Ƿ�
	// return ���ڿ� ; ������ ������ �ϼ��Ǿ�� �Ѵ�
	// ���� return ���� ���Ե� ���� ������
	// return ""; �Ǵ� return null; ������
	// �����̶� �ϼ��Ǿ�� �Ѵ�!!
	public String strRet() {
		// return "";
		return "�츮���󸸼�";
	}

	// method return ���� intSum ������ ���ԵǾ� �ִ�
	// intSum ������ �� Ŭ������ ���������
	// ������ (Varriable type)�� int return type�� �־�� �Ѵ�
	public int getIntSum() {
		return intSum;
	}

	public int getintsum(int num1, int num2) {
		return num1 * num2;
	}

	public void add() {
		System.out.println("�Ű������� ���� method");
	}

	public void add(int num) {
		System.out.printf("�Ű����� 1�� : %d\n", num);
	}

	public void add(int num1 , int num2) {
		int sum = num1 + num2;
		System.out.println("�ΰ��� �Ű����� �� : "+sum);
	}
	
	public void add(float f, float f2) {
		float sum = f + f2;
		System.out.printf("�� �Ǽ��� �� : %f", sum);
	}
	public void ex() {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
	}
	
}
