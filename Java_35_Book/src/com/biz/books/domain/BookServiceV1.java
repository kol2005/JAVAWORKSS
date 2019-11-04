package com.biz.books.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.utils.BookSettings;

/*
 * 도서정보.txt 파일을 읽어서
 * 문자열을 콜론(:)을 기준으로 분리하고
 * BookVO에 담은 후 bookList에 추가하는 method를 작성
 */
public class BookServiceV1 {

	private List<BookVO> bookList;
	
	public List<BookVO> getBookList(){
		return bookList;
	}
	
	public BookServiceV1() {
		bookList = new ArrayList<BookVO>();
	}
	public void readBookInfo(String bookFile) throws Exception {
		FileReader fileReader = new FileReader(bookFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		int linenum = 0;
		while(true) {
			linenum ++;
			System.out.println(linenum);
			String str = buffer.readLine();
			if(str == null)break;
			
			String[] strArr = str.split(":");
			//String s = strArr(Integer.valueOf(strArr[7]));
			//s = s.trim(); // 앞뒤 빈칸 제거
			
			BookVO vo = new BookVO();
			/*
			vo.setB_isbn(strArr[0]);
			vo.setB_title(strArr[2]);
			vo.setB_writer(strArr[3]);
			vo.setB_comp(strArr[1]);
			vo.setB_trans(strArr[4]);
			vo.setB_price(Integer.valueOf(strArr[7]));
			//vo.setB_price(Integer.valueOf(s));
			vo.setB_page(Integer.valueOf(strArr[6]));
			vo.setB_date(strArr[5]);
			*/
			vo.setB_isbn(strArr[BookSettings.FILE.ISBN]);
			vo.setB_title(strArr[BookSettings.FILE.TITLE]);
			vo.setB_writer(strArr[BookSettings.FILE.WRITER]);
			vo.setB_comp(strArr[BookSettings.FILE.COMP]);
			vo.setB_date(strArr[BookSettings.FILE.DATE]);
			vo.setB_trans(strArr[BookSettings.FILE.TRANS]);
			
			int page = Integer.valueOf(strArr[BookSettings.FILE.PAGE].trim());
			vo.setB_page(page);
			int price = Integer.valueOf(strArr[BookSettings.FILE.PRICE].trim());
			vo.setB_price(price);
			
			//ISBN 0:출판사 1 :도서명 2:저자 3:역자 4 :발행일 5:페이지 6:가격 7
			/*
			 * ISBN : b_isbn String
			 * 도서명 : b_title String
			 * 저자 : b_writer String
			 * 출판사 : b_comp String
			 * 역자 : b_trans String
			 * 가격 : b_price int
			 * 페이지수 : b_page int
			 * 발행일 : b_date String
			 */
			bookList.add(vo);
			//System.out.println(strArr[0]);
		}
		buffer.close();
		fileReader.close();
	}
}
