package com.biz.classes.student;

public class StudentTest_01 {

	public static void main(String[] args) {
		
		
		StudentList_01 grade01 = new StudentList_01();
		StudentList_01 grade02 = new StudentList_01();
		StudentList_01 grade03 = new StudentList_01();
		StudentList_01 grade04 = new StudentList_01();

		grade01.strNum1 = "001";
		grade01.strName1 = "ȫ�浿1";
		grade01.intNage = 2017;
		grade01.strnClass = "SW����";
		
		grade02.strNum1 = "002";
		grade02.strName1 = "ȫ�浿2";
		grade02.intNage = 2016;
		grade02.strnClass = "SW����";
		
		grade03.strNum1 = "003";
		grade03.strName1 = "ȫ�浿3";
		grade03.intNage = 2018;
		grade03.strnClass = "SW����";
		
		grade04.strNum1 = "004";
		grade04.strName1 = "ȫ�浿4";
		grade04.intNage = 2017;
		grade04.strnClass = "SW����";
		
		
		//list
		System.out.println("====================================");
		System.out.println("dd�б� ����ǥ");
		System.out.println("------------------------------------");
		System.out.println("�й�\t�̸�\t���г⵵\t����\t�г�\t");
		System.out.println("------------------------------------");
		grade01.StudentList();
		grade02.StudentList();
		grade03.StudentList();
		grade04.StudentList();
		System.out.println("====================================");
		System.out.println("�л� ��������");
		System.out.println("------------------------------------");
		grade01.StudentList1();
		System.out.println("====================================");
		System.out.println("�л� ��������");
		System.out.println("------------------------------------");
		grade02.StudentList1();
		System.out.println("====================================");
		System.out.println("�л� ��������");
		System.out.println("------------------------------------");
		grade03.StudentList1();
		System.out.println("====================================");
		System.out.println("�л� ��������");
		System.out.println("------------------------------------");
		grade04.StudentList1();
		System.out.println("------------------------------------");
		
		
		
		System.out.println("====================================");
		
		
	}

}
