package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {

	FileReader fileReader;
	
	// ���� read() method �� ����Ǵ� ����
	// Exception �� �߻��� �ϸ�
	// read() method �� ȣ���� ������
	// Exception �� toss �϶�
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		
		// ��ü ������ �б� ���ؼ� while() �ݺ����� ���
		while(true) {
			
			int intReadChar = fileReader.read();
			// FileReader.read() method ��
			// ���Ͽ��� ���ڸ� �о���� �߿�
			// ��� ������ �� �а� ������ ���� �����ϸ�
			// -1 �� return �Ѵ�
			// read() method �� return ���� ���Ͽ�
			// while() �ݺ����� ��������
			// if(intReadChar == -1) �� ����ص� ������.
			// if(intReadChar < 0) �� �ڵ尡
			// �� ������ �ڵ��̴�
			if(intReadChar < 0 ) break;
			
			System.out.print((char)intReadChar);
			
		}
		// ������ �а� �� �� 
		// OS ���� ���� ������ ��� ����ߴٶ�� �˷��ִ� ����
		// resource(�ڿ�)�� �����ϴ� �ڵ��̴�
		fileReader.close();
	}
	
}
