package com.biz.classes.grade;

import java.util.Scanner;

public class GradeEx_01 {

	/*
	 * Ű����� �� �л��� ���������� �Է¹��� ��
	 * GradeVO Ŭ������ ��ü�� �����ϰ�
	 * �Էµ� ������ �ֿܼ� Ȯ���غ���
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("�������� �Է�");
		System.out.println("-----------------------");
		System.out.print("�й� >> ");
		String strNum = scanner.nextLine();
		
		System.out.print("�̸� >> ");
		String strName = scanner.nextLine();
		
		System.out.print("���� >> ");
		String strKor = scanner.nextLine();
		
		System.out.print("���� >> ");
		String strEng = scanner.nextLine();
		
		System.out.print("���� >> ");
		String strMath = scanner.nextLine();
		
		GradeVO grade = new GradeVO();
		grade.strNum = strNum;
		grade.strName = strName;
		
		//strKor ���� ���ڿ��� ���ڰ� ����ִ�
		//?? scanner.nextLine() �޼���� 
		// Ű����� �Է��� ��� ����
		// ���ڿ��� ��ȯ�Ͽ� �Է¹ޱ� ������
		grade.intKor = Integer.valueOf(strKor);
		grade.intEng = Integer.valueOf(strEng);
		grade.intMath = Integer.valueOf(strMath);
		
		

	}

}
