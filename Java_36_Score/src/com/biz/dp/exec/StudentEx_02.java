package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.StudentVO;

public class StudentEx_02 {

	public static void main(String[] args) {
		List<StudentVO> stdList1 = new ArrayList<StudentVO>();
		List<StudentVO> stdList2 = new ArrayList<StudentVO>();
		
		
		System.out.println(System.currentTimeMillis());
		long start = System.currentTimeMillis();
		// ��ü�� �����ϰ�, setter�� �ʵ尪�� ������ �� List�� ����
		for(long i = 0 ; i < 1000000; i++) {
			
			StudentVO stdVO = new StudentVO();
			stdVO.setSt_num(String.format("%05d", i));
			stdList1.add(stdVO);
		}
		
		long end =System.currentTimeMillis();
		System.out.println(end-start);
		// �ʵ�����ڿ� ���� �����ϸ鼭 ���� add() method�� ��ü�� ����
		for(long i = 0 ; i < 1000000; i++) {
			
			stdList2.add(new StudentVO(String.format("%05d", i),"","","",0,""));
			
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
