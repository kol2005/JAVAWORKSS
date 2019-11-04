package com.biz.blj.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.biz.blj.domain.CardVO;

public class CardServiceV1 implements CardService {

	Map<String,CardVO> cardListVO = null;;
	CardVO cardVO = null;
	
	Scanner scanner = null;
	
	String cardFile;
	
	public CardServiceV1() {
		cardListVO = new TreeMap<String,CardVO>();
		scanner = new Scanner(System.in);
	}
	@Override
	public void readCard(String cardFile) throws Exception {
		
		this.cardFile = cardFile;
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(cardFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader==null)break;
			
			// 파일에서 한줄을 읽어 reader 에 저장된 문자열을
			// 분해(분리)하여 카드정보를 생성
			String[] books = reader.split(":");
			String strimcard1 = books[0];//보여줄 카드
			String strimcard2 = books[1];//계산할 카드
			
			
			
			//if(strimcard1.equals(cardVO)) ;//중복카드 체크
			int intimcard2 = Integer.valueOf(strimcard2);//계산할 카드 인트형 변경
			
			// reader 에서 각 항목별로 분리한 값을 CardVO 에 담기
			CardVO CardVO = new CardVO();
			CardVO.setStrcard1(strimcard1);
			CardVO.setStrcard2(strimcard2);
			CardVO.setStrcard3(strLastDate);
			CardVO.setStrcard4(strRemark);
			
			//리스트에 추가
			cardListVO.put(cardFile, CardVO);
			
			// debugging code
			// bookVO 에 값이 제대로 담겼나를 확인하는 코드
			System.out.println(CardVO.toString());
			
			
		}// end while
		buffer.close();
		fileReader.close();
		
		
		
		

	}

}
