package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_02 {

	public static void main(String[] args) {
		
		GradeVO grade01 = new GradeVO();
		
		//grade01 ��ü�� ��������� ���� setting �Ѵ�
		// ������ ���� ����
		grade01.strNum = "001";
		grade01.strName = "ȫ�浿";
		
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		GradeVO grade02 = new GradeVO();
		grade02.strNum = "002";
		grade02.strName = "�̸���";
		
		grade02.intEng = 88;
		grade02.intMath = 66;
		grade02.intKor = 78;
		
		GradeVO grade03 = new GradeVO();
		grade03.strNum = "003";
		grade03.strName = "������";
		
		grade03.intEng = 98;
		grade03.intMath = 78;
		grade03.intKor = 68;
		
		System.out.println("==========================================");
		System.out.println("����SW�� ����ǥ");
		System.out.println("------------------------------------------");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����");
		System.out.println("------------------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		System.out.println("==========================================");
		
		
		
		
				
				
				
	}

}
