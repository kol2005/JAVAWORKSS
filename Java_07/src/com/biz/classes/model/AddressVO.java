package com.biz.classes.model;

public class AddressVO {
	
	//�̸�, ��ȭ��ȣ, �ּ�, ����
	public String strName;
	public String strTel;
	public String strAddr;
	public String strChain;
	
	public void view() {
		System.out.println("�̸� : " + strName);
		System.out.println("��ȭ��ȣ : " + strTel);
		System.out.println("�ּ� : " + strAddr);
		System.out.println("���� : " + strChain);
		
	}
	

}
