package com.biz.files.grade;

import java.io.IOException;

import com.biz.files.service.FileGradeService;
import com.biz.files.service.FileGradeServiceV2;

public class GradeEx_02 {

	public static void main(String[] args) {
		
		FileGradeService fg = new FileGradeServiceV2();
		String scoreFile = "src/com/biz/files/Score.txt";
		
		try {
			fg.read(scoreFile);
			fg.total();
			fg.list();
		}catch(NumberFormatException e) {
			/*
			 * FileGradeService.read() method �� ����Ǵ� �߿�
			 * ���� ���ڿ��� ���ڸ� ���ڷ� �ٲٴ� ��������
			 * Exception �� �߻��ϸ�
			 * 	throw new NumberFormatException ����
			 * 	Exception �� toss �ϰ�
			 * main() ������ �ش� Exception �� ���ؼ�
			 * �ٸ� Exception �� ó���� �и��Ҽ� �ִ�
			 */
			System.out.println("������ ������ Ȯ���ϼ���!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fg.list();
		

	}

}
