package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * data.txt. ������ �о �����ġ�� ���� ������ �Ѵ�
 * 1. �ü������ data.txt �� �����״� ����� �ش޶� ��� ��û
 */
public class FileEx_01 {

	public static void main(String[] args) {
		
		String file = "src/com/biz/files/data.txt";
		
		/*
		 * FileReader
		 * �ü������ ������ �����״� ����ش޶� �ϴ� ��û��
		 * �ü���� ����� �ϸ�, ���� ���Ͽ� ���� ������
		 * Java �ڵ忡�� ����Ҽ� �ֵ��� �غ��� �ִ� Ŭ����
		 * �а��� �ϴ� �����̸��� ������ ����� ���� path(���)����
		 * ���ڿ� ���·� �����ϸ鼭 ��ü�� �������ָ� �ȴ�
		 */
		
		FileReader fileReader = null;
		
		try {
			/*
			 * FileReader Ŭ������ ����ؼ� ������ ���� �غ� �����ϴµ�
			 * �˼����� �������� ������ ������ �дµ� ������ �߻��� �Ҽ� �ִ�
			 * �̶�
			 * ���� ������ � ������ �������ų� ������ ���
			 * FileNotFoundException �� �߻��� Ȯ���� �ִ�
			 * 
			 * �׷��� ������ �б� ���� ��ü ����(�ʱ�ȭ)��ɹ���
			 * �ݵ�� try catch ������ ���ε��� �Ǿ��ִ�
			 * 
			 * ���� FileReader �� ���𹮰�
			 * �������� �и��� �ϴµ�
			 * �� ������ fileReader ��ü�� ������ �� �ִ�
			 * scope ������ �ذ��ϱ� ���� ���̴�
			 */
			fileReader = new FileReader(file);
			
			int alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
