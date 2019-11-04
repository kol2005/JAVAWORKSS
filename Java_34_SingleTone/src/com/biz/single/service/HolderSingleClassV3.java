package com.biz.single.service;
/*
 * thread ȯ�濡�� �������� �����Ѵ�
 * = ����ȭ ����
 * 
 * thread ȯ�濡�� �����ڰ� ����ȭ ������ ���� �ذ��ϴ� ����
 * �躸�� ����� �� ��û���� Ŀ���� ����� ���Եȴ�
 * 
 * �پ��� ������� thread safe �ϱ����� 
 * �������� ������ ������Ѵ�
 * 
 * �ü������ ������ �ñ�� ����� ���������
 * JVM ȯ�濡���� �� ���� ������ �ƴϴ�
 * = �ü������ �޸𸮸� �����ϴ� ����� �޶�
 * 		ȣȯ���� ������ ����ų �� �ֱ� ������
 * 
 * Holder ����� JVM�� �ʱ�ȭ(����) �������� ������Ư���� �̿��Ͽ�
 * �̱���Ŭ������ �ʱ�ȭ�� thread ���õ� ������ ���� å����
 * �������� JVM���� ���ӽ�Ų��
 * == ���� ���ɾ�����, JVM �װ� �˾Ƽ� �ش޶�
 * 
 * �ڵ尡 ���� �����ϰ�
 * �ſ� ������(������)�̾ �ֱٿ� ���� ���� ����ϴ� ���
 */
public class HolderSingleClassV3 {

	private HolderSingleClassV3() {
	}
	
	// Inner class
	// Ŭ���� ���ο� �����ϴ� Ŭ����
	private static class InnerHolder {
		public static final HolderSingleClassV3 INSTANCE
		= new HolderSingleClassV3();
	}
	public static HolderSingleClassV3 getInstance() {
		return InnerHolder.INSTANCE;
	}
	
	public void viewName() {
		System.out.println("���� �̱����̴�");
	}
	
}
