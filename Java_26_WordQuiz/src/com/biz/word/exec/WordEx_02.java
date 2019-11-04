package com.biz.word.exec;

import java.util.List;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizServiceV1;
import com.biz.word.service.WordQuizServiceV2;

public class WordEx_02 {

	public static void main(String[] args) {
		
		
		String wordFileName = "src/com/biz/word/�ʼ�����.txt";
		WordListMakeService wk = new  WordListMakeService();
		WordQuizServiceV1 wq = new WordQuizServiceV1();
		wq = new WordQuizServiceV2();
		
		// wk ���� wordVOList �� ����� ��������
		try {
			// 1. ������ �о list �� ������ �ξ��
			wk.makeWordList(wordFileName);
			
			// 2. ���� list �� ��������
			List<WordVO> wordList = wk.getWordVOList();
			
			// 3. wq ���� wordList �� �����ϱ�
			wq.setWordVOList(wordList);
			
			// 4. wq ���� ���Ե� wordList �߿� �Ѱ��� �����Ͽ�
			//		���ܾ �ֿܼ� ������
			wq.viewEngWord();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		

	}

}
