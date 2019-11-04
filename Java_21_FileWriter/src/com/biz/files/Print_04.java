package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_04 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data4.txt";
		
		FileWriter fileWriter = null;
		PrintWriter fileOut = null;
		
		try {
			/*
			 * Java 1.5 ���ʹ�
			 * PrintWriter Ŭ������ �ܵ����� ����ؼ�
			 * ���Ͽ� text �� ����Ҽ� �ִ�
			 * 
			 * 	FileWriter �� ������ open �ϰ�
			 * 	PrintWriter �� ������ �ϸ�
			 * 
			 * 	PrintWriter �� �ι�° �޼��带 �����Ͽ�
			 * 		flush() method �� �ڵ����� ������ �� �ִ�
			 * 
			 * �ڵ� flush �� print() �޼��带 �����Ҷ�����
			 * ����� �Ǵ� �ͤ� �Ӿƴϰ�,
			 * ���ο��� buffer �� ������ �����ϸ鼭
			 * ������ ����Ѵ�
			 * �ڵ� flush �� ���ϴ� ��ŭ�� ��������
			 * 	�������� �ʴ´�
			 */
			
			fileWriter = new FileWriter(fileName);
			fileOut = new PrintWriter(fileWriter,true);
			fileOut.println("�츮���󸸼�");
			fileOut.println(30*40);
			fileOut.println(200%2);
			
			fileOut.printf("%5d\n",30+40);
			fileOut.print("Republic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
