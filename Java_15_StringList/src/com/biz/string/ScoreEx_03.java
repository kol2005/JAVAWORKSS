package com.biz.string;

import java.util.List;

import com.biz.string.domain.StudenVO;
import com.biz.string.service.ScoreServiceV2;
import com.biz.string.service.StudentServiceV1;



public class ScoreEx_03 {

	public static void main(String[] args) {
		
		StringService stdService = new StudentServiceV1();
		
		// 학생정보 생성
		stdService.input();
		
		// stdService 에서 stdList 추출
		List<StudenVO> stdList = ((StudentServiceV1)stdService).getScoreList();
		
		// stdList 를 ScoreService 에 주입
		StringService scService = new ScoreServiceV2();
		((ScoreServiceV2)scService).setStdList(stdList);
		
		// 점수를 생성
		scService.input();
		scService.list();

	}

}
