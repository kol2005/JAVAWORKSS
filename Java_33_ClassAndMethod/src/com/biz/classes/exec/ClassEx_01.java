package com.biz.classes.exec;

public class ClassEx_01 {

	// main() method �� �ִ� Ŭ������ �������(�ʵ�)������
	// ������ ����
	// static ���� ������ method����
	// �ʵ庯���� ������ �Ϸ���
	// �ʵ庯���� static���� ������ �ؾ��Ѵ�
	static String strName = "ȫ�浿";
	
	// main() �� static method �̸�
	// ������Ʈ�� �����ϸ�(Run) JVM�� ���ϸ��� ã�Ƽ�
	// �����ϴ� method
	// ������ method
	
	public static void main(String[] args) {
		
		strName = "�̸���";
		getName(strName);
		System.out.println(strName);
	}
	/*
	 * main() method���� getName() method�� ȣ���ϸ鼭
	 * strName ������ �Ķ���ͷ� �����Ͽ���
	 * �̶� strName ���� �̸������ �ƹ��� �������
	 * strName ������ ��� ���� getName() method�� ���޵ȴ�
	 * 
	 * ���޵� �Ķ����(��)��
	 * getName() �޼����� �Ű������� ��ܼ� 
	 * method ���η� ����ȴ�
	 * getName() �ż��� ���ο��� strName ������ ���� �����ص�
	 * main() method ���� �����ϴ� strName ������ ����
	 * �ƹ��� ������ ����
	 * ==> Call By Value
	 */
	
	// static���� ����� method����
	// �ٸ� method�� ȣ���Ϸ���
	// ȣ��Ǵ� method�� ��� static���� ����Ǿ�� �Ѵ�
	public static void getName (String strName) {
		// STring strName ������ ����� �����...
		System.out.println(strName);
		strName = "������";
	}
}
