package com.biz.for_if;

public class If_03 {

	public static void main(String[] args) {
		
		int num = 3246346;
		
		if(num % 2 == 0)System.out.println(num + "�� ¦��");
		if(num % 2 != 0)System.out.println(num + "�� Ȧ��");
		
		/*
		 * ���� i�� 0���� 100���� ���ڸ� 1���� ��Ƽ�...
		 * ���η� ����
		 */
		for(int i = 0; i <= 100 ; i++) {
			/*
			 * ���� i�� ��� ���ڰ� ¦���̸�
			 * i�� ��� ���ڰ� ¦����� ǥ��
			 */
			if(i % 2 == 0)
				System.out.println(i + " �� ¦��!!");
		}
		
	}

}
