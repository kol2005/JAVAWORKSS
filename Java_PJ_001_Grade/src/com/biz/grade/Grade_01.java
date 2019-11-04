package com.biz.grade;

import com.biz.grade.service.GradeServiceImpV1;

public class Grade_01 {

	public static void main(String[] args) {
		
		GradeServiceImpV1 vo = new GradeServiceImpV1();
		
		vo.input(2);
		vo.list();

	}

}
