package com.biz.word.exec;

import java.util.List;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizServiceV1;
import com.biz.word.service.WordQuizServiceV2;

public class WordQuizStart_01 {

	public static void main(String[] args) {
		
		String wordFileName = "src/com/biz/word/�ʼ�����.txt";
		WordListMakeService wk = new  WordListMakeService();
		WordQuizServiceV1 wq = new WordQuizServiceV2();
		
		Scanner scan = new Scanner(System.in);
		
		try {
			wk.makeWordList(wordFileName);
			List<WordVO> wordVOList = wk.getWordVOList();
			wq.setWordVOList(wordVOList);
			
			while(true) {
				System.out.println("===============================");
				System.out.println("�ູ���� ���� ���� V1");
				System.out.println("===============================");
				
				wq.viewEngWord();
				wq.quizExec();
				
				System.out.println("�ƹ�Ű�� ��������....����(-0)");
				String strKey = scan.nextLine();
				if(strKey.equals("-0"))break;
				
			}
			System.out.println("GAME OVER!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
