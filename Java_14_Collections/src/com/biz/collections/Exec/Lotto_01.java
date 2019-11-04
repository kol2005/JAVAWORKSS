package com.biz.collections.Exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto_01 {

	public static void main(String[] args) {
		
		/*
		 * List�� ����� Lotto ��ȣ ����
		 * 1. �������� ������ List �� ����
		 * 2. 1 ~ 45 ������ ���� add()
		 * 3. Collections.shuffle()
		 * 4. index 0 ���� 5������ ���� �����ؼ�
		 * 		�����ָ� �ȴ�
		 */
		List<Integer> lottos = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 45 ; i++) {
			lottos.add(i+1);
		}
		for(int i = 0 ; i < 100 ; i++) {
		Collections.shuffle(lottos);

		}
		List<Integer> viewLottos = new ArrayList<Integer>();
		for(int i = 0 ; i < 6 ; i++) {
			viewLottos.add(lottos.get(i));
		}
		Collections.sort(viewLottos);
		System.out.println("====================================");
		System.out.println("��ڳ�����!!!!");
		System.out.println("------------------------------------");
		for(int n : viewLottos) {
			System.out.printf("%d, ",n);
		}
		System.out.println("\n====================================");
	}

}
