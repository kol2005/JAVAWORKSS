package com.biz.grade;

import java.util.Scanner;

public class Grade_01 {

	public static void main(String[] args) {

		/*
		 * 정수형 배열 intKor를 5개 생성 정수형 배열을 선언하겠따.. 키워드(명령어) 배열의 이름 정수형 배열 5개를 생성
		 */
		int[] intKor = new int[5];

		// Scanner 클래스를 사용하겠다
		// scanner 객체로 선언하겠다
		// scanner 를 시스템과 연결하라
		Scanner scanner = new Scanner(System.in);
		
		//배열의 개수만큼 반복될 코드
		for (int i = 0; i < intKor.length; i++) {
			System.out.print("점수 입력 : ");
			String strnum = scanner.nextLine();
			intKor[i] = Integer.valueOf(strnum);
		}

		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i] + ", ");
		}

	}
}
