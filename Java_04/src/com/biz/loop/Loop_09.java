package com.biz.loop;

public class Loop_09 {

	public static void main(String[] args) {
		
		/*
		 * ǥ�� for �ݺ����� ���౸��
		 * 1. int i = 0 : ī��Ʈ ���� �ʱ�ȭ ���� 1���� ����
		 * 2. i < 10 : ī��Ʈ����(i) ���� �������ǰ� �� ���̸� ��ɽ���
		 * 3. ���̸� system.out.println(i) ��ɹ� ����
		 * 4. i++ : ī��Ʈ ���� 1����
		 * 
		 * 1~4���� i < 10 �� true �� ���� �ݺ�����
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("====================");
		int sum = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
			sum += i; //sum = sum + 1
		}
		System.out.println("1~10���� ���� : " + sum);
		
		sum = 0;
		int i = 1;
		
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		
		

	}

}
