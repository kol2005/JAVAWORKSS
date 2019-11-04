package com.biz.classes.model;
/*
 * ~~~VO Ŭ����
 * Value Object Ŭ����
 * 	����ó���� �Ҷ� �⺻���� ������(�������)�� ������
 * 	ó���Ҷ� ����ϴ� Ŭ����
 */
public class BookVO {
	
	public String strTitle;
	public String strComp;
	public String strAuth;
	public int intPrice;
	
	/*
	 * �����͸� ó���ϴ� ��������
	 * �� ��������� ���� �����ϰ� ó���ϴµ�
	 * � ������ �߻����� ���
	 * ��������� ���� ��Ȯ�� ����Ǿ����� Ȯ���ϴ� �뵵
	 */
	
	public void view() {
		System.out.println("������ : " + strTitle);
		System.out.println("���ǻ� : " + strComp);
		System.out.println("���� : " + strAuth);
		System.out.println("���� : " + intPrice);
		
	}

	//���� �������� ����Ʈ�� Ȯ���Ҷ� ����� method
	public void list() {
		System.out.printf("%s\t%s\t%s\t%d\n",
				strTitle,
				strComp,
				strAuth,
				intPrice);
		
	}
}
