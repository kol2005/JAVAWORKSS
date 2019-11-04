package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_02 {

	public static void main(String[] args) {
		
		String file = "src/com/biz/files/data.txt";
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(file);
			
			while(true) {
			
			int al = fileReader.read();
			if(al < 0)break;
			
			System.out.print(al+" : ");
			System.out.println((char)al);
			
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ����");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("������ �д� ���� ���� �߻�");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("� exception �̶� ó�� ����");
		}
		

	}

}
