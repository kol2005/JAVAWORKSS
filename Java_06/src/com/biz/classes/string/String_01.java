package com.biz.classes.string;

public class String_01 {

	public static void main(String[] args) {
		
		/*
		 * strNation 문자열 중에서 u 라는 문자가
		 * 몇번째 위치에 있냐?
		 */
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		int num1 = 0;
		
		for(int i = 0 ; i < intLength ; i++) {
			char cA = strNation.charAt( i );
			//System.out.println(i + " 번째 " + cA);
			if(cA == 'u') { 
				num1 = i; 
			
			System.out.println("Republic of Korea 의 글자에서 u 는 "+ i + "번째 글이다");
			}
		}
		//System.out.println("Republic of Korea 의 글자에서 u 는 "+ num1 + "번째 이다");
		
	}

}
