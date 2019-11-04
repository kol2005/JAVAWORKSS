package com.biz.grade;

import java.util.Map;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.GradeServiceV1;
import com.biz.grade.service.ScoreServiceV1;
import com.biz.grade.service.StudentServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		StudentServiceV1 stService = new StudentServiceV1();
		ScoreServiceV1 scService = new ScoreServiceV1();
		
		String stdFileName = "src/com/biz/grade/�л����.txt";
		String scoreFileName = "src/com/biz/grade/score.txt";
		
		try {
			stService.read(stdFileName);
			scService.read(scoreFileName);
			scService.total();
			scService.rank();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Map<String,ScoreVO> scList = scService.getScList();
		Map<String,StudentVO> stdList = stService.getStdList();
		
		// �⺻�����ڸ� ȣ���Ͽ� gs ��ü�� ����
		GradeServiceV1 gs = new GradeServiceV1();
		
		//scList �� �����ڿ��� ������
		//gs ��ü�� �����ϸ鼭 scList ���� �ʱ�ȭ
		gs = new GradeServiceV1(scList);
		
		//scList �� stdList �� �����ڿ��� ������
		//gs ��ü�� �����ϸ鼭 scList �� stdList ���� �ʱ�ȭ
		gs = new GradeServiceV1(scList,stdList);
		
		gs.list();

	}

}
