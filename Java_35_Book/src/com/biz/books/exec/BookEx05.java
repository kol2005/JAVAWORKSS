package com.biz.books.exec;

import java.util.List;

import com.biz.books.domain.BookServiceV1;
import com.biz.books.domain.BookVO;
import com.biz.books.service.ExcelSaveServiceV1;

public class BookEx05 {

	public static void main(String[] args) {
		
		BookServiceV1 bRead = new BookServiceV1();
		ExcelSaveServiceV1 bExcel = new ExcelSaveServiceV1();
		String bookFile = "src/com/biz/books/도서정보.txt";
		String bookSavePath = "src/com/biz/books/";
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			bExcel.setBookList(bookList);
			bExcel.excelSave(bookSavePath+"책가격",10000,13000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
