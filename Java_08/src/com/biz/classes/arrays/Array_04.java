package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		int[]nums = new int[10];
		Random rnd = new Random();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(10) + 1;
		}
		System.out.print("1~10 ������ ���� >> ");
		String strNum = scanner.nextLine();
		int intNum = Integer.valueOf(strNum);
		
		int index;
		for(index=0;index < nums.length ; index++) {
			if(nums[index] == intNum) break;
		}
		if(index >= nums.length)
			System.out.println("ã�� ���� ����");
		else
			System.out.printf("%d ��°���� ã��",(index+1));
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]+", ");
		}
		

	}

}
