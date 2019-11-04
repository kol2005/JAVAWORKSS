package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *  FileReader ������ text ������ �б⸦ �ϸ�
 *  OS�� JVM, App ���̿��� �����Ͱ� �̵��Ǹ鼭
 *  �����͸� �д� ���� ���μ����� ���ߵǾ�
 *  �ſ� ��ȿ�����̰�, ����� ������ �����ϰ� �ִ�
 *  
 *  �׷��� ������α׷��ֿ����� 
 *  ������ ���� �о� �޸𸮷� �����͸� �������� ��ſ�
 *  �߰��� ������ġ�� �ξ �����ϰ� ������ ���� �� �ֵ���
 *  �ϰ� �ִ�
 *  
 *  Java ������ ���� ���� �⺻���� ������
 *  BufferedReader ��� Ŭ������ �����ϰ� �ִ�
 *  
 *  Java ���� text ������ �о �޸𸮷� �����ö���
 *  FileReader >> BufferedReader �� �����Ͽ�
 *  �����ϰ� ������ �о� �ü� �ֵ��� �Ѵ�
 */
public class FileReaderBufferServiceV1 {

	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		// fileReader ��ü�� ��� �����б� ������
		// bufferedReader ���� �����ϸ�
		// fileReader �� buffer ���̿���
		// �̹� ���ϳ����� �о
		// �޸� ��򰡿� �����ϰ� �����ϰ� ���� ���̴�
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		// buffer ���� ����(~~~~~\n)�� �б� ���ؼ�
		// readLine() �޼��带 ����Ѵ�
		String reader = buffer.readLine();
		
	}
	
}
