package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {

			nums.add(rnd.nextInt());

		}

		// List.size()
		// ������� �߰��� ����Ʈ�� ������ �˷��ִ� method

		// 1�� �ڵ�
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}

		// 2�� �ڵ�
		int numsSize = nums.size();
		for (int i = 0; i < numsSize; i++) {
			System.out.println(nums.get(i));
		}

		/*
		 * list �� ������ŭ �ݺ����� �����ϰ��� �Ҷ� 
		 * 
		 * 1�� �ڵ�� for �ݺ����� ����Ǵ� 
		 * Ƚ����ŭ list.size() �޼��带 ȣ���Ͽ�
		 * size() �޼��忡 �ۼ��� �ڵ尡 �ݺ� ����ȴ�
		 * 
		 * 2�� �ڵ�� for �ݺ����� �����ϱ� ���� 
		 * �̸� ������ ����Ͽ� ������ �����Ͽ��ΰ� 
		 * ���� ���� �о �ݺ����� �����ϹǷ� ����Ʈ�� ������
		 * �������� ���� ������ �ξ� ȿ������ �ڵ尡 �ȴ�.
		 */
	}

}
