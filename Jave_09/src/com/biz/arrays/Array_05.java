package com.biz.arrays;

import java.util.Random;

/*
 * �迭 ����� ����
 */
public class Array_05 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		Random rnd = new Random();
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
			
		}
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i]+", ");
		}
		
		for(int i = 0 ; i < nums.length ; i++) {

			for (int j = i+1 ; j < nums.length ; j++) {
				//�������� ����
				// if(nums[i] > nums[j]) {
				
				//�������� ����
				if(nums[i] < nums[j]) {
					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;
					
				}
			}
		}
		System.out.println("\n===========================================");
		/*
		 * �� ���� �ڵ��
		 * bubble, insert, selection ������ ���ʰ��Ǵ�
		 * ���� �ڵ�� �ٸ� �˰����� ������ �ڵ带
		 * ������� �ʰ�
		 * �ܼ��ϰ� ��, ��ü���� �����ؼ�
		 * ������ �Ѵ�.
		 */
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i]+", ");
		}
		
	}

}
