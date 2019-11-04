package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx_01 {

	public static void main(String[] args) {
		
		String imgFile = "src/com/biz/stream/2019 (1).png";
		
		/*
		 * ������ byte ������ ���� �� �ִ� class
		 * text file, �׸�����, ��������, �������� �� ��������� ���� �� �ִ�
		 */
		// 1. Stream Ŭ������ ��ü �����Ҷ� �ϴ� null ������ �ʱ�ȭ�� �϶�
		FileInputStream fs = null;
		
		try {
			// 2. ���� ������ open�Ͽ� ���� �غ� �ϰ�
			fs = new FileInputStream(imgFile);
			int input = 0;
			while(true) {
				// 3. 1byte �� �о ������ ����
				input = fs.read();
				if(input == -1)break;//������ ��� �о����� �ݺ���
				
				//input ������ ��� ���� 16������ ǥ��
				System.out.printf("%02X\n",input);
			}
			// 4. ������ �бⰡ ������ ������ ����
			fs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		System.out.println("Hello Korea!!!");

	}

}
