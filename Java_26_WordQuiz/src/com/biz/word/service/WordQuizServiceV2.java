package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV2 extends WordQuizServiceV1{
	
	// wordVO �� ����Ŭ������ ��� method �� �����ִ�
	// 
	protected WordVO wordVO;
	int nCount ;
	
	public WordQuizServiceV2() {
		nCount = 0;
	}
	
	// V1 ���� ����� wordVOList �� ����ϱ� ���ؼ� ����
	//List<WordVO> wordVOList;
	
	// v1 ���� ����� setWordVOList() �� ����ϱ� ���ؼ� ����
	//public void setWordVOList(List<WordVO>wordVOList) {
	//	this.wordVOList = wordVOList;
	//}
	
	// wordVOList ���� ���� 1���� �ܾ �����Ͽ�
	// console �� �����ֽÿ�
	
	// wordVOList ���� ���� 1���� �����ܾ �����Ͽ�
	// ���Ĺ��� ������ ������ �� 
	// �������� ��� console�� ���̽ÿ�
	public void viewEngWord() {
		
		// �ܾ� ���߱⸦ 1���̶� Ʋ������ ������
		// nCount�� 0 ���� Ŭ���̰�
		// �׷��� �̹� �����Ǿ��ִ� wordVO ��
		// private viewEngWord(wordVO)���� ������
		// �ٽ��ѹ� �ڼ��� �� �����ֱ�
		if(nCount > 0){
			System.out.println();
			this.viewEngWord(wordVO);
			return;
		}

		// ���ο� �ܾ�� ������ �Ǵ� ���
		// ������ ���ʷ� ������ ���
		// �տ��� �ܾ ������ ���
		Random rnd = new Random();
		int nSize = wordVOList.size();
		
		int index = rnd.nextInt(nSize);
		
		wordVO = wordVOList.get(index);
		

		this.viewEngWord(wordVO);
	
		
		//String str = wordVO.getEngWord();
		//for ( int i = 0 ; i < str.length() ; i ++) {
			//Collections.shuffle(wordVOList);
			//Collections.shuffle(str.charAt(i));
			//System.out.println(str.charAt(i));
			
		//}
		//wordVO = 
		
		

	}
	
	private void viewEngWord(WordVO wVO) {
		
		// �ӽ��ڵ� ���� ������ �ڵ�
		//System.out.println(wVO.getEngWord());
		
		String word = wVO.getEngWord();
		String[] words = word.split("");//���Ĺ������ ����
		
		// ���ڿ� �迭�� ���ڿ��� List �� �ٲٴ� ���
		List<String> quizWords = Arrays.asList(words);
		
		// ���׹��� ���� ���
		for(int i = 0 ; i < quizWords.size(); i++) {
		Collections.shuffle(quizWords);
		}
		System.out.println(quizWords);
		
		// abc ������ �����ϴ� ���
		Collections.sort(quizWords);
		System.out.println(quizWords);
		
		
	}
	
	/*
	 * viewEngWord() method ���� �ڼ��� ������ �ܾ���
	 * ������ Ű����� �Է¹ް�
	 * �´��� Ʋ������ �����ִ� �ڵ� 
	 */
	
	
	public void quizExec() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.print("�ܾ��Է� ��Ʈ(H)>>");
		String str1 = scanner.nextLine();
		if(str1.equals("H")) {
			System.out.println(wordVO.getKorMeans());
			int half = wordVO.getEngWord().length() /2;
			System.out.println(wordVO.getEngWord().substring(0,half));
			System.out.println("--------------------------------");
		}
		
		if(str1.equals(wordVO.getEngWord())) {
			System.out.println("--------------------------------");
			System.out.println("�¾Ҿ��");
			System.out.println("�õ�Ƚ�� : "+(nCount+1));
			System.out.println("--------------------------------");
			System.out.println(wordVO.getKorMeans());
			System.out.println("--------------------------------");
			nCount = 0;
		}else {
		System.out.println("--------------------------------");
		System.out.println((nCount+1)+"�� Ʋ�Ⱦ��");
		/*
		System.out.println("��Ʈ����(H)>>");
		String strH = scanner.nextLine();
				if(strH.equals("H")) {
					System.out.println("--------------------------------");
					System.out.println(wordVO.getKorMeans());
					System.out.println("--------------------------------");
				}
				*/
		nCount++;
		}
		//System.out.println(wordVO.getKorMeans());
	}
	
}
