package com.biz.classes.book;

public class StudentTest_02 {

	public static void main(String[] args) {
		
		StudentList_02 student1 = new StudentList_02();
		StudentList_02 student2 = new StudentList_02();
		StudentList_02 student3 = new StudentList_02();
		StudentList_02 student4 = new StudentList_02();
		
		student1.strName1 = "å�̸�1";
		student1.strName2 = "���ǻ�1";
		student1.strName3 = "����1";
		student1.intbye = 10000;
		
		student2.strName1 = "å�̸�2";
		student2.strName2 = "���ǻ�2";
		student2.strName3 = "����2";
		student2.intbye = 20000;
		
		student3.strName1 = "å�̸�3";
		student3.strName2 = "���ǻ�3";
		student3.strName3 = "����3";
		student3.intbye = 30000;
		
		student4.strName1 = "å�̸�4";
		student4.strName2 = "���ǻ�4";
		student4.strName3 = "����4";
		student4.intbye = 40000;
		
		System.out.println("===============================");
		System.out.println("������ ���� ����");
		student1.BookList2();
		
		System.out.println("===============================");
		System.out.println("������ ���� ����");
		student2.BookList2();
		
		System.out.println("===============================");
		System.out.println("������ ���� ����");
		student3.BookList2();
		
		System.out.println("===============================");
		System.out.println("������ ���� ����");
		student4.BookList2();
		
		
		System.out.println("===============================");
		System.out.println("å ����Ʈ");
		System.out.println("������\t���ǻ�\t����\t����");
		student1.BookList1();
		//System.out.println("-------------------------------");
		student2.BookList1();
		//System.out.println("-------------------------------");
		student3.BookList1();
		//System.out.println("-------------------------------");
		student4.BookList1();
		
		
		
	}

}
