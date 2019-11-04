package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV2 {

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
		
		while (true) {
			String reader = buffer.readLine();
			if(reader == null)break;
			System.out.println(reader);
		}
		// close() method �� resource �� �ݳ��ϴ� ���
		// close() �����Ҷ���
		// buffer �� ���� close() �϶�
		buffer.close();
		fileReader.close();
	}

}
