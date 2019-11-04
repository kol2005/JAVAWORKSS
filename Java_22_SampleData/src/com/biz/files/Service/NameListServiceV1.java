package com.biz.files.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.files.NameService;

public class NameListServiceV1 implements NameService{
	
	protected List<String> nameList1 = null;
	protected List<String> nameList2 = null;
	
	//private Map<String,NameVO> nameList;
	public NameListServiceV1() {
		nameList1 = new ArrayList<String>();
		nameList2 = new ArrayList<String>();
	}
	
	public void readNameList(String nameFile)  throws Exception {
		//nameList = new HashMap<String, NameVO>();
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			//String[] scs = buffer.split(":");
			if(reader == null)break;
			nameList1.add(reader);
			
		}
		System.out.println("이름리스트 완료");
		buffer.close();
		fileReader.close();
		//this.writeNameFile(korNameFile);
	}
	public void readFamList(String famFile) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(famFile);
		buffer = new BufferedReader(fileReader);
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			String[] scs = reader.split(":");
			reader = scs[1];
			String reader1 = reader.substring(0,1);
			
			//String reader1 = reader.substring(3,4);
			
			nameList2.add(reader1);
		}
		System.out.println("성씨리스트 완료");
		buffer.close();
		fileReader.close();
		
		//this.writeNameFile();
	}

	public void writeNameFile(String korNameFile,int length) throws Exception  {
		
		Collections.shuffle(nameList1);
		Collections.sort(nameList2);
		
		
		
		FileWriter fw = new FileWriter(korNameFile);
		for(int i = 0 ; i < length ; i++) {
			//String namesort = (nameList1+nameList2);
			//nameList1.sort(i);
			
			fw.write(nameList2.get(i)+nameList1.get(i)+"\n");
			//Collections.sort(name);
			//Collections.sort(fw);
		}
		fw.close();
		System.out.println("완료");
		
	}


	
}
