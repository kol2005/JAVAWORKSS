package com.biz.classes.exec;

public class ClassEx_03 {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 40;
		
		// num1 �� ����� ���� num2 �� ����� ���� ���� �ٲٰ�ʹ�
		
		int _temp = num1;
		num1 = num2;
		num2 = _temp;
		
		/*
		 * �ΰ��� ���� ������ ��� ����
		 * ���� ��ȯ�ϴ� method�� ����ڴ�
		 * �׸��� method�� ����� ��
		 * ��ȯ�� ���� �ٽ� �������� ��� ã��
		 */
		swap(num1,num2);
		
		int[] nums = new int[2];
		nums[0] = 40;
		nums[1] = 50;
		System.out.printf("nums[0] : %d, nums[1] : %d\n",nums[0],nums[1]);
		swap(nums);
		
		System.out.printf("nums[0] : %d, nums[1] : %d",nums[0],nums[1]);
	}

	public static void swap(int num1, int num2) {
		int _temp = num1;
		num1 = num2;
		num2 = _temp;
		
		
	}

	public static void swap(int[] nums) {
		int _temp = nums[0];
		nums[0] = nums[1];
		nums[1] = _temp;
		
		
	}

}
