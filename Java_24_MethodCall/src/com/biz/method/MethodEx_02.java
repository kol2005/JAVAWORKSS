package com.biz.method;

public class MethodEx_02 {

	/*
	 *  1. �ֿܼ� ���ѹα����� ���ڿ��� 10�� ���
	 *  2. ��. �ֿܼ� ���ѹα������� 5�� ����ϰ�,
	 *  	��. ���� �ϳ� ǥ���ϰ�
	 *  	��. �ٽ� �ֿܼ� ���ѹα������� 3�� ���
	 *  3. ������ �ٲ� ���ѹα����� ���ڿ� ��ſ�
	 *  		Republic of Korea �� ���� ������� �ֿܼ� ����ϰ��� �Ѵ� 
	 */
	public static void main(String[] args) {
		
		// 3������ �ڵ带 �����ϰ� �ô���
		//	�� ���ڿ��� ������ ���� ������ ����
		String strNation = "Republic of Korea";
		
		// 1��
		for (int i = 0 ; i < 10 ; i++) {
			//System.out.println("���ѹα�����");
			System.out.println(strNation);
		}
		
		// 2��
		for(int i = 0 ; i <5 ; i ++) {
			//System.out.println("���ѹα�����");
			System.out.println(strNation);
		}
		System.out.println("==========================");
		for(int i = 0; i < 3; i++) {
			//System.out.println("���ѹα�����");
			System.out.println(strNation);
		}

	}

}
