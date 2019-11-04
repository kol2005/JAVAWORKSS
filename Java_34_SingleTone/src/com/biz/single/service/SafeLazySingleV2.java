package com.biz.single.service;

/*
 * thread�� �����ϰ� �ʱ�ȭ������ ���� ������ ������ �̱��� �ڵ�
 */
public class SafeLazySingleV2 {

	// volotile : �ֹ߼��ִ�
	// �� �������� ������ ���ư���...
	// Java������ �� ������ JVM ������ �������� �ʰ�
	//	��ǻ�� �ϵ�������� Main memory ������ �����ؼ�
	//	�ü���� �����ϵ��� �϶�
	// ��Ƽ thread���� ���� ����� ���ؼ�
	//	�ü�� �ܰ迡�� �޸𸮸� �����ϰڴ� ��� �ǹ�
	private volatile static SafeLazySingleV2 instance;
	
	private SafeLazySingleV2() {
	}
	
	public static SafeLazySingleV2 getInstance() {
		if(instance == null) {
			synchronized (SafeLazySingleV2.class) {
				instance = new SafeLazySingleV2();	
			}
		}
		return instance;
	}
}
