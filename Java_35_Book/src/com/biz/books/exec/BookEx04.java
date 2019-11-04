package com.biz.books.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookServiceV1;
import com.biz.books.domain.BookVO;
import com.biz.books.service.BookSaveServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx04 {

	public static void main(String[] args) {
		String bookFile = "src/com/biz/books/��������.txt";
		String bookSavePath = "src/com/biz/books/";
		BookServiceV1 bRead = new BookServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		BookSaveServiceV1 bSave = new BookSaveServiceV1();
		Scanner scanner = new Scanner(System.in);
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			bView.setBookList(bookList);
			//bView.view();
			//bView.serch("��");
			bSave.setBookList(bookList);
			
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
				
				System.out.print("���Ϸ� ����??(YES/no >>");
				String sOk = scanner.nextLine();
				if(sOk.equals("YES")) {
					try {
						bSave.print(bookSavePath+strTitle+".txt",strTitle);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else if(intM == 2) {
				System.out.print("��������>>");
				String sPrice = scanner.nextLine();
				System.out.print("�ִ밡��>>");
				String ePrice = scanner.nextLine();
				try {
					bView.serch(Integer.valueOf(sPrice),Integer.valueOf(ePrice));
					System.out.print("���Ϸ� ����??(YES/no >>");
					String sOk = scanner.nextLine();
					if(sOk.equals("YES")) {
						try {
							bSave.print(bookSavePath+sPrice+"-"+ePrice+".txt",Integer.valueOf(sPrice),Integer.valueOf(ePrice));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} catch (Exception e) {
					System.out.println("������ ������������ �Է�!!");
				}
			}
		}
		System.out.println("��������!!");
		scanner.close();
	}

}
