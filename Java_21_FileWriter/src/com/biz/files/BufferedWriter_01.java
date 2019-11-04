package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data3.txt";
		
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		try {
			// ������ fileWriter -> buffer ������
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			buffer.write("�츮���� ����\n");
			buffer.write("�츮���� ����\n");
			
			//buffer �� �ӽ� ����� �����͸�
			// ���Ͽ� ������ ����ϵ��� �ϴ� method
			buffer.flush();
			buffer.write("Korea\n");
			buffer.write("Republic of korea\n");
			
			// �������� buffer -> fileWriter ������
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
