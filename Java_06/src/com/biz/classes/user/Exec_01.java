package com.biz.classes.user;

public class Exec_01 {

	public static void main(String[] args) {
		
		//�޼��� ȣ��,method call
		/*
		 * 30�� 40 �� ������ ������ ����Ͽ�
		 * �ֿܼ� �����ִ� �ڵ带 
		 * User_01 Ŭ������ add() �޼��带 �����ϰ�
		 * �װ��� �ۼ��� �� �� 
		 * 
		 * main() �޼��忡����
		 * User_01.add() �޼��带 ȣ���Ͽ� �����Ѵ�.
		 * 
		 * method()
		 * �������� ��ɾ�, ��ɹ����� 
		 * �ϳ��� ��ɾ ����ϴ� ��ó��
		 * ���� �ֵ��� �ϴ� ���
		 */
		User_01.add();
		
		/*
		 * User_02.add() �޼��带 5�� ȣ��
		 */
		for(int i = 0 ; i < 5 ; i ++) {
			
			User_02.add();
			
		}
		

	}

}
