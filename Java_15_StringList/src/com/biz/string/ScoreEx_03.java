package com.biz.string;

import java.util.List;

import com.biz.string.domain.StudenVO;
import com.biz.string.service.ScoreServiceV2;
import com.biz.string.service.StudentServiceV1;



public class ScoreEx_03 {

	public static void main(String[] args) {
		
		StringService stdService = new StudentServiceV1();
		
		// �л����� ����
		stdService.input();
		
		// stdService ���� stdList ����
		List<StudenVO> stdList = ((StudentServiceV1)stdService).getScoreList();
		
		// stdList �� ScoreService �� ����
		StringService scService = new ScoreServiceV2();
		((ScoreServiceV2)scService).setStdList(stdList);
		
		// ������ ����
		scService.input();
		scService.list();

	}

}
