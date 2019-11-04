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
			
			// ���Ͽ��� ������ �о� reader �� ����� ���ڿ���
			// ����(�и�)�Ͽ� ī�������� ����
			String[] books = reader.split(":");
			String strimcard1 = books[0];//������ ī��
			String strimcard2 = books[1];//����� ī��
			
			
			
			//if(strimcard1.equals(cardVO)) ;//�ߺ�ī�� üũ
			int intimcard2 = Integer.valueOf(strimcard2);//����� ī�� ��Ʈ�� ����
			
			// reader ���� �� �׸񺰷� �и��� ���� CardVO �� ���
			CardVO CardVO = new CardVO();
			CardVO.setStrcard1(strimcard1);
			CardVO.setStrcard2(strimcard2);
			CardVO.setStrcard3(strLastDate);
			CardVO.setStrcard4(strRemark);
			
			//����Ʈ�� �߰�
			cardListVO.put(cardFile, CardVO);
			
			// debugging code
			// bookVO �� ���� ����� ��峪�� Ȯ���ϴ� �ڵ�
			System.out.println(CardVO.toString());
			
			
		}// end while
		buffer.close();
		fileReader.close();
		
		
		
		

	}

}
