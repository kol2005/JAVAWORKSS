package com.biz.loop;

public class Boolen_01 {

	public static void main(String[] args) {
		
		boolean bYes = 3 == 3;
		System.out.println(bYes);
		
		bYes = 4 == 4; //����? true
		bYes = 4 > 4; //���� ũ��? false
		bYes = 4 >= 4; // ���ų� ũ��? true
		
		//5�� 5�� ���ų�(OR) 4�� 4�� ����?
		//|| = OR
		bYes = 5 == 5 || 4 == 4; //true
		bYes = 5 > 5 || 4 == 4; //false or true = true
		bYes = 5 >= 5 || 4 > 4; //true or false = true
		
		//5�� 5�� ������ 4�� 4�� ����
		// && = AND
		bYes = 5 == 5 && 4 == 4; //true
		bYes = 5 > 5 && 4 == 4; //false and true = false
		bYes = 5 >= 5 && 4 > 4; //true and false = false
		
		//5�� 4���� �۰ų� ����?
		bYes = 5 <= 4; //false
		bYes = 3 < 4; //true
		
		//3�� 4�� ���� �ʳ� = �ٸ���?
		bYes = 3 != 4; //true <>
		System.out.println(bYes);
		
		int n = 1;
		n = n * -1; // -1
		n = n * -1; // 1
		n = n * -1; // -1
		n = n * -1; // 1
		
		//���� bYes �� true ����
		// NOT ����, ���� ���� ����
		// �ѹ� ���� �ɶ����� true�� false�� �ݺ�
		bYes = !bYes; //false
		bYes = !bYes; //true
		bYes = !bYes; //false
		bYes = !bYes; //true
		
		
		
		
		
		
		

	}

}
