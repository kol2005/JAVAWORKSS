package com.biz.books.exec;

import com.biz.books.domain.BookServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx01 {

	public static void main(String[] args) {
		
		BookServiceV1 bs = new BookServiceV1();
		//BookViewServiceV1 
		String bookFile = "src/com/biz/books/도서정보.txt";
		
		try {
			bs.readBookInfo(bookFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
