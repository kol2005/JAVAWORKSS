package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_06 {

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
		/*
		 * ���� �� �ڵ�� 
		 * �迭 100���� ���� �����Ҷ��� ������ ����
		 * 
		 * ���� �迭�� ������ �����Ϸ��� �� ���
		 * �迭�� ������ 100�̶�� ���ڰ� �ִ� �ڵ����
		 * ��� ������ �־�� �Ѵ�
		 * 
		 * �Ϻ� ������� ���� �ڵ尡 ������
		 * �׷� ���� ������ �߻��� �� �ִ�
		 * 
		 * �׸� �����ϱ� ���� 
		 * �迭�� ������ ������ �����ϴ� ����� �ִ�
		 */
		int nLength = 200;
		StudentVO[] stVO = new StudentVO[nLength];
		
		//stVO �迭�� ��� �ʱ�ȭ ��Ű�� �ڵ�
		// for �ݺ����� ����ؼ� �ʱ�ȭ�ϴ� �ڵ�
		for(int i = 0 ; i < nLength ; i++) {
			stVO[i] = new StudentVO();
			
		}


	}

}