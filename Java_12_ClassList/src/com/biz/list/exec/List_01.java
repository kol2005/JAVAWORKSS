package com.biz.list.exec;

import com.biz.list.model.BookVO;

public class List_01 {

	public static void main(String[] args) {
		
		// �������� 1���� �����ͷ� �����
		BookVO bookVO = new BookVO();
		
		// �������� ������ ����
		bookVO.setStrNum("970001");
		bookVO.setStrName("Do It Java");
		bookVO.setStrWriter("������");
		bookVO.setStrComp("�����ۺ���");
		bookVO.setIntPrice(25000);
		bookVO.setIntPubYear(2018);
		
		// ����� ������ Ȯ��
		System.out.println("ISBN : " + bookVO.getStrNum());
		System.out.println("������ : " + bookVO.getStrName());
		System.out.println("���� : " + bookVO.getStrWriter());
		System.out.println("���ǻ� : " + bookVO.getStrComp());
		System.out.println("���� : " + bookVO.getIntPrice());
		System.out.println("���ǿ��� : " + bookVO.getIntPubYear());
		
		

	}

}
