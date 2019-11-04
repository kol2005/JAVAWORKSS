package com.biz.books.domain;
/*
 * 도서정보를 관리하기 위한
 * 도서정보를 저장, 연산하기 위한 domain class 선언
 * 
 * ISBN : b_isbn String
 * 도서명 : b_title String
 * 저자 : b_writer String
 * 출판사 : b_comp String
 * 역자 : b_trans String
 * 가격 : b_price int
 * 페이지수 : b_page int
 * 발행일 : b_date String
 */
public class BookVO {

	private String b_isbn;
	private String b_title;
	private String b_writer;
	private String b_comp;
	private String b_trans;
	private int b_price;
	private int b_page;
	private String b_date;
	
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVO(String b_isbn, String b_title, String b_writer, String b_comp, String b_trans, int b_price,
			int b_page, String b_date) {
		super();
		this.b_isbn = b_isbn;
		this.b_title = b_title;
		this.b_writer = b_writer;
		this.b_comp = b_comp;
		this.b_trans = b_trans;
		this.b_price = b_price;
		this.b_page = b_page;
		this.b_date = b_date;
	}
	public final String getB_isbn() {
		return b_isbn;
	}
	public final void setB_isbn(String b_isbn) {
		this.b_isbn = b_isbn;
	}
	public final String getB_title() {
		return b_title;
	}
	public final void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public final String getB_writer() {
		return b_writer;
	}
	public final void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	public final String getB_comp() {
		return b_comp;
	}
	public final void setB_comp(String b_comp) {
		this.b_comp = b_comp;
	}
	public final String getB_trans() {
		return b_trans;
	}
	public final void setB_trans(String b_trans) {
		this.b_trans = b_trans;
	}
	public final int getB_price() {
		return b_price;
	}
	public final void setB_price(int b_price) {
		this.b_price = b_price;
	}
	public final int getB_page() {
		return b_page;
	}
	public final void setB_page(int b_page) {
		this.b_page = b_page;
	}
	public final String getB_date() {
		return b_date;
	}
	public final void setB_date(String b_date) {
		this.b_date = b_date;
	}
	@Override
	public String toString() {
		return "BookVO [b_isbn=" + b_isbn + ", b_title=" + b_title + ", b_writer=" + b_writer + ", b_comp=" + b_comp
				+ ", b_trans=" + b_trans + ", b_price=" + b_price + ", b_page=" + b_page + ", b_date=" + b_date + "]";
	}
}
