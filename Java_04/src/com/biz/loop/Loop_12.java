package com.biz.loop;

public class Loop_12 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("========================");
		
		/*
		 * ���� for �ݺ���
		 * 2�� �̻��� for ���� �ݺ��Ͽ� �����ϴ� ����
		 * 
		 * �ٱ��� for ���� 1�� ����ɶ�
		 * ���� for ���� 10�� �ݺ� ����ǰ�
		 * system.out.print("* ")�� ��� 100�� ����ȴ�
		 * 
		 * ���� for ���� 10�� �ݺ� ����� �� 
		 * system.out.println()�� �����Ͽ� �ٹٲ� ����
		 * 
		 * �׷��� 10*10 ���� �� �ڽ��� ����Ѵ�.
		 */
		for (int i = 0 ; i < 10 ; i++) {
			for (int j = 0; j < 10 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
