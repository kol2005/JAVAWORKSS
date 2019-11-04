package com.biz.collections.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {
	
	public int count;
	private List<String> wordList;
	private String word;
	private List<String> words;
	private Scanner scan;
	
	
	
	public WordService() {
		
		count = 0;
		scan = new Scanner(System.in);
		wordList = new ArrayList<String>();
		wordList.add("yesterday");
		wordList.add("morning");
		wordList.add("tomorrow");
		wordList.add("school");
		wordList.add("computer");
		wordList.add("human");
		
		
	}
	
	public void makeWord() {
		
		// �ܾ�� ����Ʈ�� �� ����
		Collections.shuffle(wordList);
		
		// �� ���� �ܾ� ����Ʈ�� 0��° �ܾ ����
		word = wordList.get(0);
		
		// ����� �ܾ ���ĺ� ������ ����� List �� ��ȯ
		words = Arrays.asList(word.split(""));
		
		// ���ĺ� �� ����
		Collections.shuffle(words);
		
	}
	
	public boolean input() {
		
		if(count < 1) {
			this.makeWord();
		}
		
		System.out.println("=================================");
		System.out.println("�ܾ� ���߱� ����");
		System.out.println("---------------------------------");
		System.out.println("������ ���ĺ��� �� �迭�Ͽ�");
		System.out.println("�ܾ �ϼ��Ͻÿ�");
		System.out.println("---------------------------------");
		System.out.println(words);
		System.out.println("---------------------------------");
		System.out.print("(-1:END)>> ");
		String strKeyIn = scan.nextLine();
		if(strKeyIn.equals("-1")) {
			return true;
		}
		
		if(strKeyIn.equalsIgnoreCase(word)) {
			System.out.println(count + "������ ���߾����ϴ�");
			count = 0;
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�");
			count ++;
		}
		System.out.println("Press Any to Continue...");
		scan.nextLine();
		
		return false;
		
	}
	
}
