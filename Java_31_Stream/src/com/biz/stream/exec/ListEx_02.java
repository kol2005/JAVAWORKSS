package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

import com.biz.stream.domain.BookVO;

public class ListEx_02 {

	public static void main(String[] args) {
		
		String objSaveFile = "src/com/biz/stream/bookList.dat";
		
		/*
		 * �������̽��� ������ �߻�Ŭ������ ����
		 * null ������ �ʱ�ȭ(clear)
		 */
		InputStream is = null;
		ObjectInput obj = null;
		
		try {
			/*
			 * ������ �б� ���·� open
			 */
			is = new FileInputStream(objSaveFile);
			/*
			 * ���Ͽ� ����� ������ ���� ������ ���(ȯ��)�ϱ� ����
			 * ���� Stream ����
			 */
			obj = new ObjectInputStream(is);
			
			/*
			 * ���� ������ ���
			 * ����� ���� type�� �״�� ���� ���־�� �Ѵ�
			 * 
			 * �ټ��� ������ ��ü�� ����Ҷ���
			 * ������ ������� ����ؾ� �Ѵ�
			 */
			List<BookVO> bookList = (List<BookVO>)obj.readObject();
			obj.close();
			
			for(BookVO vo : bookList) {
				System.out.print(vo.title + "\t");
				System.out.print(vo.comp + "\t");
				System.out.print(vo.price + "\n");
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
