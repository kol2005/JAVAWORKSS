package com.biz.array.model;

public class MemberVO {
	
	public String strName;
	public String strTel;
	
	/*
	 * MemberVO�� ��� ������ intAge��
	 * ���̸� �����ϴ� �����̴�
	 * ���� �Ǽ��� �����͸� ����(�����Ҷ�)
	 * ���� ���̹����� ����� �����ϸ�
	 * ���߿� ������ �����Ҷ�
	 * ������ ����ų ���� �ִ�
	 * �̷���
	 * ��������� private ���� �����ϰ�
	 * ���� �����Ҷ� method�� ���ؼ� �����ϴ� ����� �ִ�
	 */
	private int intAge;
	
	// �ܺο��� intAge ���� ������ ����� method
	public int getIntAge() {
		return intAge;
	}
	
	//�ܺο��� intAge ������ ���� ����(�Ҵ�)�Ҷ�
	//����� method
	//�ܺο��� setIntAge()�� ȣ���Ҷ�
	//()�ȿ� int�� ���� �����ؼ� ȣ���� �ϸ�
	//�Ʒ� int intAge�� ����� ������ �� ���� �����Ѵ�
	
	//�����Ͽ� intAge ������ ����� ����
	//this.intAge ��������� �ٽ� ����ȴ�
	
	// �� method �� ����ڿ� ���� 
	//���� ��������� ���� �����Ϸ��� �Ҷ�
	//��ȿ�� ������ ������ �̸� �˻��ϰ� 
	//�׷��� ������ ������ �ź��Ѵ�
	//���߿� ���� ��ȸ ������ �ش� ���� 0���� ��Ÿ����
	//�ٸ� ���϶����� ������ ������ ����Ȯ���� ����� �ִ�
	
	//�̷� �ڵ带 ��ȿ�� �˻��ڵ��� �Ѵ�
	
	//�� ������ intAge�� �߸��� �����Ͱ� ����Ǵ� ����
	//�̸� ���µ� �ִ�.
	public void setIntAge(int intAge) {
		
		if(intAge < 0) {
			System.out.println("���̴� 0�� �̻��̾�� �Ѵ�.");
			return;
		}
		if(intAge > 120) {
			System.out.println("���̴� 120�� �����̾�� �Ѵ�.");
			return;
		}
		this.intAge = intAge;
		
	}
	
}
