package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_02 {

	public static void main(String[] args) {

		// �������� ���� nums list �� ����� ����
		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();

		// ��ɹ��� 55�� �ݺ� �����϶�
		for (int i = 0; i < 55; i++) {

			// 4byte ���� ������ ���� ���� 1�� ����
			int rNum = rnd.nextInt();

			// ������ ���ڸ� nums List �� �߰�
			nums.add(rNum);

		}
		// nums List ���� 55���� ��Ұ� �����Ǿ� ���� ���̴�

		// 30�� ����� ���� num ������ ����
		int num = nums.get(30);
		System.out.println(num);

		for (int i = 0; i <= 55; i++) {
			System.out.println(nums.get(i));

		}
		//System.out.println(nums.get(55));

	}

}
