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
 * �Ϲ�Ŭ�����̸� �������̽��� Ŭ����
 */
public abstract class RemoconABS {

	
	protected String name;
	public RemoconABS() {
		this.name = "���� �������Դϴ�";

	}
	
	public void power() {
		System.out.println(name);
		
	}
	
	public void volUp() {
		System.out.println("���� �ø���");
	}
	public abstract void voldown();
	
	public abstract void ChUp();
	public abstract void Chdown();
}
