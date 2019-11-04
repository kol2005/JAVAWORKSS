package com.biz.list.model;

/*
 * �������� ���� ���ÿ��� ����� Ŭ����
 * 
 * �߻�ȭ �ܰ�
 * 	1. ������ : name, String, strName
 * 	2. ���� : writer, String, strWriter
 * 	3. ���ǻ� : company, String, strComp
 * 	4. �������� : price, int, intPrice
 * 	5. ���ǿ��� : year, int, intYear
 * 	6. ISBN(Internation Serial Book Number) : num, String, strNum
 */
//	VO : Value Object
//		�����͸� ��� �ּ� Ŭ����
//		1���� ���� ������ ��� �ٱ��Ͽ����� �ϴ� Ŭ����
// VO Ŭ������ ���鶧
// 1. �߻�ȭ �ܰ� : � �������(�ʵ�)�� ������ΰ�
// 2. ��������� �����ϰ�
// 3. �������� : ��������� ���������ڸ� �⺻���� private ���� ����
// 4. ĸ��ȭ : ���е� ��������� �����Ҽ� �ִ� ��θ� ����
//		getter() setter() method �� ����, ����

//		���� vo.strName = "Java" ��� �ڵ��
//		vo Ŭ������ strName ������ Java ���ڿ��� �����Ϸ� �Ҷ�
//		strName ������ private ���� �����
//		setter() �޼��带 ���ؼ� ���� �����ؾ� �Ѵ�

//		��, vo.setstrName("Java")��� �ڵ带 ����ؾ��Ѵ�
//		�츮�� ������ strName �̶�� ���������
//		Java��� ���ڿ��� �����ϴ� �� ���̴�

//		�ᱹ ������ �ϳ�������
//		������ ���� �����ϴ���
//		setter() method �� ���ؼ� �����ϴ��� �� �����̸�
//		vo Ŭ������ setter() �޼��尡
//		���������� � ��(����)�� �����ϴ��� ����
//		������ �޼� �Ҽ� �ִ�
public class BookVO {
	
	private String strNum;
	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intPubYear;
	
	// strNum ������ ���� �б�
	// String num = vo.getStrNum()
	public String getStrNum() {
		return strNum;
	}
	
	// setStrNum("9700001")
	// ������� strNum = "9700001" �̷� �ڵ带 ������ �Ͱ� ����
	public void setStrNum(String strNum) {
		
		// ĸ��ȭ
		// setStrNum() method �� �Ʒ��� ���� �ڵ尡 �ִ���
		// �ܺο����� �ƹ��� ���ɾ���
		int sum = 30 + 40 + 50 + 60 + 70;
		sum += 30;
		sum -= 20;
		
		// this.strnum �� ��������� ����Ų��
		// 			= strNum �� �Ű������� ���� ��������� �Ҵ��϶�
		this.strNum = strNum;
	}
	
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrWriter() {
		return strWriter;
	}
	public void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntPubYear() {
		return intPubYear;
	}
	public void setIntPubYear(int intPubYear) {
		this.intPubYear = intPubYear;
	}
	
	
	
}
