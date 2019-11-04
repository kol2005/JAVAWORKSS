package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data1.txt";
		/*
		 * FileWriter Ŭ����(class)�� ����ؼ�
		 * fileWriter ��ü(object = ������ ���� ����)�� ����
		 */
		FileWriter fileWriter;
		
		try {
			/*
			 * fileWriter ��ü�� FileWriter() ������ method �� �̿��ؼ�
			 * �ʱ�ȭ �Ѵ�
			 * fileWriter �� FileWriter 
			 * 	Ŭ������ instance(FileWriter �� ������) �� �ȴ�
			 * 
			 * FileWriter() �����ڴ� ������ ��ο� �̸���
			 * 	�Ű������� �޾Ƽ� ������ ���� �ۼ��Ѵ�
			 * 	�׸��� ���� �ۼ��� ���Ͽ� ���� ������
			 * 	fileWriter ��ü�� ������ �д�
			 * 
			 * FileWriter Ŭ������ ����Ǿ� ����
			 * 	���� method ���� ����ؼ�
			 * 	���� ��ϰ� ���õ� ����� ������ �� �ִ�
			 */
			fileWriter = new FileWriter(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
