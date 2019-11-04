package com.biz.collections.Exec;

import com.biz.collections.Service.WordService;

public class WordQuiz_03 {

	public static void main(String[] args) {
		
		WordService ws = new WordService();
		//ws.viewWord();
		while(true) {
			if(ws.input()) {
				break;
			}
		}
		System.out.println("GAME OVER");

	}

}
