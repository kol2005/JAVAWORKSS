package com.biz.list.array;

import java.util.Random;

public class Prime_01 {

	/*
	 * 50���� ������ �迭�� �����ϰ� �� ��ҿ� 1 ���� 100 ���� ���� ���� �����ϰ� �� ���� �Ҽ��ΰ��� ã�� �ڵ�
	 */
	public static void main(String[] args) {

		int[] nums = new int[50];

		// ���� ���ڸ� �����ϱ� ���� ����ϴ� class
		// Random class �� ����Ҽ� �ֵ���
		// rnd ��ü�� ����
		// rnd �� Random class �� method �� ȣ���ؼ�
		// ����(��ϵ�)�� �����ϱ� ���� �븮��
		Random rnd = new Random();

		int num = rnd.nextInt(); // ���� ���� ���ڸ� ����
		num = rnd.nextInt(100); // ���� 0 ~ 99 ������ ���� ���� ����
		num = rnd.nextInt(100) + 1; // ���� 1 ~ 100 ������ ���� ���� ����

		int index;

		for (int i = 0; i < nums.length; i++) {

			// 1���ڵ�
			int rndNum = rnd.nextInt(100) + 1;
			nums[i] = rndNum;
			
			// ���� nums �迭�� i ��ġ�� ���� 2 �̸� (0, 1)dlaus
			// �ش� ���� �Ҽ� �˻縦 ��������
			// i++ �� �����Ͽ� ������ ��ġ�� �ִ� ������ �ǳ� �پ��
			
			// ��)
			// nums[3] ���� 1�̴� ��� �����ϸ�
			// nums[3] �� ���� �Ҽ� �˻縦 ��������
			// nums[4] �� �ǳ� �پ��
			if(nums[i] < 2) {
				/*
				 * for, while ���� �ݺ���������
				 * � �����ε� continue ��ɹ��� ������
				 * �� ������ �ڵ�� ��� �����ϰ� �ǳʶڴ�
				 */
				continue;
			}

			// 2���ڵ�
			// nums[i] = rnd.nextInt(100) + 1;

			for (index = 2; index < nums[i]; index++) {
				if (nums[i] % index == 0)
					break;

			}
			if (nums[i] <= index)
				System.out.println(nums[i]);
		}
		// �Ҽ��� ã�Ƽ� ����Ʈ�� ���̴� �ڵ�
		// for(int i = 0; i<nums.length;i++) {
		// for(int j = 0; j<)
	}
}


