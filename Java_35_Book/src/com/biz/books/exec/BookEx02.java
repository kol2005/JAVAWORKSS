package com.biz.books.exec;

import java.util.List;

import com.biz.books.domain.BookServiceV1;
import com.biz.books.domain.BookVO;
import com.biz.books.service.BookViewServiceV1;

public class BookEx02 {

	public static void main(String[] args) {
		String bookFile = "src/com/biz/books/도서정보.txt";
		BookServiceV1 bRead = new BookServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			bView.setBookList(bookList);
			//bView.view();
			bView.serch("스");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
