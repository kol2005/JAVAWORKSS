package com.biz.classes;

public class Object_01 {

	public static void main(String[] args) {
		
		// Ŭ������ ��ü�� ����, ����, �ʱ�ȭ
		// ��ü(class_01)�� �̸���
		//�Ϲ������Τ� Ŭ���� �̸��� ù���ڸ� �ҹ��ڷ� �Ͽ�
		//����Ѵ�
		//�߰��� ��ü�� �����Ҷ��� �ڿ� ���ڸ� �����ϱ⵵ �Ѵ�
		Class_01 class_01 = new Class_01();
		Class_01 class_01_01 = new Class_01();
		Class_01 class_01_02 = new Class_01();
		Class_01 class_01_03 = new Class_01();
		
		class_01.method_01();
		class_01_01.strMember = "���ѹα�";
		class_01_01.method_01();
		
		class_01.method_01();
		

	}

}
