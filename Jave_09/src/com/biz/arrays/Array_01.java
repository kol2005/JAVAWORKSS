package com.biz.arrays;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {
		
		// int[] : 지금부터 배열을 선언하겠다
		// intnum : 배열의 이름은 intnum 로 하겠다
		// new int[100] : 배열을 100개 만들겠다
		int[] intnum = new int[100];
		Random rnd = new Random();
		int index = 0;
		
		/*
		 * 1번 코드 
		 * 임의 수 1개를 생성한 후 
		 * 100개의 배열에 같은 값을 채워 넣는다
		 * 
		 */
		//int intnum = rnd.nextInt(10) + 1;
		//for ( int i = 0 ; i < intnum.length; i++)
		
		
		// 2번 코드
		// intnum 배열의 요소들을 임의 난수로 채우기 위해
		// intnum 배열을 for 반복문으로 요소들을 순회하면서
		// 생성된 난수로 채워 넣는다
		for (int i = 0; i < intnum.length; i++) {
			//배열의 개수만큼 계속 반복되는 코드
			//이때 i 는 0부터 99(배열개수 - 1 )까지 변한다
			intnum[i] = rnd.nextInt(10) + 1;
			
			//반복문이 수행하는 과정에서
			// index += ?? 문장이 정상적으로 수행되려면
			// index 변수를 반드시 0으로 생성, 초기화 해주어야 한다
			if (intnum[i] % 2 == 0) {
				index += intnum[i];
				System.out.println(intnum[i]);
			}
		}
		System.out.println("===================");
		System.out.println("짝수의 합 : " + index);
		
		
		//한줄에 5개 항목씩 표시하고자 할때
		//응용할수 있는 코드
		
		//i 값이 1이상이며 5의 배수이면
		//enter 문자를 보내서 줄바꿈을 하고
		for(int i = 0 ; i < intnum.length ; i++) {
			System.out.print(intnum[i]);
			if((i+1)%5 == 0) {
				System.out.println();
				//그렇지 않으면 컴마(,)를 찍어라
			}else {
				System.out.print(" , ");
			}
		}

	}

}
