package com.biz.grade;

import com.biz.grade.service.StudentServiceImpV1;

public class Student_01 {

	public static void main(String[] args) {
		
		StudentServiceImpV1 vo = new StudentServiceImpV1();
		
		vo.input(2);
		vo.list();
		vo.rank();
	}

}
