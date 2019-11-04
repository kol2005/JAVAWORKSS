package com.biz.books.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookServiceV1;
import com.biz.books.domain.BookVO;
import com.biz.books.service.BookViewServiceV1;

public class BookEx03 {

	public static void main(String[] args) {
		String bookFile = "src/com/biz/books/��������.txt";
		BookServiceV1 bRead = new BookServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		Scanner scanner = new Scanner(System.in);
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			bView.setBookList(bookList);
			//bView.view();
			//bView.serch("��");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("==================================");
			System.out.println("�����˻�");
			System.out.println("==================================");
			System.out.println("1.���� 2.���� 0.����");
			System.out.println("----------------------------------");
			System.out.print("���� >>");
			String strN = scanner.nextLine();
			int intM = Integer.valueOf(strN);
			if(intM == 0)break;
			if(intM == 1) {
				System.out.print("����>>");
				String strTitle = scanner.nextLine();
				bView.serch(strTitle);
			}else if(intM == 2) {
				System.out.print("��������>>");
				String sPrice = scanner.nextLine();
				System.out.print("�ִ밡��>>");
				String ePrice = scanner.nextLine();
				try {
					bView.serch(Integer.valueOf(sPrice),Integer.valueOf(ePrice));
				} catch (Exception e) {
					System.out.println("������ ������������ �Է�!!");
				}
			}
		}
		System.out.println("��������!!");
	}

}
