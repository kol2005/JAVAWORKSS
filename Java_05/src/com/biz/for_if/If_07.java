package com.biz.for_if;

public class If_07 {

	public static void main(String[] args) {
		
		int num = 66;
		
		//&& : AND �¿� ������ ��� true�϶��� ����� true
		if(num % 3 == 0 && num % 6 == 0) {
			System.out.println(num + "�� 3�� ����̸�, 6�� ����̴�");
			
		}
		// || : OR �¿� ������ 1���� true �̸� ����� true
		if(num % 3 == 0 || num % 6 == 0) {
			System.out.println(num + "�� 3�� ����̰ų�, 6�� ����̴�");
			System.out.println(num + "�� 3�� ��� �Ǵ�, 6�� ����̴�");
			
		}

	}

}
