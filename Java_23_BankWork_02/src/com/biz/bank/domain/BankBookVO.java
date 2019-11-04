package com.biz.bank.domain;

/*
 * 
 * ������ �ܰ���� �����͸� �����ϱ� ���� VO ����
 * VO �� �����ϱ� ���� �߻�ȭ �ܰ�
 * ���¹�ȣ, String, num 
 * �����ܾ�, int, balance
 * �����ŷ�����, String, lastDate
 * ����, String, remark
 * 
 */

public class BankBookVO {
	
	// ������� ����
	// ������� = �ʵ�(����)
	private String num;
	private int balance;
	private String lastDate;
	private String remark;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "BankBookVO [num=" + num + ", balance=" + balance + ", lastDate=" + lastDate + ", remark=" + remark
				+ "]";
	}
	
	
	
}
