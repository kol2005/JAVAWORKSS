package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.domain.ScoreVO;

public class FileGradeV1 implements FileGradeService{

	List<ScoreVO> scoreList;

	public FileGradeV1() {
		scoreList = new ArrayList<ScoreVO>();

	}

	public void read(String fileName) throws IOException {
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		// ���ڿ� ������ �ƹ��͵� ���� ������ clear �� �Ҷ���
		// = "" ���� new String() �����ڸ� �������
		// String reader = "";
		String reader = new String();

		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;
			/*
			 * score.txt �� ������ ���� ��
			 * �й�,����,����,���� �׸����� ���ظ� �Ѵ�
			 * scores[0] : �й�
			 * scores[1] : ����
			 * scores[2] : ����
			 * scores[3] : ����
			 */
			String[] scores = reader.split(":");
			String strNum = scores[0];
			

			int intKor = 0;
			int intEng = 0;
			int intMath = 0;
			
			try {
				intKor = Integer.valueOf(scores[1]);
				intEng = Integer.valueOf(scores[2]);
				intMath = Integer.valueOf(scores[3]);	
			} catch (Exception e) {
				System.out.println(strNum + " �� �л��� ���� Ȯ��!!");
				break;
			}
			
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setStrNum(strNum);
			scoreVO.setIntKor(intKor);
			scoreVO.setIntEng(intEng);
			scoreVO.setIntMath(intMath);
			
			scoreList.add(scoreVO);
		}
		buffer.close();
		fileReader.close();

	}

	@Override
	public void list() {
		
		System.out.println("===============================================");
		System.out.println("�����϶�ǥ");
		System.out.println("===============================================");
		System.out.println("�й�\t����\t����\t����");
		System.out.println("-----------------------------------------------");
		for(ScoreVO vo : scoreList) {
		System.out.print(vo.getStrNum()+"\t");
		System.out.print(vo.getIntKor()+"\t");
		System.out.print(vo.getIntEng()+"\t");
		System.out.print(vo.getIntMath()+"\n");
		
		
		}
		System.out.println("===============================================");
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		
	}

}
