package com.biz.list.service;

/*
 * ������ ������ �����ϱ� ���ؼ�
 * Service Ŭ������ ���� �����ε�
 * Service Ŭ������ ���赵�� �ۼ�
 */
/**
 * 
 * @author 505-19
 * @version 2
 * ó�� ���� ��ÿ� ���� input(int count)�� �߰��Ѵ�.
 * input(int count) method �� �ټ��� ���������� �Է¹�����
 * ����� method �� �����Ѵ�
 */
public interface BookService {
	
	// ��� ���������� �Է��� ������
	// �Ű������� ������ ȣ���ϴ� method
	public void input(int count);

	// ���������� �Է¹޾Ƽ� ����Ʈ�� ������ method
	public void input();
	
	//�Էµ� ���� ����Ʈ�� console �� ���� method
	public void list();
	
	// ���� 1���� ������ Ȯ���� method
	// ���°�ΰ��� �˷��ְ� �ش��ϴ� index ��
	// ���� ������ �˻�
	public void view(int index);
	
	// ���� �̸����� �˻��ؼ�
	// �ش��ϴ� �̸��� ������
	// ���� ������ �����ִ� method
	// 1���� ������ �����ִ� ����
	public void view(String strName);
	
	

}
