package com.biz.thread.classes;

/*
 * thread Ŭ������ �������Ҷ� Thread Ŭ������ ��ӹ޾Ƽ� ����Ѵ�
 * ������ �� ����� �ٸ� Ŭ����(jdk, 3rd, ���������)�� ��ӹ��� �� ���� �Ѵ�
 * 
 * �׷��� ThreadŬ������ ��ӹ��� ����
 * Runnable �������̽��� implements �Ͽ�
 * threadŬ������ �������ϴ� ���� ����
 */
public class Run_01 implements Runnable{

	@Override
	public void run() {
		
		long start = 1;
		long end = 10000000000L;
		long sum = 0;
		for(long i = start ; i <= end ; i++) {
			sum += i;
		}
		System.out.printf("\n %d ~ %d���� ���� ������ : %d",start,end,sum);
		
	}	
}
