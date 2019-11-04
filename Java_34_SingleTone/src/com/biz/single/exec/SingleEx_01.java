package com.biz.single.exec;

import com.biz.single.service.SingleClassV1;

public class SingleEx_01 {

	public static void main(String[] args) {
		
		// ���� SingleClassV1 �� �����ڷ� ������ �� �� ����
		// �����ڸ� private���� �����߱� ������
		//SingleClassV1 sc = new SingleEx_01();
		
		// �̱��� �������� ������ Ŭ������
		// new �����ڷ� ��ü(�ν��Ͻ�)�� ������ �ʰ�
		// ������ method(getInstance())�� ���ؼ�
		//	������ ����� �Ѵ�
		SingleClassV1 sc1 = SingleClassV1.getInstance();
		SingleClassV1 sc2 = SingleClassV1.getInstance();
		SingleClassV1 sc3 = SingleClassV1.getInstance();
		
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
		
		/*
		 * �̱��� ��ü
		 * ������Ʈ ��ü���� �����ؾ��� � �����͵�
		 * 	��) ����� ����, �ý��� ������
		 * �޸𸮿� ������ �ΰ�
		 * ���� Ŭ������ �����ؼ� ����ϰ��� �Ҷ� ����ϴ� ���
		 * 
		 * �Ϲ����� static class ���� ����
		 * multi thread ȯ�濡�� �����ϰ�
		 * ����Ҽ� �ֵ��� ���� �����ϴ�
		 * multi thread ȯ�濡����
		 * �������� method���� ���ÿ� �Ѱ��� ������ ����
		 * ���ÿ� �����ϴ� ��찡 �߻��� �Ѵ�
		 */

	}

}
