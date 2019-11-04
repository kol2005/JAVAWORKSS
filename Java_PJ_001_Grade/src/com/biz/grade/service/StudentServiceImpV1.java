package com.biz.grade.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.gradevo.ScoreVO;

public class StudentServiceImpV1 implements StudentService {

	List <ScoreVO> scoreVO;
	
	public StudentServiceImpV1() {
		scoreVO = new ArrayList<ScoreVO>();
	}
	public void input() {
		Random rnd = new Random();
		ScoreVO vo = new ScoreVO();
		//vo.setStrNum(strNum);
		//String strNum = StrNum;
		int intKor = rnd.nextInt(50)+51;
		int intEng = rnd.nextInt(50)+51;
		int intMath = rnd.nextInt(50)+51;
		int intTotal = intKor+intEng+intMath;
		int intAvg = intTotal/3;
		
		
		//int intRank = intAvg
		
		//vo.setStrNum(strNum);
		vo.setIntKor(intKor);
		vo.setIntEng(intEng);
		vo.setIntMath(intMath);
		vo.setIntTotal(intTotal);
		vo.setIntAvg(intAvg);
		//vo.setIntRank(intRank);
		
		scoreVO.add(vo);
		
		
		
	}
	

	@Override
	public void input(int count) {
		for(int i = 0 ; i < count ; i++) {
			String strNum = String.format("%04d", (i+1));
			this.input(strNum);
		}

	}
	@Override
	public void input(String strNum) {
		
		Random rnd = new Random();
		ScoreVO vo = new ScoreVO();
		vo.setStrNum(strNum);
		//String strNum = StrNum;
		int intKor = rnd.nextInt(50)+51;
		int intEng = rnd.nextInt(50)+51;
		int intMath = rnd.nextInt(50)+51;
		int intTotal = intKor+intEng+intMath;
		int intAvg = intTotal/3;
		
		//int intRank = intAvg
		
		//vo.setStrNum(strNum);
		vo.setIntKor(intKor);
		vo.setIntEng(intEng);
		vo.setIntMath(intMath);
		vo.setIntTotal(intTotal);
		vo.setIntAvg(intAvg);
		//vo.setIntRank(intRank);
		
		scoreVO.add(vo);
		
		

	}

	public void rank() {

		for(int i = 0 ; i < scoreVO.size(); i ++) {
			for(int j = i + 1 ; j < scoreVO.size(); i ++) {
				int total_i = scoreVO.get(i).getIntTotal();
				int total_j = scoreVO.get(j).getIntTotal();
				
				// List.set(index,값)
				// 이미 추가된 list 의 index 위치의 값을
				// 변경하고자 할때
				if(total_i < total_j) {
					
					// scoreVO 의 두 위치 vo 를 서로 교환
					ScoreVO _vo = scoreVO.get(i);
					scoreVO.set(i, scoreVO.get(j));
					scoreVO.set(j,_vo);
				}
			}
			
		}
		
		int intRank = 1;
		for(ScoreVO vo : scoreVO) {
			vo.setIntRank(intRank++);
			
		}
	}
	
	@Override
	public void list() {
		System.out.println("=================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("=================================");
		int nSize = scoreVO.size();
		for(ScoreVO vo : scoreVO) {
		//for(int i = 0 ; i < nSize ; i++) {
			System.out.print(vo.getStrNum());
			System.out.print("\t"+vo.getIntKor());
			System.out.print("\t"+vo.getIntEng());
			System.out.print("\t"+vo.getIntMath());
			System.out.print("\t"+vo.getIntTotal());
			System.out.print("\t"+vo.getIntAvg());
			System.out.println("\t"+vo.getIntRank());
			
			
			
		}

	}

}
