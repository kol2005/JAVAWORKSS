package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_05 {

	public static void main(String[] args) {
		
		/*
		 * �⺻�� ����, String �� ���� ����
		 * �迭�� ���� �ص� ��ü������ �ʱ�ȭ�ϴ�
		 * �ڵ尡 ����ǵ��� ������� �ִ�
		 * 
		 * ������
		 * ����ڰ� ���� Ŭ������ 
		 * �迭�� ������ �Ŀ�
		 * �ݵ�� ����� ��θ� �ʱ�ȭ �ؾ߸�
		 * ���, ������ �����ϴ�
		 */
		StudentVO[] stVO = new StudentVO[100];
		
		//���������� �� ��Ҹ� ��� �ʱ�ȭ�ϴ� ���
		stVO[0] = new StudentVO();
		// :
		// :
		stVO[99] = new StudentVO();
		
		//stVO �迭�� ��� �ʱ�ȭ ��Ű�� �ڵ�
		// for �ݺ����� ����ؼ� �ʱ�ȭ�ϴ� �ڵ�
		for(int i = 0 ; i < 100 ; i++) {
			stVO[i] = new StudentVO();
			
		}
		StudentVO st01 = new StudentVO();
		StudentVO st02 = new StudentVO();
		StudentVO st03 = new StudentVO();
		
		// st01 �̶�� ��������
		//�ڵ�, ������ �������� ���� �����Ҽ� ����!!
		// �Ʒ� �ڵ�� ��Ģ, ������ �����Ҽ� ���� �ڵ��̴�
		for(int i = 1 ; i <= 3 ; i++) {
			//st0i = ???
		}
		

	}

}
