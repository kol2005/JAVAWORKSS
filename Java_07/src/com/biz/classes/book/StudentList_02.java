package com.biz.classes.book;

public class StudentList_02 {

	public String strName1;//������
	public String strName2;//���ǻ�
	public String strName3;//����
	public int intbye;//����
	
	public void BookList1() {
		
		//System.out.println("");
		System.out.printf("%s\t%s\t%s\t%d��\n",strName1,strName2,strName3,intbye);
		
	}
	public void BookList2() {
		
		//System.out.println("å�� ����");
		System.out.println("===============================");
		System.out.println("å �̸� : " + strName1);
		System.out.println("���ǻ� : " + strName2);
		System.out.println("���� : " + strName3);
		System.out.println("���� : " + intbye + "��");
		System.out.println("===============================");
		
		//System.out.printf("%s\t%s\t%s\t%d\n",strName1,strName2,strName3,intbye);
		
	}
	
}
