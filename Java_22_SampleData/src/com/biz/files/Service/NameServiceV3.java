package com.biz.files.Service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NameServiceV3 extends NameServiceV2{

	List<String> korNameList;
	
	public NameServiceV3() {
		korNameList = new ArrayList<String>();
		// Collections.sort(), Collections.shuffle() ���� ����Ҵ��
		// LinkedList �� �ʱ�ȭ �ϴ� ���� ȿ�����̴�
		korNameList = new LinkedList<String>();
	}
	
	@Override
	public void writeNameFile(String korNameFile, int length) throws Exception {
		
		Random rnd = new Random();
		int nameSize = nameList.size();
		int famSize = famList.size();
		
		System.out.println("=========================");
		System.out.printf("�̸�ǥ �ۼ� ���� : %d\n",System.currentTimeMillis());
		for (int i = 0 ; i < 1000 ; i++) {
			String strName = famList.get(rnd.nextInt(famSize));
			strName += nameList.get(rnd.nextInt(nameSize));
			
			korNameList.add(strName);
			
		}
		System.out.println("==============================");
		System.out.printf("List �ۼ� �Ϸ� : %d\n",System.currentTimeMillis());
		
		Collections.sort(korNameList);
		System.out.println("---------------------------");
		System.out.printf("���� �Ϸ� : %d\n",System.currentTimeMillis());
		
		PrintWriter fileOut = new PrintWriter(korNameFile);
		for(String s : korNameList) {
			fileOut.println(s);
		}
		fileOut.close();
	}
	
	

}
