package com.biz.thread.classes;

/*
 * thread Ŭ������ �������Ҷ� Thread Ŭ������ ��ӹ޾Ƽ� ����Ѵ�
 * ������ �� ����� �ٸ� Ŭ����(jdk, 3rd, ���������)�� ��ӹ��� �� ���� �Ѵ�
 * 
 * �׷��� ThreadŬ������ ��ӹ��� ����
 * Runnable �������̽��� implements �Ͽ�
 * threadŬ������ �������ϴ� ���� ����
 */
public class Run_02 implements Runnable{

	@Override
	public void run() {
		
		long start = 1;
		long end = 10000L;
		String sum = "";
		for(long i = start ; i <= end ; i++) {
			sum += (int)(Math.random()*100) + "\n";
		}
		System.out.println(sum);
		
	}	
}
