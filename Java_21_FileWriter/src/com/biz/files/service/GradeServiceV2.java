package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeServiceV2 extends GradeServiceV1{

	protected List<String> nameList = null;
	protected List<String> nameList2 = null;
	
	
	public GradeServiceV2() {
		nameList = new ArrayList<String>();
		nameList2 = new ArrayList<String>();
		
	}
	// nameFile 을 읽어서 nameList 를 생성
	//
	@Override
	public void readNameFile(String nameFile) throws Exception {
		
		//String fileName = "src/com/biz/files/이름파일.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null; 
				
		fileReader = new FileReader(nameFile);
		buffer = new  BufferedReader(fileReader);
		
		String reader = new String();
		while(true){
			reader = buffer.readLine();
			if(reader == null)break;
			nameList.add(reader);
		}
		buffer.close();
		fileReader.close();
		
		this.nameList();
	}
	
	private void nameList() {
		for(String s : nameList) {
			System.out.println(s);
		}
	}
	
	// nameList 에서 length 개수만큼의 리스트 보이기
	// A0001, 이름 형식으로 리스트를 보이도록
	// 리스트를 console 에 보이도록 코딩
	
	// A0001	원더걸스
	// A0002	샤이니
	// A0003	민호태민
	// A0004	ft아일랜드		
	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {
		
		FileReader fileReader = new FileReader(studentFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		PrintWriter fileOut;
		
		fileOut = new PrintWriter(studentFile);
		Random rnd = new Random();
		//String reader = new String();
		
		
		for(int i = 0 ; i < length ; i++) {
			String reader = buffer.readLine();
			String strNum = String.format("A%03d",i+1);
			int tel1st = rnd.nextInt(9999) +1; // 1 ~ 9999 중의 1개의 숫자
			int tel2st = rnd.nextInt(9999) +1; // 1 ~ 9999 중의 1개의 숫자
			
			String strTel = String.format("010-%04d-%04d", tel1st,tel2st);
			
			int intYear = rnd.nextInt(100) + 1980;
			int intMonth = rnd.nextInt(12) + 1; // 1 ~ 12 중의 1개의 숫자
			int intDay = rnd.nextInt(28) + 1; // 1 ~ 28
			
			String strBirth = String.format("1993-%02d-%02d", intYear,intMonth,intDay);
			
			//console에 보이기
			System.out.printf("%s\t%s\t%s\n",strNum,strTel,strBirth);
			
			//파일에 기록하기
			fileOut.printf("%s:%s:%s\n",strNum,strTel,strBirth);
			fileOut.flush();
			if(reader == null)break;
			nameList2.add(strNum);
			nameList2.add(strTel);
			nameList2.add(strBirth);
			
			
		}
		fileOut.close();
		buffer.close();
		fileReader.close();
		
		this.nameList2();
	}
	private void nameList2() {
		for(String s : nameList2) {
			System.out.println(s);
			//System.out.println();
		}
	}
	

}
