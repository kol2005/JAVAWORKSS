package com.biz.list.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List interface �� Ȱ��
 * ArrayList, LinkedList �� List interface �� ���赵�� �Ͽ�
 * �ۼ��Ǿ���, 
 */
public class List_06 {

	public static void main(String[] args) {

		//List<Integer> nums = new ArrayList<Integer>();
		List<Integer> nums = new LinkedList<Integer>();

		//--------------------------------------
		// ArrayList �� ����� Ȱ���Ͽ� ������ �����ϴ� �ڵ�
		// �� �ڵ�� �ſ� �� ������� �ڵ��̰�
		// �ƹ��� ������ ������ ���� �ڵ��̴�
		nums.add(100);
		nums.add(100);
		nums.add(100);
		int total = nums.get(0) + nums.get(1) + nums.get(2);

	}
}
