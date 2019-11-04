package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * �ܺο��� ���Ե� pay.txt. �����̸�����
 * ������ ��� 
 * �޿� ������ ���ڿ��� List �� ��� �ڵ�
 */
public class PayReadServiceV1 {
	
	// �޿����� ���ڿ��� list ����
	private List<String> payStrList;
	
	//payStrList �ܺο��� ����� �� �ֵ��� getter() method
	public List<String> getPayStrList(){
		return this.payStrList;
	}
	
	public void readPay(String payFile) throws Exception {
		
		payStrList = new ArrayList<String>();
		
		// ������ �б� ���� open �ϰ� �ӽ� ������ buffer �� ����
		FileReader fileReader = new FileReader(payFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		// buffer �� ���� ���ڿ��� �о ���� ��������
		String reader = new String();
		
		//���ѹݺ����� �����ؼ�
		//������ ���پ� �о  ����
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			
			// �ٸ� �������� ���ڿ��� payStrList �ٷ� �߰�
			payStrList.add(reader);
			
		}
		buffer.close();
		fileReader.close();
		
	}
	
}
