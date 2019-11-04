package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/filewriter/data.txt";
		
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("���ѹα�����"); // String
			fileWriter.write(96); // char �� �ڵ�, ASCII
			for(int i = 97 ; i < 124 ; i++) {
				fileWriter.write(i);
			}
			
			// \n �� ���� ASCII
			// Enter Ű ��
			fileWriter.write(13);
			// char �� ���������� ������ ASCII �ڵ尪�� int ����
			// �����ϱ� ������ int ���� �����Ͽ� �ڵ� �ۼ��� ����
			for(int i = 'A' ; i <= 'Z' ; i++) {
				fileWriter.write(i);
			}
			
			
			
			// ������ ����Ҷ�
			// write() �޼���� ���� ������ ���������
			// JVM �� �ӽ÷� �����ġ ��򰡿� ��Ƶд�
			// ���� close() �����ʰ� ������Ʈ�� ������
			// JVM �� ��Ƶ� �����ʹ� �����������
			// close() �� �����ϸ�
			// JVM �� OS ���� �ش� �����͸� �����ϰ�
			// ���Ͽ� ����ش޶�� ��û�� �����Ѵ�
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
