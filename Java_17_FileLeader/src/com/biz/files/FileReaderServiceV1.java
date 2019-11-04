package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {
	
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
			/*
			 * fileReader.read() method �� ����������
			 * ������ ��� ���� ���� �� method �� �����ϸ�
			 * al ������ -1 �� ����
			 * �׷��� ��Ȥ , ������ ��� ���� ����
			 * -1 ���� �� ����(����) ������ ������ ��찡 �ִ�
			 * �̷��� == -1 �� ����ϸ�
			 * break ���� �ǳʶٰ� ���� �ڵ带 �����Ͽ�
			 * ���� �ڵ忡�� ������ �߻��� ���� �ִ�
			 * 
			 * �̷� ������ �����ϱ� ���ؼ�
			 * if(al == -1) �� �ƴ�
			 * if(al < 0) �� �ڵ带 �������
			 */
			if(al < 0) break;
			System.out.printf("%d : %c\n",al, al);
		
		}
		
	}

}
