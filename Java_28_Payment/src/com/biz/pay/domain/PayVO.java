package com.biz.pay.domain;

public class PayVO {

	private String paper;//�׸鰡
	private int count;//�ż�
	private String strnum;// �����ȣ
	private int pay;//�޿�
	
	
	
	public PayVO(String paper, int count, String strnum, int pay) {
		this.paper = paper;
		this.count = count;
		this.strnum = strnum;
		this.pay = pay;
	}
	public PayVO() {

	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStrnum() {
		return strnum;
	}
	public void setStrnum(String strnum) {
		this.strnum = strnum;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "PayVO [paper=" + paper + ", count=" + count + ", strnum=" + strnum + ", pay=" + pay + "]";
	}
	
	
	
}
