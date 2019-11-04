package com.biz.classes.student;

public class StudentTest_01 {

	public static void main(String[] args) {
		
		
		StudentList_01 grade01 = new StudentList_01();
		StudentList_01 grade02 = new StudentList_01();
		StudentList_01 grade03 = new StudentList_01();
		StudentList_01 grade04 = new StudentList_01();

		grade01.strNum1 = "001";
		grade01.strName1 = "홍길동1";
		grade01.intNage = 2017;
		grade01.strnClass = "SW개발";
		
		grade02.strNum1 = "002";
		grade02.strName1 = "홍길동2";
		grade02.intNage = 2016;
		grade02.strnClass = "SW개발";
		
		grade03.strNum1 = "003";
		grade03.strName1 = "홍길동3";
		grade03.intNage = 2018;
		grade03.strnClass = "SW개발";
		
		grade04.strNum1 = "004";
		grade04.strName1 = "홍길동4";
		grade04.intNage = 2017;
		grade04.strnClass = "SW개발";
		
		
		//list
		System.out.println("====================================");
		System.out.println("dd학교 성적표");
		System.out.println("------------------------------------");
		System.out.println("학번\t이름\t입학년도\t전공\t학년\t");
		System.out.println("------------------------------------");
		grade01.StudentList();
		grade02.StudentList();
		grade03.StudentList();
		grade04.StudentList();
		System.out.println("====================================");
		System.out.println("학생 개인정보");
		System.out.println("------------------------------------");
		grade01.StudentList1();
		System.out.println("====================================");
		System.out.println("학생 개인정보");
		System.out.println("------------------------------------");
		grade02.StudentList1();
		System.out.println("====================================");
		System.out.println("학생 개인정보");
		System.out.println("------------------------------------");
		grade03.StudentList1();
		System.out.println("====================================");
		System.out.println("학생 개인정보");
		System.out.println("------------------------------------");
		grade04.StudentList1();
		System.out.println("------------------------------------");
		
		
		
		System.out.println("====================================");
		
		
	}

}
