package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader Ŭ����
 * text ������ ���� �о ���ڴ�����
 * CPU �� �����Ͽ� ������ �����Ҷ� ���
 * 
 * ������ direct �� �о ó���� �ϱ� ������
 * ������ �ſ� ũ��
 * App ���� �ӵ��� �����ϰ� ��������
 */
public class FileReaderServiceV2 {
	
	FileReader fileReader = null;
	
	/*
	 * ���� read(String fileName) method �� ����Ǵ� ����
	 * exception �߻��� �ϸ�
	 * read() method �� ȣ���� ������ exception �� toss �϶�
	 */
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		
		while(true) {
			int al = fileReader.read();
			if(al < 0) break;
			System.out.print((char)al);
		
		}
		
	}

}
