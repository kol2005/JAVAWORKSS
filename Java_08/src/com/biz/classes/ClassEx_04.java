package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_04 {

	/*
	 * Ŭ������ ��ü�迭�� �������� ���
	 * ��� Ŭ����(String ��)�� �����ϰ��
	 * ��ü�迭�� ��Ҹ� ��� �ʱ�ȭ �۾��� �ؾ�
	 * ������� ����(�б�, ����),�޼��� ����(ȣ��)�� �����ϴ�
	 */
	public static void main(String[] args) {
		
		// 1. ��ü �迭 ����
		StudentVO[] stVO = new StudentVO[10];
		
		// 2. ��ü �迭 ����� �ʱ�ȭ�� �ݵ�� ����
		stVO[0] = new StudentVO();
		stVO[1] = new StudentVO();
		stVO[2] = new StudentVO();
		stVO[3] = new StudentVO();
		stVO[4] = new StudentVO();
		stVO[5] = new StudentVO();
		
		// 3. ��ü����� �������(�Ǵ� �޼���)�� �����ϱ�
		stVO[0].strNum = "001";
		stVO[0].strName = "ȫ�浿";
		
		System.out.println(stVO[0].strName);
		
		//���� index 6�� ��Ҵ� �ʱ�ȭ���� �ʾұ� ������
		//��������� �����ϸ� NullPointer Exception �� �߻�
		stVO[6].strNum = "002";
		
	}

}
