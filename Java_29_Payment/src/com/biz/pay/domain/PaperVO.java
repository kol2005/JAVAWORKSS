package com.biz.pay.domain;

public class PaperVO {

	private String member;
	private String paper;// ȭ���� �׸鰡 �̸� 50000��
	private int count;//�׸鰡�� ���� ȭ���� �ż�
	
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
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
	@Override
	public String toString() {
		return "PaperVO [paper=" + paper + ", count=" + count + "]";
	}
}
