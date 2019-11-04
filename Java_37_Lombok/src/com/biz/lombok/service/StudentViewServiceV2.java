package com.biz.lombok.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV2 extends StudentViewServiceV1 {

	//List<StudentVO> studentList;
	//List<StudentVO> stdList;
	
	//public StudentViewServiceV2() {
		//studentList = new ArrayList<StudentVO>();
		//Scanner scanner = new Scanner(System.in);
		//stdList = new ArrayList<StudentVO>();
	//}
	
	
	@Override
	public void view() {
		this.title();
		for(StudentVO sVO : stdList) {
			this.body(sVO);
		}
	}

	@Override
	public void view(String strName) throws Exception {
		this.title();
		
	}

	@Override
	public void view(int intGrade) {
		this.title();

	}

	@Override
	public void view(int grGrade, int lessGrade) {
		this.title();

	}
	
	private void title() {
		System.out.println("===========================================");
		System.out.println("학번\t이름\t전번\t학년\t주소");
		System.out.println("===========================================");
	}
		private void body(StudentVO sVO) {
			System.out.print(sVO.getS_num()+"\t");
			System.out.print(sVO.getS_name()+"\t");
			System.out.print(sVO.getS_tel()+"\t");
			System.out.print(sVO.getS_grade()+"\t");
			System.out.print(sVO.getS_addr()+"\n");
		}
}
