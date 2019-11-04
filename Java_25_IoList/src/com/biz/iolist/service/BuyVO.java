package com.biz.iolist.service;

/*
 * ����(����)
 * ��ǰ�� ����
 * 		����(����)�� �ٿ��� �ǸŸ� �ϱ� ���� ���Ż��̳�, ����ȸ��� ����
 * 		��ǰ�� �����ϴ� ��
 */

// ��ǰ�� �����Ҷ� ����� domain class
/*
 * ��¥, date, String
 * ��ǰ�̸�, proName, String
 * �ܰ�, price, int
 * �ΰ���, vat, int
 * ����, qty, int
 * �հ�, total, int
 */
public class BuyVO {


	 private String date;
	 private String proName;
	 private int price;
	 private int vat;
	 private int qty;
	 private int total;
	 
	 
	 
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "BuyVO [date=" + date + ", proName=" + proName + ", price=" + price + ", vat=" + vat + ", qty=" + qty
				+ ", total=" + total + "]";
	}
	 
	 
}
