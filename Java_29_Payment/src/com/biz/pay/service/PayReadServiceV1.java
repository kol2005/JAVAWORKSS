package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 외부에서 주입된 pay.txt. 파일이름으로
 * 파일을 열어서 
 * 급여 내역을 문자열형 List 에 담는 코드
 */
public class PayReadServiceV1 {
	
	// 급여내역 문자열형 list 선언
	private List<String> payStrList;
	
	//payStrList 외부에서 사용할 수 있도록 getter() method
	public List<String> getPayStrList(){
		return this.payStrList;
	}
	
	public void readPay(String payFile) throws Exception {
		
		payStrList = new ArrayList<String>();
		
		// 파일을 읽기 위해 open 하고 임시 저장할 buffer 를 선언
		FileReader fileReader = new FileReader(payFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		// buffer 로 부터 문자열을 읽어서 담을 변수선언
		String reader = new String();
		
		//무한반복문을 실행해서
		//파일을 한줄씩 읽어서  수행
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			
			// 다른 가공없이 문자열을 payStrList 바로 추가
			payStrList.add(reader);
			
		}
		buffer.close();
		fileReader.close();
		
	}
	
}
