package com.biz.exam.domain;

public class BBsVO {
	// 순번,작성자,작성일자,제목,내용,조회수
	//
	private int seq;
	private String auth;
	private int date;
	private String subject;
	private String text;
	private int count;
	
	
	
	public BBsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BBsVO(int seq, String auth, int date, String subject, String text, int count) {
		super();
		this.seq = seq;
		this.auth = auth;
		this.date = date;
		this.subject = subject;
		this.text = text;
		this.count = count;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "BBsVO [seq=" + seq + ", auth=" + auth + ", date=" + date + ", subject=" + subject + ", text=" + text
				+ ", count=" + count + "]";
	}
	

}
