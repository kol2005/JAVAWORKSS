package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

public class MethodEx_01 {

	public static void main(String[] args) {
		
		//MethodService Ŭ������ ���ǵ�
		//method() �� ȣ���ϱ� ���ؼ�
		//ms ��� ��ü�� �����ϰ�, �ʱ�ȭ, �����Ѵ�
		//						������ �޼���
		//						��ü�� �ʱ�ȭ, �����ϴµ�
		//						���Ǵ� method
		MethodService ms = new MethodService();
		
		// �� method()�� ȣ�⸸ �Ҽ� �ִ� method �̴�
		//��, void �� method �� ȣ�⸸ �Ҽ� �ִ�
		ms.consoleView();
		
		//�� method() �� int�� return method �̴�
		//return ���� ���ؼ� ��, ���� ����
		// ȣ���� ������ �� ������ �� �ִ�
		//ȣ���� �������� �� ���� ���� ���� ������ ����
		//�� �� �ִ�
		int num = ms.numRet();
		//������ ����� ���� �����Ӱ� �����Ͽ�
		//����� �� �ִ�
		System.out.println("numRet�� return �� �� : " + num);
		
		//method�� return �� ����
		//������ �����ҿ� ����� ���� �д� �Ͱ� ����
		//�����ҿ� ����� ���� 200�� �����Ͽ� num1�� ����
		int num1 = ms.numRet() + 200;
		System.out.println(num1);
		
		// method �� return �ϴ� ���� ������ �������� (�����Ϸ���)
		// �ݵ�� ���� type�� ������ �����ϰ�
		//���� �޾ƾ� �Ѵ�
		//strRet() �޼����� return type �� String �̹Ƿ�
		//�ݵ�� String �� ������ �޾ƾ� �Ѵ�
		String strRet = ms.strRet();
		
		// numRet() method �� return type �� int ���ε�
		// String �� ������ �������� �ϸ�
		//	type missmatch ������ ����
		// �̶��� ���� ���ڿ��� �ٲپ��ָ� �ȴ�
		String strRet1 = ms.numRet() + "";
		
		// String = int return �� method() + String return �� method()
		String strRet2 = ms.numRet() + ms.strRet();
		
		

	}

}
