package com.biz.classes.book;

public class StudentTest_02 {

	public static void main(String[] args) {
		
		StudentList_02 student1 = new StudentList_02();
		StudentList_02 student2 = new StudentList_02();
		StudentList_02 student3 = new StudentList_02();
		StudentList_02 student4 = new StudentList_02();
		
		student1.strName1 = "책이름1";
		student1.strName2 = "출판사1";
		student1.strName3 = "저자1";
		student1.intbye = 10000;
		
		student2.strName1 = "책이름2";
		student2.strName2 = "출판사2";
		student2.strName3 = "저자2";
		student2.intbye = 20000;
		
		student3.strName1 = "책이름3";
		student3.strName2 = "출판사3";
		student3.strName3 = "저자3";
		student3.intbye = 30000;
		
		student4.strName1 = "책이름4";
		student4.strName2 = "출판사4";
		student4.strName3 = "저자4";
		student4.intbye = 40000;
		
		System.out.println("===============================");
		System.out.println("도서의 개별 정보");
		student1.BookList2();
		
		System.out.println("===============================");
		System.out.println("도서의 개별 정보");
		student2.BookList2();
		
		System.out.println("===============================");
		System.out.println("도서의 개별 정보");
		student3.BookList2();
		
		System.out.println("===============================");
		System.out.println("도서의 개별 정보");
		student4.BookList2();
		
		
		System.out.println("===============================");
		System.out.println("책 리스트");
		System.out.println("도서명\t출판사\t저자\t가격");
		student1.BookList1();
		//System.out.println("-------------------------------");
		student2.BookList1();
		//System.out.println("-------------------------------");
		student3.BookList1();
		//System.out.println("-------------------------------");
		student4.BookList1();
		
		
		
	}

}
