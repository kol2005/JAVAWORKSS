package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			/*
			 * ���� ������ writer �ϱ����� open �� ���¿���
			 * ���� �ݺ�(loop) ���¿� ������ �Ǹ�
			 * �� ������ �ƹ���(���μ���) ����Ҽ� ���� �ȴ�
			 * ������� �ü�� ���¿��� ������ �Ϸ��� �Ҷ���
			 * ������ ���� ���� �� �ִ�(�ü�� ����� �� ���� ����)
			 * 
			 * �б� ���� open �� ���� close() ���� �ʾƵ� �ϴ�
			 * ū ������ ����Ű�� ������
			 * ����� ���� open �� ���� �ݵ�� close() ����!!
			 * 1. ����� ������ ���Ͽ� ��Ȯ�� �����ϱ� ���ؼ�
			 * 2. open �� ���·� ��ġ�Ǿ� ������ ����Ű�� �ʵ��� �ϱ� ���ؼ�
			 */
			while(true) {
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
