package com.biz.list.model;

public class StudentVO {

	// private ��������� �ܺο��� ���� �������� ���ϵ���
	// ������ �ϰڴ�.
	private int intNum;
	private String strName;

	private String strDept; // ����
	private int intGrade; // �г�

	private String strTel;
	private String strAddr;
	
	// private ���� ����� ��������� ������ �� �ֵ���
	// ��θ� �����ϴµ�
	
	// getter(), setter()
	// private ���� ���� ���е� ���������
	// �ܺο��� ������ �� �ֵ���
	// ��� ������ �����ϴ� method
	
	// �й� ������� ���� ���� method
	public int getIntNum() {
		return intNum;
	}
	
	// �й� ��������� ���� ������ method
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrDept() {
		return strDept;
	}

	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	
	

}
