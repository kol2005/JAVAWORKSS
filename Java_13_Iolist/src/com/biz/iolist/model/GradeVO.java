package com.biz.iolist.model;

/*
 * VO Ŭ���� �����
 * 1. private ���� �����ϴ� ��������� ����
 * 2. getter(), setter() �޼��� ����
 * 3. super ������, field ������ ����
 * 4. toString() ����
 * 5. 2 ~ 4 ������ ��Ŭ������ �ڵ��ڵ� ��������� �̿�����
 */
public class GradeVO {
	
	private String strNum;
	private String strName;
	private int intKor;
	
	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GradeVO(String strNum) {
		this.strNum = strNum;
	}
	
	public GradeVO(String strNum, String strName, int intKor) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.intKor = intKor;
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
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	
	/*
	 *  Object Ŭ������ ���ǵ� toString() �޼����
	 *  ��ü�� ������ �ּҸ� �����ִ� �޼����̴�
	 *  ���� �ڹٿ��� ��ü�� ������ (�����) �ּҴ� �� �ǹ̰� ����
	 *  �׷��� vo Ŭ������ ���鶧
	 *  ��Ŭ������ �ڵ��ڵ� �ۼ� ����� �̿��ؼ�
	 *  toString() method�� �� ���� �Ѵ�
	 *  
	 *  �̷��� �� ���Ǹ� �ϸ�
	 *  vo ��ü�� ��������� � ���� setting �� ��
	 *  ������ ���������� ����Ǿ� �ִ°�
	 *  Ȯ���ϴ� �뵵�� toString()�� ����Ҽ� �ִ�
	 */
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + "]";
	}
	
	
	
}
