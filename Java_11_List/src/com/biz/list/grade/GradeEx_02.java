package com.biz.list.grade;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.service.GradeService;
import com.biz.list.service.GradeServiceImp_02;

public class GradeEx_02 {

	public static void main(String[] args) {
		
		// GradeService inteface �� gs ��ü�� ����
		//		GradeServiceImp_01() �� �̿��ؼ�
		//		gs ��ü�� ����
		//GradeService gs = new GradeServiceImp_01();
		GradeService gs = new GradeServiceImp_02();
		
		// List interface �� nums ��ü�� ����
		//						ArrayList() �� �̿��ؼ�
		//						nums ��ü�� ����
		List<Integer> nums = new ArrayList<Integer>();
		
		gs.input(10);
		gs.total();
		gs.view();
		
		
	}
}
