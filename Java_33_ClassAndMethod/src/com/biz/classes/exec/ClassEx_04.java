package com.biz.classes.exec;

public class ClassEx_04 {

	public static void main(String[] args) {
		
		int[] nums = new int[2];
		nums[0] = 40;
		nums[1] = 50;
		System.out.printf("nums[0] : %d, nums[1] : %d\n",nums[0],nums[1]);
		swap(nums);
		
		System.out.printf("nums[0] : %d, nums[1] : %d",nums[0],nums[1]);
	}

	/*
	 * method���� �Ű�������
	 * �迭, ��ü(String, Integer�� ����), ����Ʈ��
	 * ���� �� 
	 * �� ��ҵ��� ���� ������ �ϸ�
	 * ������ �� ���� �������� ���� ���� ������ �ȴ�
	 * 
	 * ��,
	 * method ���� new Ű����� �� ������ �ϸ�
	 * �������� �ٸ� ������ �Ǿ� 
	 * ���� �����ص� ������ ������ ��ġ�� �ʴ´�.
	 */
	public static void swap(int[] nums) {

		nums = new int[2];
		nums[1] = 100;
		nums[0] = 200;
		
		
	}

}
