package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.string.StringService;
import com.biz.string.domain.ScoreVO;

public class ScoreServiceV1 implements StringService {


	protected List<ScoreVO> scList;
	Random rnd = new Random();
	
	public ScoreServiceV1() {
		scList = new ArrayList<ScoreVO>();
		
	}
	
	@Override
	public void input() {
		for ( int  i = 0 ; i < 10; i++) {
			String strNum = String.format("%05d", i+1);
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			ScoreVO scVO = new ScoreVO();
			scVO.setStrNum(strNum);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			this.total(scVO);
			
			scList.add(scVO);
			
		}

	}
	
	public void total(ScoreVO sVO) {
		int total = sVO.getIntKor();
		total += sVO.getIntEng();
		total += sVO.getIntMath();
		
		sVO.setIntTotal(total);
		sVO.setIntAvg(total/3);
		
	}

	@Override
	public void list() {
		
		System.out.println("========================================");
		System.out.println("�����϶�ǥ");
		System.out.println("========================================");
		System.out.println("�й�\t����\t����\t����\t����\t���");
		System.out.println("----------------------------------------");
		for(ScoreVO vo : scList) {
			System.out.printf("%3s\t",vo.getStrNum());
			System.out.printf("%3d\t",vo.getIntKor());
			System.out.printf("%3d\t",vo.getIntEng());
			System.out.printf("%3d\t",vo.getIntMath());
			System.out.printf("%3d\t",vo.getIntTotal());
			System.out.printf("%3d\n",vo.getIntAvg());
			
		}

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
