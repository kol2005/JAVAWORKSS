package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_03 {

	public static void main(String[] args) {
		
		//**********************************************
		//����ó���� ���Ͽ�
		//�л� 7���� ��ü�� ����, ����, �ʱ�ȭ�ϴ� �κ�
		//**********************************************
		GradeVO grade01 = new GradeVO();
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		GradeVO grade06 = new GradeVO();
		GradeVO grade07 = new GradeVO();
		
		//*********************
		//������ �Է��ϴ� �κ�
		//*********************
		//grade01 ��ü�� ��������� ���� setting �Ѵ�
		// ������ ���� ����
		grade01.strNum = "001";
		grade01.strName = "ȫ�浿";
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		grade02.strNum = "002";
		grade02.strName = "�̸���";
		grade02.intEng = 88;
		grade02.intMath = 66;
		grade02.intKor = 78;
		
		grade03.strNum = "003";
		grade03.strName = "������";
		grade03.intEng = 98;
		grade03.intMath = 78;
		grade03.intKor = 68;
		
		grade04.strNum = "004";
		grade04.strName = "������1";
		grade04.intEng = 35;
		grade04.intMath = 78;
		grade04.intKor = 54;
		
		grade05.strNum = "005";
		grade05.strName = "������2";
		grade05.intEng = 8;
		grade05.intMath = 58;
		grade05.intKor = 38;
		
		grade06.strNum = "006";
		grade06.strName = "������3";
		grade06.intEng = 68;
		grade06.intMath = 38;
		grade06.intKor = 78;
		
		grade07.strNum = "007";
		grade07.strName = "������4";
		grade07.intEng = 88;
		grade07.intMath = 68;
		grade07.intKor = 98;
		
		
		//*****************************
		//����� List �� ����ϴ� �κ�
		//*****************************
		System.out.println("==========================================");
		System.out.println("����SW�� ����ǥ");
		System.out.println("------------------------------------------");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����");
		System.out.println("------------------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		grade04.gradeList();
		grade05.gradeList();
		grade06.gradeList();
		grade07.gradeList();
		System.out.println("==========================================");
		
		
		
		
				
				
				
	}

}
