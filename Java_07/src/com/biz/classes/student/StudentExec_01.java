package com.biz.classes.student;

public class StudentExec_01 {

	//Student Ŭ������ Ȱ���Ͽ�
	//���� �۵��Ǵ� �ڵ带 �ۼ�
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.strNum = "001";
		student.strName = "ȫ�浿";
		student.intYear = 2012;
		student.strDept = "ȸ����";
		
		student.viewInfo();
		
		student.list();

	}

}
