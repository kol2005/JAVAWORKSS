package com.biz.files.exec;

import com.biz.files.service.GradeService;
import com.biz.files.service.GradeServiceV2;

public class GradeEx_04 {

	public static void main(String[] args) {
		
		// �̹� �ִ����� : ���� ����
		String nameFile = "src/com/biz/files/�̸�����.txt";
		
		// ���� �ۼ��� ����
		String studentFile = "src/com/biz/files/�̸�����.txt";
		String scoreFile = "src/com/biz/files/�����϶�ǥ.txt";
		
		int intMens = 30; // ������ ������ �����Ұ��ΰ�
		
		GradeService gs = new GradeServiceV2();
		
		try {
			gs.makeScoreFile(scoreFile, intMens);
			gs.readNameFile(nameFile);
			gs.makeScoreFile(studentFile, intMens);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���õ����� ���� �Ϸ�");
		
		
	}

}
