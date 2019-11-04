package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_04 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/filewriter.data3.txt";
		FileWriter fileWriter;
		
		try {
			// FileWriter() �������� �ι�° �ɼ�
			// false �ɼ� : ���� ������ �����ϰ� ���� ������ ��
			//		����Ҽ� �ֵ��� open �϶�
			
			// true �ɼ� : ������ ��� ������ �߰��϶�!!
			// append mode open �̶�� �Ѵ�
			fileWriter = new FileWriter(fileName,false);
			String str = String.format("%s\n", "���ѹα�");
			fileWriter.write(str);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
