package com.biz.books.service;

import java.util.List;

import com.biz.books.domain.BookVO;

public class BookViewServiceV1 {

	List<BookVO> bookList;
	
	// 외부에서 bookList 주입받는 method
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	// 도서명으로 검색을 하여 
	// 해당하는 문자열이 포함된 리스트만 보여주기
	public void serch(String text) {
		this.listTitle();
		for(BookVO vo : bookList) {
			// 문자열이 포함되어 있냐?
			if(vo.getB_title().contains(text.trim())) {
			this.body(vo);
			}
		}
		System.out.println("==========================================");
	}
	
	// 가격 범위를 지정해서 검색
	public void serch(int startPrice, int endPrice) {
		this.listTitle();
		for(BookVO vo : bookList) {
			int price = vo.getB_price();
			if(price >= startPrice && price <= endPrice) {
			this.body(vo);
			}
		}
		System.out.println("==========================================");
	}
	
	private void listTitle() {
		System.out.println("==========================================");
		System.out.println("도서정보");
		System.out.println("==========================================");
		System.out.println("\tISBN\t도서명\t\t출판사\t저자\t가격");
		System.out.println("------------------------------------------");
	}
	
	private void body(BookVO vo) {
		System.out.print(vo.getB_isbn()+"\t");
		System.out.print(vo.getB_title()+"\t");
		System.out.print(vo.getB_comp()+"\t");
		System.out.print(vo.getB_writer()+"\t");
		System.out.print(vo.getB_price()+"\n");
	}
	
	public void view() {
	
	this.listTitle();
	for(BookVO vo : bookList) {
		this.body(vo);
	}
	
	}
}
