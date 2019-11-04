package com.biz.single.service;
/*
 * ���� ������ �̱�Ŭ������
 * thread ȯ�濡�� �ſ� �Ҿ����� ���·� �����Ѵ�
 * �̷� ���·� �̱�Ŭ������ ����ϰ� �Ǹ�
 * ������Ʈ ���ݿ� ���� �������� ����ų�� �ִ�
 */
public class SingleClassV1 {

	/*
	 * ������Ʈ�� ���۵ɶ�
	 * �ڽ�(SingleClassV1)�� myObject��� �ν��Ͻ���
	 * ������ �ξ��
	 */
	private static SingleClassV1 myObject = new SingleClassV1();;
	/*
	 * Ŭ���� �����ڸ� private���� �����Ͽ�
	 * new SingleClassV1() ������ �ڵ带 ����Ҽ� ������ �Ѵ�
	 */
	private SingleClassV1() {
		//this.myObject 
	}
	
	public static SingleClassV1 getInstance() {
		return myObject;
	}
}
