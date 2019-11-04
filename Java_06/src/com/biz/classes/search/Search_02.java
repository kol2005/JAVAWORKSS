package com.biz.classes.search;

import java.util.Scanner;

public class Search_02 {

	/*
	 * 임의의 문자열중에 포함된 1개의 문자열을 찾는 클래스
	 * 
	 * 1. 임의 문자열을 제시하고
	 * 2. 키보드에서 1개의 문자열을 입력받고 
	 * 3. 해당하는 문자열이 몇번째 위치에 있나?
	 */
	
	public static void main(String[] args) {
	
		Search_01 ss = new Search_01();
		Scanner scanner = new Scanner(System.in);
		
		//Search_01 클래스의 멤버변수인 strNation에
		//필요한 문자열을 세팅
		ss.strNation = "UNITED NATION";
		
		
		//Search_01 ss = new Search_01();
		
		/*
		 * 무한반복으로 계속해서 진행되는 코드인데
		 * 필요할때 종료할수 있는 코드를 작성
		 */
		
		//for 는 일반적으로 시작값과 최대값이 정해진 경우
		//사용하고 어떤 조건에 따라 무한, 또는 유한 반복을 수행할때는
		//while() 명령문을 사용한다
		
		//for (;;) {
		while(3==3) {
		
		ss.main();
		
		System.out.println("계속하려면 아무키나 누르세요");
		System.out.println("종료하려면 END를 입력하세요");
		String anyKey = scanner.nextLine();
		if(anyKey.equals("END"))break;
		}
		System.out.println("GAME OVER!!");
		
		}
		
		
		
		

	}


