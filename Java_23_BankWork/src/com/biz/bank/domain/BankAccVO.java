package com.biz.bank.domain;

/*
 * ���� ���������� ���� class
 * ���¹�ȣ, num, String
 * ���ܾ�, balance, int
 * �����ŷ�, lastDate,	String
 * �ŷ����, remark,	String
 * ======================================================
 * ���¹�ȣ	���ܾ�	�����ŷ�	�ŷ����
 * ------------------------------------------------------
 * 	0001	100000	2019-09-23	�Ա�
 * 	0002	200000	2019-09-23	���
 */

public class BankAccVO {

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
	
	
}
