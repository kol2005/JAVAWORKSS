package com.biz.iolist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductServiceV1 {

	protected List<String> proNameList;
	protected List<String> productList;
	
	/*
	 * 1. �����̸�.txt �����̸��� proFileName ������ �ޱ�
	 * 2. proFileName ������ �о �����̸� List �� �����ϱ�
	 * 3. ���� ���ڸ� �߻����Ѽ� ���ڰ����� �����Ͽ� 
	 * 4. ���������� ����
	 * 5. �ٸ������� ����Ҽ� �ֵ��� return ����
	 */
	
	public MakeProductServiceV1() {
		
		
		proNameList = new ArrayList<String>();
		productList = new ArrayList<String>();
	}
	public void getProductList(String proFileName,String proWriteFile) throws Exception {
		
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			// if() ������ true �̸� while() �ݺ����� �ߴ��϶�
			if(reader == null)break;
			// if() ������ true �̸� while() ���� �ڵ带 �����ϰ�
			// �ݺ��� ���ۺκ����� jump �϶�
			if(reader.length() < 1) continue;
			proNameList.add(reader);
		}
		buffer.close();
		fileReader.close();
		/*
		 * ������ �б� ���ؼ� FileReader , BufferedReader �� open �� ����
		 * while() �ݺ��� ������ ���پ� �о
		 * �������� ������ �����ϴ� ��������
		 * 
		 * ������� �ð��� �����ɸ��ų�
		 * � exception �� �߻��� Ȯ���� �����̶� �ִٸ�
		 * 		�߰��� �а� �ִ� ������ �ջ�� ���� �ֱ� ������
		 * 
		 * �о���� ���ڿ�(reader ������ ��䰪)��
		 * List<String>type �� list �� ������ �ϰ�
		 * 
		 * ������ close() �� ��
		 * 
		 * ������ list �� ����Ͽ� �ٸ� ������ ��������
		 */
		
		for(String pro : proNameList) {
			// Math : ���п���� ���õ� ���� method() �� ������ �ִ�
			//		Java Ŭ�����̴�
			// Ŭ������ ��ü�� �������� �ʰ�
			// ������ ������ �߻� �� �� �ִ�
			
			// ��ǰ������ 800�� ~ 5000������ ���� ���� ����
			int price = (int)(Math.random()*5000 - 800 + 1)+800;
			String product = String.format("%s:%d", pro,price);
			productList.add(product);
		}
		PrintWriter fileOut = new PrintWriter(proWriteFile);
		for(String pro : productList) {
			
			fileOut.println(pro);
		}
		fileOut.close();
	}
	
}
