package com.biz.classes.service.parents;
/*
 * abstract Ŭ���� : �߻�Ŭ����
 * Ŭ������ Ŭ�����ε� �̿ϼ��� ��縸 Ŭ������
 * 
 * �ֿ�뵵
 * �θ�Ŭ�����μ� ������ �����ϴ� Ŭ����
 * = �θ�Ŭ���� : �ֿ���(method)�� �̸� �����ΰ�
 * 		��ӹ��� ������ method �� ����� ����ϵ��� �ϴ� ��
 * 		�����鵵 ������ �ΰ� ��ӹ���������
 * 		��밡���ϵ��� �ϴ� ��
 * �������̽��� ���ҵ� �����ϴ� Ŭ����
 * = ���� �ֿ����� ���������� �ʾ�����
 * 		�� �ʿ��ϴ� �����϶�� ���赵 �����̴�
 * 
 * �߻�Ŭ����
 * �Ϲ�Ŭ�����̸� �������̽��� Ŭ����
 * 
 * �θ�Ŭ�������� ����� ����� �ڽ�Ŭ������ �����ٶ���
 * method �ڵ带 ��� ������ �ϰ�
 * ��ɱ����� �ڽ�Ŭ������ ������ �ϰ��� �Ҷ���
 * abstract method�� �����Ͽ�
 * method �ڵ� ���� ���� �д�
 * 
 * �ڽ�Ŭ���������� �θ�Ŭ������ ����� abstract method�� �ݵ��
 * method ����(prototype)�̶� ������ �� �ξ�߸� �Ѵ�
 * ��, �θ�Ŭ���������� ���� �������� �ʾ�����
 * ��ӹ��� �ڽ�Ŭ�������� ��!!! ������ֱ⸦ �ٶ��
 * method�� �̸� ������ �δ� ���̴�
 * == �߻� method ��� �Ѵ�
 */
public abstract class RemoconABSV2 {

	
	protected String name;
	public RemoconABSV2() {
		this.name = "���� �������Դϴ�";

	}
	
	public void power() {
		System.out.println(name);
		
	}

	public abstract void volUp();

	public abstract void volDown();

	public abstract void ChUp();

	public abstract void ChDown();

	public abstract void setName(String string);

}
