package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data1.txt";
		
		FileWriter fileWriter = null;
		
		try {
			
			//�׻� fileName �� ������ �����϶�
			// ���� ������ ������ ������ ������ �����ȴ�!!
			fileWriter = new FileWriter(fileName);
			fileWriter.write("Korea\n");
			fileWriter.write("���ѹα�\n");
			fileWriter.write("�츮����\n");
			fileWriter.write(String.format("%05d\n", 1));//00001
			fileWriter.write(String.format("�հ� : %5d\n", 30+40));// 70
			
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
