package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_03 {

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
			 * PrintWriter �� ������ ��� ������ ���� �����Ѵ�
			 * append mode �� ������ open �� �� ����
			 * 
			 * ���� file �� append mode �� open �ϰ��� �Ҷ���
			 * �ϴ� FileWriter �� ����ؼ� append mode �� open �� �ϰ�
			 * PrintWriter �� (buffer �����ϰ�) ���� �����Ѵ�
			 */
			
			fileWriter = new FileWriter(fileName,true);
			fileOut = new PrintWriter(fileWriter);
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
