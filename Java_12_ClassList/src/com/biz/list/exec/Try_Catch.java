package com.biz.list.exec;

public class Try_Catch {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		// ���ڿ��� ���ڸ� ������ �ٲپ ������ ����
		try {
			num1 = Integer.valueOf("30");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�Է��� ���� ���ڿ��� ���Ե� ���ڷ� ��ȯ���� ����");
		}
		try {
			num2 = Integer.valueOf("40 ");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�Է��� ���� ���ڿ��� ���Ե� ���ڷ� ��ȯ���� ����");
		}
		try {
			num3 = Integer.valueOf(" 50");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�Է��� ���� ���ڿ��� ���Ե� ���ڷ� ��ȯ���� ����");
		}
		
		
		int sum = num1+num2+num3;
		System.out.println(sum);

	}

}
