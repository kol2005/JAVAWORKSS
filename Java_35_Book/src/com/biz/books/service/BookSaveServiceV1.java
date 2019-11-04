package com.biz.books.service;

import java.io.PrintWriter;
import java.util.List;

import com.biz.books.domain.BookVO;

public class BookSaveServiceV1 {

	private List<BookVO> bookList;
	private PrintWriter fileOut = null;

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	public void print(String saveFile) throws Exception {
		fileOut = new PrintWriter(saveFile);
		this.listTitle();
		for (BookVO vo : bookList) {
			body(vo);
		}
		fileOut.close();
	}

	public void print(String saveFile, String text) throws Exception {
		fileOut = new PrintWriter(saveFile);
		this.listTitle();
		for (BookVO vo : bookList) {
			if (vo.getB_title().contains(text.trim()))
				body(vo);
		}
		fileOut.close();
	}

	public void print(String saveFile, int grPrice, int lessPrice) throws Exception {
		fileOut = new PrintWriter(saveFile);
		this.listTitle();
		for (BookVO vo : bookList) {
			int price = vo.getB_price();
			if (price >= grPrice && price <= lessPrice) {
				body(vo);
			}
			
		}
		fileOut.close();
	}

	private void listTitle() {
		fileOut.println("==========================================");
		fileOut.println("도서정보");
		fileOut.println("==========================================");
		fileOut.println("\tISBN\t도서명\t\t출판사\t저자\t가격");
		fileOut.println("------------------------------------------");
	}

	private void body(BookVO vo) {
		fileOut.print(vo.getB_isbn() + "\t");
		fileOut.print(vo.getB_title() + "\t");
		fileOut.print(vo.getB_comp() + "\t");
		fileOut.print(vo.getB_writer() + "\t");
		fileOut.print(vo.getB_price() + "\n");
	}

}
