package com.biz.string.service;

import java.util.List;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudenVO;

/*
 * ScoreServiceV1 은 성적정보만을 출력하는 Service이다
 * 여기에 성적정보를 출력하면서
 * 학번정보를 기준으로
 * 학생정보(이름)을 같이 보여주는 list() method 를 재 정의 하자
 * 
 * ============================================
 * 학번 이름 국어 영어 수학 총점 평균
 * ============================================
 * 
 */
public class ScoreServiceV2 extends ScoreServiceV1 {

	// 접근제한자
	// public : 누구나 접근할 수 있다
	// private : class scope, 현재 class 에서만 접근가능
	// protected : 현재 class 와 상속받은 class 에서만 접근가능
	// 없을경우 : package scope, 같은 package 내에서는 public 처럼 동작을하고
	//				다른 package끼리는 private 처럼 동작을 한다
	
	// Java 패턴에서는
	// 특별한 경우가 아니면
	// 멤버변수들은 private 이나 protected 로 설정하도록
	// 권장
	
	// List<ScoreVO> scList protected 상태로
	// 상속받아 존재하고 있다
	private List<StudenVO> stdList = null;
	
	
	@Override
	public void list() {
		System.out.println("=====================================================");
		System.out.println("성적일람표");
		System.out.println("=====================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		//scList 는 선언, 초기화 부분이 보이지 않지만
		//ScoreServiceV1 에서 protected 상태로 상속받았기 때문에
		// 접근하여 값을 읽을 수 있다
		for(ScoreVO scVO : scList) {
			// 학번을 scVO 로 추출
			String strNum = scVO.getStrNum();
			//학번으로 학생정보를 조회
			StudenVO stVO = this.searchStd(strNum);
			
			String strName;
			String strAddr;
			String strTel;
			if(stVO==null) {
				strName = "(없음)";
				strAddr = "(없음)";
				strTel = "(없음)";
			}else {
				strName = stVO.getStrName();
				strAddr = stVO.getStrAddr();
				strTel = stVO.getStrTel();
			}
			System.out.print(scVO.getStrNum()+"\t");
			System.out.print(strName + "\t");
			System.out.printf("%3d\t",scVO.getIntKor());
			System.out.printf("%3d\t",scVO.getIntEng());
			System.out.printf("%3d\t",scVO.getIntMath());
			System.out.printf("%3d\t",scVO.getIntTotal());
			System.out.printf("%3d\n",scVO.getIntAvg());
			
		}
		System.out.println("=========================================================");
		
	}

	// ScoreServiceV2 에 멤버변수로 선언된 stdList 는
	// StudentService.. 에서 값이 세팅된 리스트 이다
	// StudentService 에서 세팅된 리스트를
	// ScoreService 에서 사용하기 위해서
	// main() method 에서 StudentService 로 부터
	//		stdList 를 getter 하여
	//		setstdList() 메서드를 통해
	//		ScoreService 에 주입한다
	public void setStdList(List<StudenVO> stdList) {
		this.stdList = stdList;
	}
	
	
	// 학번을 매개변수로 받고,
	// stdList 에 해당 학번의 학생정보가 있는지 찾아서
	// StudenVO 를 리턴해주는 method
	private StudenVO searchStd(String strNum) {
		
		for(StudenVO stVO : stdList) {
			if(stVO.getStrNum().equals(strNum)) {
				return stVO;
			}
		}
		return null;
		
	}
	
}
