package com.biz.pay;

public class PayMent {

	/*
	 * ȭ��ż� ���
	 */
	public static void main(String[] args) {
		
		int pay = 3785870;
		int mo = 50000;
		// 5������ �ż�
		int count = (int)(pay / mo); //5���� �ż�
		System.out.println(mo+"���� : "+count);
		pay = pay - count * mo; // 5���� �ż��� ������ �ݾ�
		
		// 1������ �ż�
		mo = mo/5; //10000
		count = (int)(pay/mo); // 1������ �ż�
		System.out.println(mo + "���� : "+ count);
		pay = pay - count * mo; // 1������ �ż� ������ �ݾ�
		
		// 5õ���� �ż�
		mo = mo / 2; // 5000����
		count = (int)(pay / mo);
		System.out.println(mo + "���� : " + count);
		pay = pay - count * mo; // 5õ���� �ż� ������ �ݾ�
		
		mo = mo / 5; //1000����
		count = (int)(pay / mo);
		System.out.println(mo + "���� : " + count);
		pay = pay - count * mo; // 1õ���� �ż� ������ �ݾ�
		
		mo = mo / 2; //500����
		count = (int)(pay / mo);
		System.out.println(mo + "���� : " + count);
		pay = pay - count * mo; // 500���� �ż� ������ �ݾ�
		
		mo = mo / 5; //100����
		count = (int)(pay / mo);
		System.out.println(mo + "���� : " + count);
		pay = pay - count * mo; // 100���� �ż� ������ �ݾ�
		
		mo = mo / 2; //50����
		count = (int)(pay / mo);
		System.out.println(mo + "���� : " + count);
		pay = pay - count * mo; // 50���� �ż� ������ �ݾ�
		
		mo = mo / 5; //10����
		count = (int)(pay / mo);
		System.out.println(mo + "���� : " + count);
		pay = pay - count * mo; // 10���� �ż� ������ �ݾ�
		
		mo = mo / 2; //5����
		count = (int)(pay / mo);
		System.out.println(mo + "���� : " + count);
		pay = pay - count * mo; // 5���� �ż� ������ �ݾ�
		
		mo = mo / 5; //1����
		count = (int)(pay / mo);
		System.out.println(mo + "���� : " + count);
		pay = pay - count * mo; // 1���� �ż� ������ �ݾ�
		
		

	}

}
