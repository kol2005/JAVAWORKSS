package com.biz.classes.student;

public class StudentVO {
	
	public String strNum;
	public String strName;
	public int intYear;
	public String strDept;
	
	public void view(int intCurYear) {
		
		System.out.println("�й� : " + strNum);
		System.out.println("�̸� : " + strName);
		System.out.println("���� : " + intYear);
		System.out.println("���� : " + strDept);
		System.out.println("���� : " + (intCurYear - intYear));
		
	}

}
