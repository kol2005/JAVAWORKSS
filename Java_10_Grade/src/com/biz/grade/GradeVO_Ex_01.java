package com.biz.grade;

import com.biz.grade.service.GradeVoService;

public class GradeVO_Ex_01 {

	public static void main(String[] args) {
		
		GradeVoService gs = new GradeVoService(20);
		gs.input();
		gs.total();
		gs.rank();
		gs.view();
		
		gs.sort();
		gs.view();
		
		// test �迭�� ���� ���ڰ� ����Ǿ� �ִٰ� ����
		int[] test = new int[10];
		
		//�հ�
		//test �迭�� ����� ������ ����� ���
		int intSum = 0;
		int intAvg = 0;
		for(int i=0; i<test.length ; i++) {
			intSum += test[i];
		}
		intAvg = intSum/test.length;

	}

}
