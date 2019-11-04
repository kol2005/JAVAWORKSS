package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class FileCopy_01 {

	public static void main(String[] args) {

		String imgSrcFile = "src/com/biz/stream/2019 (4).png";
		String imgCopyPath = "src/com/biz/stream/";

		Random rnd = new Random();
		/*
		 * �������̽��� ����� ����� �߻�Ŭ����
		 */
		InputStream is = null;
		OutputStream os = null;

		try {
			// �������� open �ϱ�
			is = new FileInputStream(imgSrcFile);
			
			// Random ������ �����̸� ����
			// Math.abs() : ������ ���밪�� ����ϴ� method
			imgCopyPath += Math.abs(rnd.nextInt()) + ".png";
			os = new FileOutputStream(imgCopyPath);
			
			// �ѹ��� ������ �о ������ �뷮
			byte[] bytes = new byte[1024];// 1KByte ũ��

			while (true) {
				/*
				 * FileInputStream �� read() method �� byte �迭�� �Ű������� ������ �ϸ�
				 * ���Ͽ��� ���� ����(data)�� byte �迭�� ��� ������ �ϰ�
				 * byte �迭�� ���� ������ ������ return ���ش�
				 */
				int length = is.read(bytes);
				// read() method �� return �� ���� 1 �̸��̸� 
				// ������ ��� �о��ٶ�� �Ǵ�
				if (length < 1)
					break;
				os.write(bytes);
			}
			is.close();
			os.close();
			System.out.println("File Copy OK!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
