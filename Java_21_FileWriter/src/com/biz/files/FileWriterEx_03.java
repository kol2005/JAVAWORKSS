package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data2.txt";
		FileWriter fileWriter;
		
		try {
			/*
			 * FileWriter �� �⺻���� �׻� ������ ���� ����� ��
			 * ���� ������ ������ ������ �� ������ ���
			 * ������ �߰��ϰ� �������� �����ڿ� �ι�° �Ű������� �����Ѵ�
			 * 		�ι�° �Ű������� �⺻���� false �̰�
			 * 		�׻� ������ ���� ����� ��
			 * 
			 * 		�ι�° �Ű������� true �� �����ϸ�
			 * 		������ �������� ���� ����� 
			 * 		������ ������ append mode �� ������ open �Ѵ�
			 */
			fileWriter = new FileWriter(fileName,true);
			fileWriter.write("�츮����\n");
			fileWriter.write("���ѹα�\n");
			fileWriter.write("Republic of Korea\n");
			
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
