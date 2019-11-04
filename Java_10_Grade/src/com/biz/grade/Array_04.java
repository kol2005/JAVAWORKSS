package com.biz.grade;

import java.util.Random;

public class Array_04 {

	public static void main(String[] args) {
		
		int[] intNum = new int[50];
		Random rnd = new Random();
		
		int index;
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100)+1;
			for(index = 2 ; index < intNum[i] ; index++) {
				if(i % index == 0)break;
				//if(intNum[i] % index == 0)
					//System.out.println(i+"번째 소수 : " + intNum[i]);
				
			}
			if(intNum[i] == index)
				System.out.println("Prime : " + i);
		}

	}

}

//for(int i = 2 ; i <= 100000 ; i++) {
	
	// 2부터 i-1까지 각각의 수로 i값을 나누어
	//나머지가 한번도 0이 아니면 소수
	//int index;
	//for(index = 2 ; index < i ; index++) {
	//	if(i % index == 0)break;
	//}
	//if(index >= i)
	//	System.out.println("Prime : " + i);