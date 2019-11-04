package com.biz.dp.domain;

public class StudentVO {
/*
 * ��������
 * Ŭ������ �ʵ�(�������)�� private �����ϴ� ��
 * �ܺο��� �ʵ忡 ���� ����(�б�, ����)�� ���ϵ��� ���� ��
 * 
 * ĸ��ȭ
 * Ŭ���� ���ο��� ����� �Ͼ���� �ܺο����� ���� �ȴ�
 * 
 * getter() setter() �ܺο��� ���������� ���� �Ҽ� �ִ� ��θ� ����
 * �ܼ��� ���� ��� �Ӹ� �ƴ϶�
 * ���ο��� �ʵ忡 � ������ �����ϰ�
 * ���� ������ �� �ܺο� �����ϰų�
 * 
 * �ܺο��� ���ԵǴ� ���� �����ϴ� �ڵ带 �߰��Ͽ�
 * ������� �߸��� �����Ͱ� �ʵ庯���� �߰��Ǵ� ���� ���� ��
 * 
 * �������а� ĸ��ȭ�� �ϰ���
 * ���� ���� �����͸�  VO�� ���ؼ� ó���� �Ϸ���
 * 	��) � ���� VO�� ��Ƽ� ����Ʈ�� �߰��ϴ� ��
 * ��ü�� �����ϰ�, getter() �̿��ؼ� �ʵ庯���� ���� 
 * �Է��ϴ� ���� �����Ѵ�
 * �� ����� ����� ���ŷӰ� �ۿ��ϴ� ��찡 �ִ�
 * 
 *  getter() method�� �̿��ؼ� �������� �����ϱ� ���ؼ�
 *  �����ڿ� ���� �����ϰ� ��ü�� �����ϴ� ����� ����Ѵ�
 */
	private String st_num;
	private String st_name;
	private String st_tel;
	private String st_addr;
	private int st_grade;
	private String st_dept;
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(String st_num, String st_name, String st_tel, String st_addr, int st_grade, String st_dept) {
		super();
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_tel = st_tel;
		this.st_addr = st_addr;
		this.st_grade = st_grade;
		this.st_dept = st_dept;
	}
	public String getSt_num() {
		return st_num;
	}
	public void setSt_num(String st_num) {
		this.st_num = st_num;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_tel() {
		return st_tel;
	}
	public void setSt_tel(String st_tel) {
		this.st_tel = st_tel;
	}
	public String getSt_addr() {
		return st_addr;
	}
	public void setSt_addr(String st_addr) {
		this.st_addr = st_addr;
	}
	public int getSt_grade() {
		return st_grade;
	}
	public void setSt_grade(int st_grade) {
		this.st_grade = st_grade;
	}
	public String getSt_dept() {
		return st_dept;
	}
	public void setSt_dept(String st_dept) {
		this.st_dept = st_dept;
	}

	
	
}
