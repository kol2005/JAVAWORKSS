package com.biz.for_if;

public class If_05 {

	public static void main(String[] args) {
		
		int num = 33;
		
		/*
		 * if �� else �� ���� ����ϴ� ��ɹ�
		 * if(������ true) true ���� ��ɽ���
		 * else true�� �ƴ� ���� ��ɽ���
		 * 
		 * if Ű���忡 ������ ������ ���� �����߿���
		 * 	true�� ��찡 �� 1���� �ִ� ����
		 * else�� ������ ��� ����
		 */
		// num ������ ��� ���� 3�� ����̳�?
		if(num % 3 == 0) System.out.println(num + "�� 3�� ���");
		
		//�ƴϸ�(true)�� �ƴϸ� == (false) �� ������ �ƴϴ�!!
		else 
			System.out.println(num + "�� 3�� ����� �ƴϴ�!!");
		
		if(num % 2 == 0)
			System.out.println(num + "�� ¦��!!");
		else {
			//num % 2 �� 0�� �ƴѰ��
			//�翬�� Ȧ�� �̰�����
			//Ȧ��!! �̴� ��� �������� ����!!
			//¦���� �ƴϴ� ��� ��������
			System.out.println(num + "�� Ȧ��!!");
		//====================
			//Ȧ����� ǥ�����ٴ� ¦���� �ƴϴٶ�� ǥ����
			//�� ���� ǥ���̴�
			System.out.println(num + "�� ¦���� �ƴϴ�!!");
			
		}
			
		if(num % 2 == 1)
			System.out.println(num + "�� Ȧ���̴�!!");
		else
			System.out.println(num + "�� Ȧ���� �ƴϴ�!!");
		
		

	}

}
