package com.biz.classes.arrays;

import java.util.Random;

public class Array_02 {

	/*
	 * 10 �� ������ �迭�� �����
	 * 1���� 10���� ���� ���ڸ� ������ ��
	 * ���� ���� 1�� �����Ͽ�
	 * �迭�� ���°�� �ִ��� ã��
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] nums = new int[10];
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(10) + 1;
			
		}
		
		int sNum = 3;
		int index;
		for(index = 0 ; index < nums.length ; index++) {
			if(nums[index] == sNum) break;
		}
		if(index >= nums.length)
			System.out.printf("�迭�� ���� ����\n",sNum);
		else
			System.out.printf("ã�Ҵ�!! \n �迭�� %d ��°�� ���� ����\n ",index);
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}

}
