package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IolistService {

	protected List<String> proList;
	protected List<BuyVO> buyList;
	
	/*
	 * 상품정보.txt 파일을 읽어서
	 * 임의 상품 정보를 추출한 후 
	 * 
	 * 상품매입정보를 생성
	 * 1. 날짜 : 2019-09-26
	 * 2. 단가 : 상품정보의 상품단가에서 부가세를 제외한 금액
	 * 3. 부가세 : 상품정보의 상품단가 - (2번에서 계산한)단가
	 * 4. 수량은 : 10개 부터 100개까지의 임의 수
	 * 5. 합계 : 단가 * 수량
	 * 
	 * 생성된 상품매입정보를 20개 생성하여
	 * buyList 에 추가하기
	 */
	/*
	 *  * 날짜, date, String
	 * 상품이름, proName, String
	 * 단가, price, int
	 * 부가세, vat, int
	 * 수량, qty, int
	 * 합계, total, int
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
			bmvat = (Integer.valueOf(strpl[1]))/10;	//부가세
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
			// 상품가격을 800원 ~ 5000원까지 임의 값을 생성
			//int price = (int)(Math.random()*5000 - 800 + 1)+800;
			
		}
		
	}
	
	/*
	 * 상품정보.txt 파일을 읽어서
	 * 상품이름:가격 형식의 문자열을 리스트로 생성하는 곳
	 * 
	 * proList 에는 다음과 같은 문자열들이 리스트로 만들어져 있을 것이다
	 * 		상품이름:가격
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
