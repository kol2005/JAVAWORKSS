package com.biz.test;

public class javatest2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int num = 0 ; num <= 10 ; num++) {
			sum+=num;
			System.out.println("sum?:"+sum);
		}
		System.out.println("���1:"+sum);
		
		sum=0;
		for(int num = 0; num <= 10 ; num++) {
			sum = num;
			System.out.println("sum?:"+sum);
		}
		System.out.println("���2:"+sum);
	}
}
