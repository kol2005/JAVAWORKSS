package com.biz.collections.Exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordQuiz_01 {

	public static void main(String[] args) {
		
		String strWord = "yesterday";
		
		//���ڿ��� ���Ĺ������ �߶� ���ڿ� �迭��
		// ������ִ� method
		String[] words = strWord.split("");
		
		for(int i = 0 ; i < words.length ; i++) {
			System.out.println(words[i]);
			
		}
		
		// Arrays.asList(�迭)
		// �迭�� List �ڷᱸ���� �ٲپ��ִ� method
		List<String> alpahList = Arrays.asList(words);
		System.out.println(alpahList);
		
		Collections.shuffle(alpahList);
		System.out.println(alpahList);
		

	}

}
