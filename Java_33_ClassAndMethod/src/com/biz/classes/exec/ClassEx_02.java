package com.biz.classes.exec;

import com.biz.classes.service.ClassServiceV1;

public class ClassEx_02 {

	public static void main(String[] args) {
		/*
		 * ���� Ŭ����(ClassEx_02)�� �ƴ�
		 * �ٸ� Ŭ����(ClassServiceV1)�� �ִ� 
		 * method�� ȣ���ϱ�
		 */
		
		ClassServiceV1 cs;// cs ��ü �����ϱ� // ���� cs ��ü�� ����� �� ���� ����!!
		cs = new ClassServiceV1(); // cs ��ü �ʱ�ȭ, ���� // cs�� �ν��Ͻ��� �Ǿ��� //cs��ü�� ����� �� �ִ� ����
		//==> ClassServiceV1 Ŭ������ ����� method�� ȣ���� �� �ִ�
		
		String strName = "ȫ�浿";
		cs.getName(strName);
		System.out.println("strName:"+strName);
		
		String[] strNames = new String[2];
		strNames[0] = "�̸���";
		strNames[1] = "������";
		
		System.out.println("strNames[0] : "+strNames[0]);
		System.out.println("strNames[1] : "+strNames[1]);
		
		// getName(String[] strNames) method ȣ���ϱ�
		cs.getName(strNames);
		System.out.println("strNames[0] : "+strNames[0]);
		System.out.println("strNames[1] : "+strNames[1]);
		
		
	}

}
