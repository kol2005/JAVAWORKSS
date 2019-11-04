package com.biz.files;

public class asdasfsdf {

	public static void main(String[] args) {
		
		ScoreVO[] scoreVO = new ScoreVO[5];
		
		scoreVO[1] =setintKor(97);
		scoreVO[1] =setintEng(70);
		scoreVO[1] =setintMath(55);
		
		int intSum = scoreVO[1].getIntKor();
		int intSum += scoreVO[1].getIntEng();
		int intSum += scoreVO[1].getIntMath();
		
		
		System.out.printf("ÇÕ°è : %5¤·",intSum);

		
	}

}
