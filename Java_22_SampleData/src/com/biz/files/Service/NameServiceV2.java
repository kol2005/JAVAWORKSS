package com.biz.files.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.biz.files.NameService;

public class NameServiceV2 implements NameService {

	List<String> nameList;
	List<String> famList;
	
	//Ŭ���� �̸��� ���� �̸��� method �̰�
	// return type �� ����(void, int...)
	public NameServiceV2() {
		nameList = new ArrayList<String>();
		famList = new ArrayList<String>();
	}
	@Override
	public void readNameList(String nameFile) throws Exception {
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			
			nameList.add(reader);
			
		}
		buffer.close();
		fileReader.close();
		
		
		//=================debuging code============
		for(String s : nameList) {
			System.out.println(s);
			System.out.println("�̸�����Ʈ �Ϸ�");
		}
		//==========================================
	}

	// 1. 
	@Override
	public void readFamList(String famFile) throws Exception {
		FileReader fileReader = null;
		BufferedReader buffer = null;
		fileReader = new FileReader(famFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			
			// reader ���� �ѱۼ����� �����ϱ�

			String[] fams = reader.split(":");
			
			//fams[1] ������ �߿��� ù���� 1���� �ʿ�
			//1���̳� 2���� ����
			//1���ڵ�
			String fam = fams[1].substring(0,1);
			
			//fams[1] ������ �߿��� ù���� 1���� �ʿ�
			// 2���ڵ�
			String[] fams1 = fams[1].split("");
			fam = fams1[0];
			
			
			famList.add(fam);
			
		}
		buffer.close();
		fileReader.close();
		//System.out.println("��������Ʈ �Ϸ�");
		//=================debuging code============
		for(String s : famList) {
			System.out.println(s);
		}
		//==========================================

	}

	@Override
	public void writeNameFile(String korNameFile, int length) throws Exception {
		
		Collections.shuffle(nameList);
		Collections.shuffle(famList);
		
		int nameSize = nameList.size();
		int famSize = famList.size();
		
		PrintWriter fileOut = new PrintWriter(korNameFile);
		String strName = "";
		
		// 1���ڵ�
		for(int i = 0; i < 100 ; i++) {
			strName = famList.get(i)+nameList.get(i);
			System.out.println(strName);
			fileOut.println(strName);
		}
		System.out.println("==================================");
		
		// 2���ڵ�
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i++ ) {
			strName = famList.get(rnd.nextInt(famSize));
			strName += nameList.get(rnd.nextInt(nameSize));
			System.out.println(strName);
			fileOut.println(strName);
		}
		fileOut.close();

	}

}
