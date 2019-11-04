package com.biz.grade;

import java.util.Random;

public class Array_03 {

	public static void main(String[] args) {

		int[] intNum = new int[50];

		// 임의의 수를 만들때 사용할 도구를 준비
		Random rnd = new Random();

		System.out.println("==========================");
		System.out.println("1 ~ 100까지 짝수만 표시 50회");
		for (int i = 0; i < intNum.length; i++) {
			
			// 1번
			// 임의 수를 생성해서
			// num 변수에 저장 했다가
			// num 변수에 저장된 값을
			// 다시 intNum 의 i 번째 요소에 복사
			//int num = rnd.nextInt(100)+1;
			//intNum[i] = num;
			
			// 2번
			// 임의 수를 생성해서
			// 직접 intNum 의 i 번째 요소에 저장
			intNum[i] = rnd.nextInt(100) + 1;
			
			// 배열에 저장된 요소들 중에
			// 짝수들의 리스트를 보여라
			if (intNum[i] % 2 == 0) {
				// if(intNum[i] == 2) break;
				System.out.println(i + " 번째 : " + intNum[i]);
			}
		}
		System.out.println("==================================");
		// 배열에 저장된 요소들 중에
		// 짝수들의 합은 얼마인가?
		int intSum = 0;
		for(int i = 0;i<intNum.length;i++) {
			if(intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}
		System.out.println("짝수들의 합 : " + intSum);

	}

}
