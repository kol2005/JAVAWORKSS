package com.biz.iolist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductServiceV2 {

	protected List<String> proNameList;
	protected List<String> productList;
	
	/*
	 * 1. �����̸�.txt �����̸��� proFileName ������ �ޱ�
	 * 2. proFileName ������ �о �����̸� List �� �����ϱ�
	 * 3. ���� ���ڸ� �߻����Ѽ� ���ڰ����� �����Ͽ� 
	 * 4. ���������� ����
	 * 5. �ٸ������� ����Ҽ� �ֵ��� return ����
	 */
	
	public MakeProductServiceV2() {
		
		
		proNameList = new ArrayList<String>();
		productList = new ArrayList<String>();
	}
	public List<String> getProductList(String proFileName) throws Exception {
		
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
			
			// ��ǰ���ݿ� �������� �ݿø��ϰ�
			// 10�� �������� ����ϱ�
			// ������ ������(����)
			price = (int)((price +5)/10)*10;
			price = (int)(((float)price)/10+0.5)*10;
			
			// ��ǰ���ݿ��� 10������ �κ��� �����غ���
			// ��ǰ���ݿ��� ������ �����ϱ�
			price = (int)(price / 10)*10;
						
			String product = String.format("%s:%d", pro,price);
			productList.add(product);
		}
		return productList;
	}

}
