package com.biz.iolist.domain;

/*
 * ���Ը�������.txt �� ������ �о
 * ���Ը��� ����Ʈ�� ����ϴ� ������Ʈ
 * 
 * =========================================
 * �ŷ����� ��ǰ�� ���� �ܰ� ����
 * -----------------------------------------
 * 
 * ��°��
 * ==========================================
 * �ŷ����� ��ǰ�� ���� ���� ���Դܰ� ����ܰ� ���Աݾ� ����ݾ�
 * -------------------------------------------
 */
public class IolistVO {
	
	private String strDate;
	private String strPname;
	private String strIo;
	private int intPrice;
	private int intQty;
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrPname() {
		return strPname;
	}
	public void setStrPname(String strPname) {
		this.strPname = strPname;
	}
	public String getStrIo() {
		return strIo;
	}
	public void setStrIo(String strIo) {
		this.strIo = strIo;
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
	@Override
	public String toString() {
		return "IolistVO [strDate=" + strDate + ", strPname=" + strPname + ", strIo=" + strIo + ", intPrice=" + intPrice
				+ ", intQty=" + intQty + "]";
	}

	
	
	
}
