package com.biz.list.array;

public class Array_01 {

	public static void main(String[] args) {

		/*
		 * ����Ʈ(List) �����͵��� ���� ���ڸ���Ʈ, ���ڸ���Ʈ �� �پ��� ����
		 */

		// ���� ����Ʈ�� ������� ǥ���ϴ� ���
		// =console �� ���� ����Ʈ�� ������� ǥ���ϴ� ���

		// 5 ���� 22���� ���ڸ� console �� �����ϰ� �ʹ�
		// i ���� 22����( i <= 22�� ������ ���� ����)
		// ��ɹ��� �ݺ������� �����ؼ�
		// ������ ǥ���϶�
		for (int i = 5; i <= 22; i++) {
			System.out.println(i);
		}

		// �迭�� �̿��ؼ� � ������ �����ϰ�
		// ����� ������ console �� ����Ʈ�� ǥ���ϴ� ���

		// ������ �迭 nums�� �����ϰ�
		// ��Ҹ� 100���� �����ϰڴ�
		int[] nums = new int[100];

		// nums �迭�� ��� 100�� � ���� ����
		nums[0] = 5;
		nums[1] = 6;
		nums[2] = 7;
		nums[10] = 22;
		nums[77] = 1000;

		// nums �迭�� ��ҿ� ����� ���� �̿��ؼ� ���� ����
		// 1. console�� ǥ��
		System.out.println(nums[99]);
		System.out.println(nums[77]);
		System.out.println(nums[2]);

		// 2. �迭��ҿ� ����� ���� ������ ���̹Ƿ�
		// �� ���� �о ���� ������ ����
		int sum = nums[1] + nums[10] + nums[55] + nums[88];

		// 3. �迭��ҿ� �ٸ� ���� ����
		nums[1] = 99;
		nums[88] = 91;

		// 4. �迭����� index �� ���Ƿ� �������� �ʰ�
		// �迭��� ��ü�� ���ؼ� ������ ����
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			sum = sum + nums[i];

		}

	}

}
