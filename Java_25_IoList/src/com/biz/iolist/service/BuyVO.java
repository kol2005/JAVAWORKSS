package com.biz.iolist.service;

/*
 * 사입(社入)
 * 상품의 매입
 * 		마진(이익)을 붙여서 판매를 하기 위해 도매상이나, 제조회사로 부터
 * 		물품을 구매하는 것
 */

// 상품을 매입할때 사용할 domain class
/*
 * 날짜, date, String
 * 상품이름, proName, String
 * 단가, price, int
 * 부가세, vat, int
 * 수량, qty, int
 * 합계, total, int
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
