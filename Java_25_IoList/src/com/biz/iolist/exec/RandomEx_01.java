package com.biz.iolist.exec;

public class RandomEx_01 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			/*
			 * 0���� 1�̸��� ���� double ������ �����ϴ� method
			 */
			double rnd1 = Math.random();
			System.out.println(rnd1);
		}
		
		int start = 10;
		int end = 55;
		for(int i = 0 ; i < 10 ; i++) {
			/*
			 * 0���� 1�̸��� ���� double ������ �����ϴ� method
			 */
			double rnd1 = Math.random();
			
			// start ~ end ���� ������ ���� ���� �����϶�
			int num = (int)(rnd1 * (end - start + 1) + start );
			System.out.println(rnd1);
		}
		

	}

}
