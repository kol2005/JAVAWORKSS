package com.biz.grade;

import com.biz.grade.service.GradeService;

public class Grade_03 {

	public static void main(String[] args) {

		// GradeService Ŭ������ ���� ���� �Ҽ� �ֶǷ�
		// �غ��ϴ� �ܰ�
		// GradeService Ŭ������ �����ڿ���
		// ���� 5�� ������ ��� �迭��������
		// �����Ҽ� �ֵ��� �Ѵ�
		GradeService gs = new GradeService(5);
		gs.input();
		gs.view();
		
	}

}
