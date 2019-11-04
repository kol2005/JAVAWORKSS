package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 67 ; i++) {
			nums.add(rnd.nextInt(100)+2);
		}

		
		//��ü ����Ʈ�� ������ �Ҷ�
		int nSize = nums.size();
		for (int i = 0 ; i < nSize ; i++) {
			System.out.println(nums.get(i));
		}
		
		// Ȯ�� for, ���� for, for Each ��� �θ���
		// nums ������ŭ �ݺ����� �����ϸ鼭
		// nums �� ��Ҹ� getter �Ͽ� n ������ ����ش�
		
		// �� �ڵ�� nums �� Collections �϶�
		//		����� �� �ִ�
		
		// ��ü ����Ʈ�� �о ������ �����Ҷ� ��밡��
		for (int n : nums) {
			System.out.println(n);
		}
		
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		System.out.println("�հ� : "+sum);
		
		//�Ҽ�ã��
		for(int n : nums) {
			int index;
			for(index = 2; index < n ; index++) {
				if(n%index == 0) break;
			}
			if(index >= n) {
				System.out.println(n + "�� �Ҽ��̴�");
			}
		}
	}

}
