package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

/*
 * method�� ������
 * 
 * ��ü������ Ư¡�� �Ѱ�����
 * method�� �Ű������� type, ������ �ٸ����
 * method�� �̸��� ���� �ߺ��ؼ� ���� �Ҽ� �ִ� Ư¡
 * 
 * void add(int n1, int n2)��
 * void add(float f1, float2)��
 * ���� �̸������� �Ű����� type�� �ٸ��Ƿ�
 * �ٸ� method�� �ν��� �Ѵ�
 * 
 * �߻�ȭ, ĸ��ȭ, �������а� ���Ҿ�
 * ��ü������ �߿��� Ư¡�̴�.
 */
public class MethodEx_05 {

	public static void main(String[] args) {
		
		MethodService ms = new MethodService();
		
		//void add() �� ȣ��
		ms.add();
		// void add(int num)�� ȣ��
		ms.add(100);
		//void add(int num1 , int num2 )�� ȣ��
		ms.add(30,40);
		//void add (float f1, float f2) �� ȣ��
		ms.add(30.0f,40.0f);

	}

}
