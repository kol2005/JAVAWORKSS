package com.biz.classes;

/*
 * ���� Class_01 �̸��� ���� Ŭ����(class) �Դϴ�.
 * Ŭ������ ù ���ڸ� �빮�ڷ� �����ϴ� �̸��� ������ �Ѵ�
 * �߰��� ���� _ �� �����Ҽ� �ִ�
 * ��ĭ�̳� ��Ÿ Ư�� ���ڴ� �����Ҽ� ����
 * 
 * ���� 3���� method ���� ������ �ֽ��ϴ�
 * method�� ù���ڴ� �ҹ��ڷ� �����ϴ� �̸��� �������Ѵ�
 * �������� ���� ��Ģ�� ����
 * 
 * ���� �� ���� method �� ������ ������,
 * ���� �پ��� ��ɵ��� �ѵ� ���� �����Ҽ� �ֽ��ϴ�
 * ���� ���� method �� static �� �����Ƿ�
 * ���� ������ �ִ� method �� ���� �Ϸ���
 * �ݵ�� ��ü�� ���� ����, �����ؾ� �մϴ�
 */
public class Class_01 {
	
	public String strMember = "���� �������";
	
	public void method_01() {
		System.out.println("���� method 01 �Դϴ�");
		System.out.println(strMember);
	}
	public void method_02() {
		System.out.println("���� method 02 �Դϴ�");
		System.out.println("Class 01�� �ι�° �޼��� �Դϴ�");
	}
	public void method_03() {
		System.out.println("���� method 03 �Դϴ�");
		System.out.println("Class 01�� ����° �޼��� �Դϴ�");
	}
	
}
