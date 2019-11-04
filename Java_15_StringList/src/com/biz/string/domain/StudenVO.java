package com.biz.string.domain;
/*
 *  VO(Value Object) Ŭ�������� �����ϴ� package �̸�
 *  	model, domain, command
 *  
 *  Dto(Date Transfer Object)
 *  	VO �� ���ӻ��� ���� ����
 *  	VO �� ȥ���ؼ� ����ϴ� ��쵵 �ִ�
 *  
 *  	�Ϻ� ������Ʈ ����, ���������� VO�� �����ؼ�
 *  	����� �Ѵ�.
 *  
 *  
 */

public class StudenVO {
	
	// �������, �ʵ�, �Ӽ�
	private String strNum;
	private String strName;
	private String strAddr;
	private String strTel;
	private int intAge;
	
	
	
	public StudenVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudenVO(String strNum, String strName, String strAddr, String strTel, int intAge) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.intAge = intAge;
	}
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public int getIntAge() {
		return intAge;
	}
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}
	@Override
	public String toString() {
		return "StudenVO [strNum=" + strNum + ", strName=" + strName + ", strAddr=" + strAddr + ", strTel=" + strTel
				+ ", intAge=" + intAge + "]";
	}
	

}
