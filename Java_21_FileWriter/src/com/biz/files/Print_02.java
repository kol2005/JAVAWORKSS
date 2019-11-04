package com.biz.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data4.txt";
		
		PrintWriter fileOut = null;
		
		try {
			/*
			 * Java 1.5 ���ʹ�
			 * PrintWriter Ŭ������ �ܵ����� ����ؼ�
			 * ���Ͽ� text �� ����Ҽ� �ִ�
			 */
			fileOut = new PrintWriter(fileName);
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
		}

	}

}
