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
	// nameFile �� �о nameList �� ����
	//
	@Override
	public void readNameFile(String nameFile) throws Exception {
		
		//String fileName = "src/com/biz/files/�̸�����.txt";
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
	
	// nameList ���� length ������ŭ�� ����Ʈ ���̱�
	// A0001, �̸� �������� ����Ʈ�� ���̵���
	// ����Ʈ�� console �� ���̵��� �ڵ�
	
	// A0001	�����ɽ�
	// A0002	���̴�
	// A0003	��ȣ�¹�
	// A0004	ft���Ϸ���		
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
			int tel1st = rnd.nextInt(9999) +1; // 1 ~ 9999 ���� 1���� ����
			int tel2st = rnd.nextInt(9999) +1; // 1 ~ 9999 ���� 1���� ����
			
			String strTel = String.format("010-%04d-%04d", tel1st,tel2st);
			
			int intYear = rnd.nextInt(100) + 1980;
			int intMonth = rnd.nextInt(12) + 1; // 1 ~ 12 ���� 1���� ����
			int intDay = rnd.nextInt(28) + 1; // 1 ~ 28
			
			String strBirth = String.format("1993-%02d-%02d", intYear,intMonth,intDay);
			
			//console�� ���̱�
			System.out.printf("%s\t%s\t%s\n",strNum,strTel,strBirth);
			
			//���Ͽ� ����ϱ�
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
