package com.biz.classes.user;

public class Exec_new_01 {

	public static void main(String[] args) {
		
		//add() �޼���� static �޼����̴�
		User_01.add();
		
		//1. User_new_01 Ŭ������ un ��ü�� ����
		//2. new User_new_01() : ������ �޼���� 
		//	un ��ü�� ����Ҽ� �ֵ��� �ʱ�ȭ
		User_New_01 un = new User_New_01();
		un.add();
		
		/*
		 * � Ŭ������ �ִ� method �� static Ű���尡 �پ� ������
		 * Ŭ����.method() �������� ȣ���Ͽ� ��밡��������
		 * 
		 * static Ű���尡 ���� method �� 
		 * ��ü�� �����Ͽ� ��ü.method �������� ȣ���ؾ� �Ѵ�
		 * 
		 * �̶� ��ü�� Ŭ������ �븮��(������)������ �Ѵ�
		 * 
		 */

	}

}
