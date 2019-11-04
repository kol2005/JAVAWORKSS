package com.biz.thread.exec;

/*
 * SingleTone �߿��� ���� ������ SingleTone
 * multi thread ȯ�濡�� �������� ����ȭ�� �� �̷��
 * ���������� ���� ������ �����Ҽ� �ִ�
 */
public class LazyClassV1 {

	public int sum;
	
	private LazyClassV1() {
		
	}
	
	public static LazyClassV1 getInstance() {
		return LazyHolder.INSTANCE;
	}
	private static class LazyHolder {
		private static final LazyClassV1 INSTANCE = new LazyClassV1();
	}
	
}
