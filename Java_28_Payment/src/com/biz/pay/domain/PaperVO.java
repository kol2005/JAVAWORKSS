package com.biz.pay.domain;

public class PaperVO {

	private String paper;//�׸鰡
	private int count;//�ż�

	/*
	 * �⺻������
	 */
	public PaperVO() {
	}
	
	/*
	 * �ʵ� ������
	 * �ʵ� ������ ���Թ޾Ƽ� ���� �����Ѵ�
	 */
	public PaperVO(String paper, int count) {
		this.paper = paper;
		this.count = count;
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
