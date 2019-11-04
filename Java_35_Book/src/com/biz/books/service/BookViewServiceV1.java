package com.biz.books.service;

import java.util.List;

import com.biz.books.domain.BookVO;

public class BookViewServiceV1 {

	List<BookVO> bookList;
	
	// �ܺο��� bookList ���Թ޴� method
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	// ���������� �˻��� �Ͽ� 
	// �ش��ϴ� ���ڿ��� ���Ե� ����Ʈ�� �����ֱ�
	public void serch(String text) {
		this.listTitle();
		for(BookVO vo : bookList) {
			// ���ڿ��� ���ԵǾ� �ֳ�?
			if(vo.getB_title().contains(text.trim())) {
			this.body(vo);
			}
		}
		System.out.println("==========================================");
	}
	
	// ���� ������ �����ؼ� �˻�
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
		System.out.println("��������");
		System.out.println("==========================================");
		System.out.println("\tISBN\t������\t\t���ǻ�\t����\t����");
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
