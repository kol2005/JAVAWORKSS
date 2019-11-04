package com.biz.iolist.model;

/*
 * Ŭ������ �ۼ��Ҷ�
 * �ٸ� Ŭ������ extends(���)���� ������
 * ��� Ŭ������ Object Ŭ������ �ڵ����� ��ӹ޴´�.
 * Object ���� Ŭ������ ��ü�� �����ϰų� �ϴ�
 * ��� method �� �����Ǿ� �ִµ�
 * �� method ���� �ڵ����� ��ӹ޾Ƽ� ����� �� �ִ�
 */
public class BookVO {

	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intYear;
	 
	/* ������ �޼���
	// Ŭ������ �����ϸ�
	// �Ű������� ���� �����ڰ� ������ ������
	// �ڵ����� ���������
	// �ڽ��� �������ִ� �������(�ʵ�)����
	// �ʱ�ȭ �ϵ��� �����Ǿ� �ִ�
	 * 
	 * ������ method�� �ϴ��ϵ�
	 * 1. Ŭ������ ����� �������(�ʵ�)�� �ʱ�ȭ
	 */
	public BookVO() {
		
		// ������ �޼��忡 ������ä �ڵ����� ����Ǵ� �ڵ�
		// ��, ����������� primitive, String �� ��츸 �ش�
		strName = "";
		strWriter = "";
		strComp = "";
		intPrice = 0;
		intYear = 0;
	}
	
	/*
	 * BookVO Ŭ������ ��ü�� �����ϸ鼭
	 * �ܺο��� �������� "�̸�"�� strName�� �Ű������� �޾Ƽ�
	 * ��������� �ʱ�ȭ �Ҷ�
	 * strName = "" ���� ���� �ʰ�
	 * strName �Ű������� ���� ������ �ʱ�ȭ�� �ϰ� �ʹ�
	 * 
	 * new BookVO("Java") �������� �����ڸ� ȣ���ϸ�
	 * this.strName = "Java" �ڵ尡 ����ǵ��� �ϰڴٶ�� �ǹ�
	 * 
	 * ����
	 * �Ű������� ���Ե� �����ڸ� ����� �Ǹ�
	 * 
	 */
	public BookVO(String strName) {
		this.strName = strName;
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
	public int getIntYear() {
		return intYear;
	}
	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}
	
	
	
}
