package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.word.domain.WordVO;

public class WordListMakeService {
	
	protected List<String> wordStrList;
	protected List<WordVO> wordVOList;
	
	// wordStrList �� wordVOList �� �ܺο��� �������� ���� method
	public List<String> getWordStrList() {
		return wordStrList;
	}
	public List<WordVO> getWordVOList() {
		return wordVOList;
	}

	/*
	 * wordFileName ������ ���
	 * ���ڿ��� �о� ���� ����
	 * �ܾ�: �ǹ� ������ ���ڿ��� ������ ����
	 * wordStrList �� ���
	 */
	public void makeWordList(String wordFileName) throws Exception {
		
		wordStrList = new ArrayList<String>();
		wordVOList = new ArrayList<WordVO>();
		
		FileReader fileReader = new FileReader(wordFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			
			reader = buffer.readLine();
			if(reader==null)break;
			
			String[] words = reader.split(":");
			// words[0] : ���� , words[1] : ���ܾ� , words[2] : �ǹ�
			// ���ܾ�� �ǹ̸� ����Ͽ� ���ο� ���ڿ��� �����Ͽ�
			// wordStrList �� �߰��ϱ�
			
			String word = String.format("%s:%s", words[1],words[2]);
			wordStrList.add(word);
			
			WordVO wordVO = new WordVO();
			wordVO.setEngWord(words[1]);
			wordVO.setKorMeans(words[2]);
			wordVOList.add(wordVO);
			
			
		}
		buffer.close();
		fileReader.close();
		
	}
	
	
}
