package com.biz.grade.service;

import java.util.Map;
import java.util.Set;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.utill.LineMake;
/*
 * ===========================================================
 * 학번 이름	국어	영어	수학	총점	평균	석차
 * ===========================================================
 * 
 * ===========================================================
 */
public class GradeServiceV1 {
	
	Map<String, StudentVO> stdList;
	Map<String, ScoreVO> scList;
	
	public GradeServiceV1() {
		//기본생성자
	}
	public GradeServiceV1(Map<String,ScoreVO> scList) {
		// scList 를 호출한 곳으로 부터 받는 생성자
		this.scList = scList;
	}
	public GradeServiceV1(Map<String,ScoreVO> scList,Map<String,StudentVO> stdList) {
		// scList 와 stdList 를 호출한 곳으로 부터 받는 생성자
		this.scList = scList;
		this.stdList = stdList;
	}
	
	public void setScList(Map<String,ScoreVO> scList) {
		this.scList = scList;
	}
	public void setStdList(Map<String, StudentVO> stdList) {
		this.stdList = stdList;
	}
	
	public void list() {
		
		int length = 80;
		
		 System.out.println(LineMake.make("=", length));
		 System.out.println("성적일람표");
		 System.out.println(LineMake.make("=", length));
		 System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t석차\t전화번호"); 
		 System.out.println(LineMake.make("-", length));
		 
		 Set<String> keys = scList.keySet();
		 for(String key : keys) {
			 ScoreVO scVO = scList.get(key);
			 /*
			  * scVO 의 학번(Num) 을 key 값으로 하여
			  * stdList 로 부터 학생정보 (StudentVO) 를 추출하여
			  * 학생정보의 이름(Name)부분을 List 에 같이 표시
			  */
			 StudentVO stVO = stdList.get(scVO.getNum());
			 
			 System.out.print(scVO.getNum()+"\t");
			 System.out.print(stVO.getName()+"\t");
			 System.out.printf("%3d\t",scVO.getKorScore());
			 System.out.printf("%3d\t",scVO.getEngScore());
			 System.out.printf("%3d\t",scVO.getMathScore());
			 System.out.printf("%3d\t",scVO.getSumScore());
			 System.out.printf("%3.1f\t",scVO.getAverage());
			 System.out.printf("%3d\t",scVO.getRank());
			 System.out.println(stVO.getTel());
			 
			 
		 }
		 System.out.println(LineMake.make("=", length));
		 
	}
}
