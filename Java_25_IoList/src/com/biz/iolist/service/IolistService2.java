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
		
		Random rnd = new Random();
		int nSize = proList.size();
		
		int count = 0;
		int bmvat=0;
		int bmprice =0;
		// pro = 상품이름:단가
		for(int i = 0 ; i < 20 ; i++) {
			
			// proList개수의 범위내에서 정수 1개를 임의 생성하라
			int index = rnd.nextInt(nSize);
			
			//임의의 상품정보 추출하기
			String strProduct = proList.get(index);
			
			String[] pros = strProduct.split(";");
			
			BuyVO bVO = new BuyVO();
			
			// 상품정보에 있는 금액을 일단 bVO의 price 에 담기
			bVO.setPrice(Integer.valueOf(pros[1]));
			
			// 계산식을 사요ㅕㅇ해서 부가세 별도 단가 계산,
			// 부가세 계산 총액 계산
			
			//부가세 별도 단가 생성
			int intPrice = Integer.valueOf(pros[1]);
			intPrice=(int)(intPrice/1.1);//부가세별도
			
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
