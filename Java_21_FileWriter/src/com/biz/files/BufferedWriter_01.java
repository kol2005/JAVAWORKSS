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
			// 생성은 fileWriter -> buffer 순서로
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			buffer.write("우리나라 만세\n");
			buffer.write("우리나라 만세\n");
			
			//buffer 에 임시 저장된 데이터를
			// 파일에 강제로 기록하도록 하는 method
			buffer.flush();
			buffer.write("Korea\n");
			buffer.write("Republic of korea\n");
			
			// 닫을때는 buffer -> fileWriter 순서로
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
