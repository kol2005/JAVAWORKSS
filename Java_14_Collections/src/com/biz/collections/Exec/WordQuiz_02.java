package com.biz.collections.Exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordQuiz_02 {

	public static void main(String[] args) {
		
		String word = "yesterday";
		List<String> words = Arrays.asList(word.split(""));
		Scanner scan = new Scanner(System.in);
		
		Collections.shuffle(words);
		System.out.println("���� ���ĺ��� �˸°� �迭�Ͽ� �ܾ ����ÿ�");
		System.out.println(words);
		System.out.println("=======================================");
		System.out.print("�ܾ� ? >>");
		String strWord = scan.nextLine();
		
		if(word.equalsIgnoreCase(strWord)) {
			System.out.println("�¾ҽ��ϴ�!!");	
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�!!");
			System.out.println("�ܾ�� : " + word);
		}

	}

}
