package com.biz.files.exec;

import com.biz.files.service.GradeService;
import com.biz.files.service.GradeServiceV2;

public class GradeEx_03 {

	public static void main(String[] args) {
		
		GradeService gs = new GradeServiceV2();
		
		String nameFile = "src/com/biz/files/�̸�����.txt";
		String studentFile = "src/com/biz/files/�л����.txt";
		
		try {
			gs.readNameFile(nameFile);
			gs.makeStudentFile(nameFile, 30);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
