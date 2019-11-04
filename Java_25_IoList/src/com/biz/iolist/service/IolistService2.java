package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IolistService2 {

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
		
		Random rnd = new Random();
		int nSize = proList.size();
		
		int count = 0;
		int bmvat=0;
		int bmprice =0;
		// pro = ��ǰ�̸�:�ܰ�
		for(int i = 0 ; i < 20 ; i++) {
			
			// proList������ ���������� ���� 1���� ���� �����϶�
			int index = rnd.nextInt(nSize);
			
			//������ ��ǰ���� �����ϱ�
			String strProduct = proList.get(index);
			
			String[] pros = strProduct.split(";");
			
			BuyVO bVO = new BuyVO();
			
			// ��ǰ������ �ִ� �ݾ��� �ϴ� bVO�� price �� ���
			bVO.setPrice(Integer.valueOf(pros[1]));
			
			// ������ ���Ť��ؼ� �ΰ��� ���� �ܰ� ���,
			// �ΰ��� ��� �Ѿ� ���
			
			//�ΰ��� ���� �ܰ� ����
			int intPrice = Integer.valueOf(pros[1]);
			intPrice=(int)(intPrice/1.1);//�ΰ�������
			
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
