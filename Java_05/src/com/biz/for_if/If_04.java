package com.biz.for_if;

public class If_04 {

	public static void main(String[] args) {
		
		/*
		 * 1���� 100���� �����߿���
		 * ¦���� ���� ���Ͻÿ�
		 */
		
		//���� ������ ������ ���� �� �ʱ�ȭ
		int sum = 0;
		//���ڸ� 1���� 100���� ����
		for(int i = 1 ; i <= 100 ; i++) {
			//������ ���ڰ� ¦���ΰ�?
			if (i % 2 == 0) // i ���� ��򰡿� ��� ����(����)
			{
				//¦���̸�  sum ������ ����(����)
				sum += i ;
			}
		}
		System.out.println("1~100 ���� ¦���� �� : " + sum);
	}
}