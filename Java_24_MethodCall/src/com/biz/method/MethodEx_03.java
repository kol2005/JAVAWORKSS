package com.biz.method;

import com.biz.method.service.CalcService;

public class MethodEx_03 {

	public static void main(String[] args) {
		
		// main ���� �� �ϵ��� 
		// CalcService Ŭ������ addNum() method �� ����ؼ�
		// ��� ó���ϰ��� �ϴ� ��
		CalcService cs = new CalcService();
		
		for(int i = 0 ; i < 10 ; i++) {
			// CalcService Ŭ������ ���ǵ�
			// addNum() method �� �������� �ϴ��� �𸣰�����
			// �ƹ�ư 10�� �����϶�
			cs.addNum();
		}

		for(int i =0 ; i < 5 ; i++) {
			// CalcService Ŭ������ ���ǵ�
			// addNum() method �� �������� �ϴ��� �𸣰�����
			// 23�̶�� ������ �����ְ�(�����ϰ�)
			// �ƹ�ư 5�� �����϶�
			cs.addNum(23);
		}
		
		// addNum() method �� �������� �ϴ��� �𸣰�����
		// 32 �� 55 �ΰ��� ������ �����ϰ�
		// �ƹ�ư 1���� �����϶�
		cs.addNum(32,55);
		
		// addNum() method �� �������� �ϴ��� ��ü�����δ� �𸣰�����
		// 32�� 54 �ΰ��� ������ �����ϰ�
		// ���� ������ ������ ������
		// �� ����� ���� ������ �ִ� result ��� ������ ��ƴ޶�
		int result = cs.addNum(32, 54);
		// �׷��� ���� result ��� ���� ���� Ȯ���� ����
		// addNum() method �� �������� �ϴ��� 
		// ������� ������ �Ҽ� �ְ� �ȴ�
		System.out.println(result);
		
	}

}
