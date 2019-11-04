package com.biz.list.model;
/*
 * ���澾��
 * �ֱٿ� ��Ʈ�� ������ �ϸ鼭
 * ��Ʈ���� �ǸŵǴ� �ŷ������� ������
 * App�� ������� �Ѵ�
 * �ŷ������� ������ Ŭ������ IolistVO�� �ۼ��Ѵ�
 * 
 * �߻�ȭ
 * 	�ŷ����� : date,String
 * 	�ŷ��ð� : time,String
 * 	��ǰ�̸� : pname,String
 * 	��ǰ�ܰ� : price,int
 * 	���� : qty,int
 * 	��ǰ�ݾ� : ��ǰ�ܰ� * ����, total,int
 * 
 */
public class IolistVO {
	
	private String strDate;
	private String strTime;
	private String strPname;
	private int intPrice;
	private int intQty;
	private int intTotal;
	
	// vo ��ü�� �����ϸ鼭
	// 4���� ���� �����Ҽ� �ֵ���
	//�Ű������� �ִ� �����ڸ� �ۼ�
	public IolistVO(String strDate, String strTime, String strPname, int intPrice) {
		this.strDate=strDate;
		this.strTime=strTime;
		this.strPname=strPname;
		this.intPrice=intPrice;
	}
	
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrTime() {
		return strTime;
	}
	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}
	public String getStrPname() {
		return strPname;
	}
	public void setStrPname(String strPname) {
		this.strPname = strPname;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntQty() {
		return intQty;
	}
	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		//this.intTotal = intPrice * intQty;
		this.intTotal = intTotal;
	}
	
	// ��¥,�ð�,��ǰ��,�ܰ�,������ �Ű������� �޴� ������
	public IolistVO(String strDate, String strTime, String strPname, int intPrice, int intQty) {
		this.strDate=strDate;
		this.strTime=strTime;
		this.strPname=strPname;
		this.intPrice=intPrice;
		this.intQty=intQty;
		this.intTotal=intTotal;
	}

}
