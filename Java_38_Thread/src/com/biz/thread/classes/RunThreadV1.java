package com.biz.thread.classes;
/*
 * main() method�� �帧�� ������
 * background���� �۵��ϵ��� ������ class
 * 
 * 1. background���� ������ thread�� �۵��ϱ� ���ؼ���
 * Thread Ŭ������ ��ӹ޾Ƽ� Ŭ������ �ۼ��Ѵ�
 */
public class RunThreadV1 extends Thread{

	@Override
	public void run() {
	
		long sum = 0;
		for(long i = 1 ; i <= 10000000000L ; i++) {
			sum += i;
		}
		System.out.println("\n���� ������ : " + sum);
	}

}
