package com.biz.word.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV1 implements WordQuizService{
	
	// protected
	// ��ӹ��� �������� ����ض�
	// ���� �� Ŭ������ ���������� ����ϰ�
	// ��ӹ��������� wordVOList �� ����Ҽ� �ְ� �Ϸ���
	// protected �� �����϶�
	protected List<WordVO> wordVOList;
	
	
	
	public WordQuizServiceV1() {
		wordVOList = new ArrayList<WordVO>();
	}
	public WordQuizServiceV1(List<WordVO> wordVOList) {
		this.wordVOList= wordVOList;
	}
	
	public void setWordVOList(List<WordVO>wordVOList) {
		this.wordVOList = wordVOList;
	}
	
	// wordVOList ���� ���� 1���� �ܾ �����Ͽ�
	// console �� �����ֽÿ�
	public void viewEngWord() {

		Random rnd = new Random();
		int nSize = wordVOList.size();
		
		int index = rnd.nextInt(nSize);
		
		WordVO wordVO = wordVOList.get(index);
		System.out.println(wordVO.getEngWord());
		

	}

	@Override
	public void quizExec() {
		// TODO Auto-generated method stub
		
	}
	
}
