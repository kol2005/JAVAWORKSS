package com.biz.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fileWriter;
		BufferedWriter buffer;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			String str = String.format("%20s", "Republic of Korea");
			// buffer.write() method �� �����͸� ����ϸ�
			// �޸��� buffer ������ ����� �����͸� ����Ѵ�
			// buffer �޸� ������ ��������
			// JVM �� OS �� �ڵ����� �ش� ������ ���Ͽ� ����Ѵ�
			buffer.write(str);
			
			// ���� buffer �� ����Ǿ� �ִ� ������ ���Ͽ�
			// ������ ����϶�
			// close()�� ���̴� close()�� �����ϸ�
			// ���̻� write() �� �����Ҽ� ������,
			// flush() �� ������ �Ŀ� write() �� �ٽ� �����ص� �ȴ�
			buffer.flush();
			buffer.write("12345");
			
			// ���̻� ���Ͽ� ����� ���� �ʰڴ�!! ����
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
