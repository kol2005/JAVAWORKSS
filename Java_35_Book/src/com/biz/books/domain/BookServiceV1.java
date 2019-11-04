package com.biz.books.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.utils.BookSettings;

/*
 * ��������.txt ������ �о
 * ���ڿ��� �ݷ�(:)�� �������� �и��ϰ�
 * BookVO�� ���� �� bookList�� �߰��ϴ� method�� �ۼ�
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
			//s = s.trim(); // �յ� ��ĭ ����
			
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
			
			//ISBN 0:���ǻ� 1 :������ 2:���� 3:���� 4 :������ 5:������ 6:���� 7
			/*
			 * ISBN : b_isbn String
			 * ������ : b_title String
			 * ���� : b_writer String
			 * ���ǻ� : b_comp String
			 * ���� : b_trans String
			 * ���� : b_price int
			 * �������� : b_page int
			 * ������ : b_date String
			 */
			bookList.add(vo);
			//System.out.println(strArr[0]);
		}
		buffer.close();
		fileReader.close();
	}
}
