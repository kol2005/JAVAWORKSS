package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_01 {

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
		grade03.strName = "�̸���";
		
		grade03.intEng = 98;
		grade03.intMath = 78;
		grade03.intKor = 68;
		
		System.out.println("001 �л��� ����");
		System.out.println("���� : " + grade01.intKor);
		System.out.println("���� : " + grade01.intEng);
		System.out.println("���� : " + grade01.intMath);
		
		int intsum = grade01.intKor + grade01.intEng + grade01.intMath;
		System.out.println("���� : " + intsum);
				
		System.out.println("002 �л��� ����");
		System.out.println("���� : " + grade02.intKor);
		System.out.println("���� : " + grade02.intEng);
		System.out.println("���� : " + grade02.intMath);
				
		intsum = grade02.intKor + grade02.intEng + grade02.intMath;
		System.out.println("���� : " + intsum);
		
		System.out.println("003 �л��� ����");
		System.out.println("���� : " + grade03.intKor);
		System.out.println("���� : " + grade03.intEng);
		System.out.println("���� : " + grade03.intMath);
				
		intsum = grade03.intKor + grade03.intEng + grade03.intMath;
		System.out.println("���� : " + intsum);
				
				
				
				
				
	}

}
