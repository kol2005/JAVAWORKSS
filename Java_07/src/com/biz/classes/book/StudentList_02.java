package com.biz.classes.book;

public class StudentList_02 {

	public String strName1;//도서명
	public String strName2;//출판사
	public String strName3;//저자
	public int intbye;//가격
	
	public void BookList1() {
		
		//System.out.println("");
		System.out.printf("%s\t%s\t%s\t%d원\n",strName1,strName2,strName3,intbye);
		
	}
	public void BookList2() {
		
		//System.out.println("책의 정보");
		System.out.println("===============================");
		System.out.println("책 이름 : " + strName1);
		System.out.println("출판사 : " + strName2);
		System.out.println("저자 : " + strName3);
		System.out.println("가격 : " + intbye + "원");
		System.out.println("===============================");
		
		//System.out.printf("%s\t%s\t%s\t%d\n",strName1,strName2,strName3,intbye);
		
	}
	
}
