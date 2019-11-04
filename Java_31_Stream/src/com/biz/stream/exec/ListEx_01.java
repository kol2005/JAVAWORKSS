package com.biz.stream.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.biz.stream.domain.BookVO;

public class ListEx_01 {

	public static void main(String[] args) {
		String objSaveFile = "src/com/biz/stream/bookList.dat";
		
		List<BookVO> bookList = new ArrayList<BookVO>();
		
		BookVO bookVO = new BookVO();
		bookVO.title = "Java����";
		bookVO.comp = "�������ǻ�";
		bookVO.price = 5000;
		bookList.add(bookVO);
		
		bookVO = new BookVO();
		bookVO.title = "����Ŭ";
		bookVO.comp = "�������ǻ�";
		bookVO.price = 30000;
		bookList.add(bookVO);
		
		bookVO = new BookVO();
		bookVO.title = "Do it �ڹ�";
		bookVO.comp = "�����ۺ�";
		bookVO.price = 25000;
		bookList.add(bookVO);
		
		/*
		 *  �������̽��� ������ �߻�Ŭ������ ����Ͽ� ����
		 *  �̶� �� ��ü�� null�� �ʱ�ȭ(clear)�� ���ش�
		 */
		OutputStream os = null;
		ObjectOutput obj = null;
		
		try {
			/*
			 * ������ ����ϱ� ���� ���·� open
			 */
			os = new FileOutputStream(objSaveFile);
			/*
			 * app ������ ���Ǵ� ����, ��ü ���� ���Ϸ�
			 * �����ϱ� ���� ���� Stream �� ����
			 */
			obj = new ObjectOutputStream(os);
			
			/*
			 * �ڹ��� ���κ���(bookList)�� ���Ϸ� ���
			 */
			obj.writeObject(bookList);
			obj.flush();
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
