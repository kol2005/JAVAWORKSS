package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_05 {

	public static void main(String[] args) {
		FileWriter fileWriter;
		String fileName = "src/com/biz/filewriter.data3.txt";
		
		
		try {
			// true �ɼ� : ������ ��� ������ �߰��϶�!!
			// append mode open �̶�� �Ѵ�
			fileWriter = new FileWriter(fileName,true);
			String str = String.format("%s\n", "���ѹα�");
			fileWriter.write(str);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
