package com.biz.var;

public class FloatVat_02 {

	public static void main(String[] args) {
		
		float fNum = 60.0f;
		
		//정수 100이 실수로 바뀌어 변수에 저장
		fNum = 100;
		System.out.println(fNum);
		
		// 정수 3이 실수 3.0으로 바뀐 후 30.0 / 3.0을 계산하고 결과를 저장
		fNum = 30.0f / 3;
		System.out.println(fNum);
		
		// 정수 55와 3이 나뉘어지고 결과가 실수로 바뀌어 저장
		fNum = 55 / 3;
		System.out.println(fNum);
		
		// 1. 55가 실수로 변환
		// 2. 55.0 / 3.0 이 계산
		// 3. 결과가 변수에 저장
		fNum = 55 / 3.0f;
		System.out.println(fNum);
		
		
	}
}
