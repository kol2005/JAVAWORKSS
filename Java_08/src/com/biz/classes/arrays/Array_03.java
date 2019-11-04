package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		int[] num1 = new int[10];
		
		for(int i = 0 ; i < num1.length ; i++) {
			num1[i] = rnd.nextInt(10)+1;
		}
		
		System.out.print("1~10까지의 정수 >>");
		Scanner scanner = new Scanner(System.in);
		//num1 = Integer.valueOf(scanner[]); 
		String strnum = scanner.nextLine();
		int strnum1 = Integer.valueOf(strnum); 
		int index;
		for (index = 0 ; index < num1.length ; index++) {
			if(num1[index] == strnum1) break;
		}
		System.out.println(strnum1 + " 은 " + index + "번째에 있음");

	}

}
