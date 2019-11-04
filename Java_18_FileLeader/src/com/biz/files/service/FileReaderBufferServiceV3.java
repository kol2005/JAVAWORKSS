package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV3 {

	FileReader fileReader;
	BufferedReader buffer;

	public void read(String fileName) throws IOException {

		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		// buffer.readLine() �� ���Ͽ��� ����(~~~\n) �� �д´�
		// buffer.readLine() �� �ݺ��ؼ� ����ɶ�����
		// ����ؼ� �������� ���ڿ��� �о� ���̵��� �Ǿ� �ִ�
		// ���Ͽ� ����� ������ �ټ� ��ŭ buffer.readLine()��
		// �ݺ��ؼ� �����ϸ�
		// ������ ��� ������ ���� �� ���� ���̴�.
		
		String reader = ""; 
		// reader ���� null�� �ʱ�ȭ �߱� ������
		// while ���� ���� ������ �ȵȴ�
		/*
		while (reader != null) {
			reader = buffer.readLine();
			if(reader == null)break;
			System.out.println(reader);
		}
		*/
		/*
		 * ���� buffer ���� ������ �а�
		 * console �� ǥ���Ѵ���
		 * null �� �ƴϸ� ����ؼ� �������� �о��
		 */
		do {
			reader = buffer.readLine();
			System.out.println(reader);
		}while(reader != null);
		// close() method �� resource �� �ݳ��ϴ� ���
		// close() �����Ҷ���
		// buffer �� ���� close() �϶�
		buffer.close();
		fileReader.close();
	}

}
