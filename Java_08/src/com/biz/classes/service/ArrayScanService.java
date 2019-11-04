package com.biz.classes.service;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {
	
	private int[] nums;
	
	// ������ �޼��� : 
	// 				Ŭ������ ���ԵǴ� method �߿�
	// 				void ���� ����
	// 				�̸��� Ŭ���� �̸��� ���� method
	// ������ �޼���� ������ new ArrayScanService() ������ �޼��带
	// ȣ���Ҷ� �ڵ����� ȣ��Ǵ� method �̴�
	public ArrayScanService(int length) {
		
		Random rnd = new Random();
		nums = new int[length];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(10)+1;
		}
	}
	
	public void scanArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("0 ~ 10 ���� ���� >> ");
		String strNum = scanner.nextLine();
		
		int intNum = Integer.valueOf(strNum);
		
		int index;
		for(index = 0 ; index < nums.length ; index++) {
			if(nums[index] == intNum) break;
		}
		if(index >= nums.length)
			System.out.println("ã�� ���� ����!!!");
		else
			System.out.printf("%d ��°���� ã��\n",index);
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i]+", ");
				
		}
		//scanner.close();
	}//scanArray End
	
	public void scanArrayAll() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1 ~ 10 ������ ���� >> ");
		String strNum = scanner.nextLine();
		int intNum = Integer.valueOf(strNum);
		
		int nCount = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] == intNum) {
				System.out.printf("%d ��°���� ã��!!\n",i);
				nCount ++;
			}
		}
		if(nCount < 1) {
			System.out.println("ã�� ����!!");
		}else {
			for(int i = 0 ; i < nums.length ; i++)
				System.out.print(nums[i]+", ");
		}
		System.out.println();
	}
	

}
