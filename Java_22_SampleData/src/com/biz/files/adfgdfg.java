package com.biz.files;

import com.biz.files.Service.NameListServiceV1;

public class adfgdfg {

	public static void main(String[] args) {
		NameService ns = new NameListServiceV1();
		
		String nameFile = "src/com/biz/files/�̸�����Ʈ.txt";
		String nameFile2 = "src/com/biz/files/��������Ʈ.txt";
		
		String filename = "src/com/biz/files/�ѱ��̸�����Ʈ.txt";
		
		try {
			ns.readNameList(nameFile);
			ns.readFamList(nameFile2);
			ns.writeNameFile(filename, 100);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}
}
