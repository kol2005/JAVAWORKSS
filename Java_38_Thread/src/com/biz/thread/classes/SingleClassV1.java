package com.biz.thread.classes;

/*
 * �Ϲ����� SingleTone Ŭ����
 * single thread ȯ�濡���� �޸� ������ �����ϴ� ������ �´�
 * ������ multi thread ȯ�濡���� ����ȭ ������ ����Ű��
 * ���δ� SingleTone�� �ƴ� �ټ��� ��ü�ν��Ͻ��� ������ ���� �ִ�
 * ==> ����ȭ�� ������ ������ ���
 */
public class SingleClassV1 {

	private static SingleClassV1 singleClassV1;
	
	public int sum;
	
	static {
		// ������ ����ȭ�� ������ ��� �ټ��� �ν��Ͻ��� �����Ǵ� ����
		// �����ϴ� �ڵ�
		if(singleClassV1 == null) {
			singleClassV1 = new SingleClassV1();
		}
	}
	
	private SingleClassV1() {
		//if(singleClassV1 == null) {
		//	singleClassV1 = new SingleClassV1();	
		//}
	}
	
	public static SingleClassV1 getInstance() {
		return singleClassV1;
	}
}
