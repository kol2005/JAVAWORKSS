package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data.txt" ;
		
		FileReader fileReader ;
		
		try {
			// fileName ���� ������ text ������
			// ���� �� �ֵ��� �غ��϶�
			// fileReader ��ü(�ν��Ͻ�)����
			// ������ �дµ� �ʿ��� �������� ������ ����ִ�
			fileReader = new FileReader(fileName);
			
			// fileReader ��ü�� ��� ���� ������ ����Ͽ�
			// �Ѱ��� ���ڸ� �о 
			// ASCII �ڵ�� �޶�
			int intChar = fileReader.read();
			System.out.print(intChar);//�ڵ尪�� 10������
			System.out.print(" : ");
			System.out.println((char)intChar);//� �����ΰ�?
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
