package com.biz.arrays;

import java.util.Random;

/*
 * �迭 ����� ����
 */
public class Array_03 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		Random rnd = new Random();
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
			
		}
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i]+", ");
		}
		//�����ϱ� ���ؼ� 
		// 1. �迭�� ������ŭ �ݺ����� ����
		for(int i = 0 ; i < nums.length ; i++) {
			// 2. �迭�ǿ�� i ��°�� i+1 ��°����
			//	length - 1 ��°���� �񱳸��ؼ�
			// 3.ū���� �����ʿ� ��ġ�ϵ��� �ڸ� �ٲ�
			for (int j = i+1 ; j < nums.length ; j++) {
				// i �� ����, j �� ��������ġ�� ��Ÿ����
				// nums[i] �� nums[j] ���� ũ�ٴ� ����
				// ���� ���� �� ũ�ٴ� ���̹Ƿ�
				// i ��°�� ���� j ��°�� ���� ����
				//�ٲپ��ش�
				if(nums[i] > nums[j]) {
					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;
					
				}
			}
		}
		System.out.println("\n===========================================");
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i]+", ");
		}
		
	}

}
