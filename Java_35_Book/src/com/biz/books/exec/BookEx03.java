package com.biz.books.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookServiceV1;
import com.biz.books.domain.BookVO;
import com.biz.books.service.BookViewServiceV1;

public class BookEx03 {

	public static void main(String[] args) {
		String bookFile = "src/com/biz/books/도서정보.txt";
		BookServiceV1 bRead = new BookServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		Scanner scanner = new Scanner(System.in);
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			bView.setBookList(bookList);
			//bView.view();
			//bView.serch("스");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("==================================");
			System.out.println("도서검색");
			System.out.println("==================================");
			System.out.println("1.제목 2.가격 0.종료");
			System.out.println("----------------------------------");
			System.out.print("선택 >>");
			String strN = scanner.nextLine();
			int intM = Integer.valueOf(strN);
			if(intM == 0)break;
			if(intM == 1) {
				System.out.print("제목>>");
				String strTitle = scanner.nextLine();
				bView.serch(strTitle);
			}else if(intM == 2) {
				System.out.print("최저가격>>");
				String sPrice = scanner.nextLine();
				System.out.print("최대가격>>");
				String ePrice = scanner.nextLine();
				try {
					bView.serch(Integer.valueOf(sPrice),Integer.valueOf(ePrice));
				} catch (Exception e) {
					System.out.println("가격은 숫자형식으로 입력!!");
				}
			}
		}
		System.out.println("업무종료!!");
	}

}
