package com.biz.classes.user;


public class User_03 {
	public static int nCount = 0;	
	public static void count() {
		// count() 매서드가 호출될때마다
		//nCount 는 새로 생성이되고 0으로 clear
		//int nCount = 0;
		nCount ++;
		System.out.println(nCount + " 번째 호출");
		
		
	}
	
	
}
