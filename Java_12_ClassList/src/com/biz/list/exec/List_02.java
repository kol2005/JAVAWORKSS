package com.biz.list.exec;

import com.biz.list.service.BookService;
import com.biz.list.service.BookServiceImpV1;

/*
 * ������������ Ű���忡 �Է� �޾Ƽ�
 * ����Ʈ�� �����
 * ����Ʈ�� console �� ���̴� �ڵ�
 */
public class List_02 {
	
	public static void main(String[] args) {
		
		BookService bs = new BookServiceImpV1();
		
		// bs.input(); // 1���� ���������� �Է¹޾ƶ�
		
		// interface �� �������� ����
		// input(int count) method �� ȣ���ؼ� ����Ϸ���
		// bs ��ü�� BookServiceImpV1 class �� ����ȯ�� �ؾ��Ѵ�
		// �� �ڵ�� ���ؼ� interface�� Ȱ���ϴ� �ǹ̰�
		//		�Ϻ� ����ȴ�
		// �׷��� 
		// ���� input(int count) ó�� ó���� interface �� ���鶧
		// ���� method �� ����Ϸ���
		// ������ �����ڿ��� ��û�Ͽ�
		// interface �� ����ϵ��� �ϴ°��� ���� ���
		//((BookServiceImpV1)bs).input(3);
		bs.input(3);
		bs.list();
		bs.view(2);
	}

}
