package com.biz.loop;

public class Loop_11 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0 ; i <= 10 ; i+=2) {
			sum += i;
		}
		System.out.println("0���� ¦���� �� : " + sum);
		
		sum = 0;
		for (int i = 1 ; i <= 10 ; i+=2) {
			sum += i;
		}
		System.out.println("1���� Ȧ���� �� : " + sum);
		
	}

}
