package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IolistService {

	protected List<String> proList;
	protected List<BuyVO> buyList;
	
	/*
	 * ��ǰ����.txt ������ �о
	 * ���� ��ǰ ������ ������ �� 
	 * 
	 * ��ǰ���������� ����
	 * 1. ��¥ : 2019-09-26
	 * 2. �ܰ� : ��ǰ������ ��ǰ�ܰ����� �ΰ����� ������ �ݾ�
	 * 3. �ΰ��� : ��ǰ������ ��ǰ�ܰ� - (2������ �����)�ܰ�
	 * 4. ������ : 10�� ���� 100�������� ���� ��
	 * 5. �հ� : �ܰ� * ����
	 * 
	 * ������ ��ǰ���������� 20�� �����Ͽ�
	 * buyList �� �߰��ϱ�
	 */
	/*
	 *  * ��¥, date, String
	 * ��ǰ�̸�, proName, String
	 * �ܰ�, price, int
	 * �ΰ���, vat, int
	 * ����, qty, int
	 * �հ�, total, int
	 */
	public void buyMake() {
		buyList = new ArrayList<BuyVO>();
		//FileReader fileReader = new FileReader(proFileName);
		//BufferedReader buffer = new BufferedReader(fileReader);
		
		//String reader = new String();
		int count = 0;
		int bmvat=0;
		int bmprice =0;
		for(String s : proList) {
			if(count > 19)break;
			BuyVO bVO = new BuyVO();
			//System.out.println(s);
			String[] strpl = s.split(":");
			bmvat = (Integer.valueOf(strpl[1]))/10;	//�ΰ���
			bmprice = (Integer.valueOf(strpl[1]))-bmvat;
			bVO.setDate("2019-09-26");
			bVO.setProName(strpl[0]);
			bVO.setPrice(bmprice);
			bVO.setVat(bmvat);
			bVO.setQty((int)(Math.random()*100-10+1)+10);
			bVO.setTotal(bmprice*bVO.getQty());
			
			buyList.add(bVO);
			count++;
			System.out.println(bVO.getDate()+":"+bVO.getProName()+":"+bVO.getPrice()+":"+bVO.getVat()+":"+bVO.getQty()+":"+bVO.getTotal());
			// ��ǰ������ 800�� ~ 5000������ ���� ���� ����
			//int price = (int)(Math.random()*5000 - 800 + 1)+800;
			
		}
		
	}
	
	/*
	 * ��ǰ����.txt ������ �о
	 * ��ǰ�̸�:���� ������ ���ڿ��� ����Ʈ�� �����ϴ� ��
	 * 
	 * proList ���� ������ ���� ���ڿ����� ����Ʈ�� ������� ���� ���̴�
	 * 		��ǰ�̸�:����
	 * 
	 */
	public void readProduct(String proFileName) throws Exception {
		
		proList = new ArrayList<String>();
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader==null)break;
			
			if(reader.length() < 1)continue;
			proList.add(reader);
			//buyList.add(e);
		}
		buffer.close();
		fileReader.close();
		
	}
	
}
