package com.biz.jack.Exec;

import com.biz.jack.service.GameServiceV1;

public class JackEx_03 {

	public static void main(String[] args) {
		
		GameServiceV1 gs = new GameServiceV1();
		while(true) {
		if (!gs.gameStart("°í´Ï")) break;
		}
		System.out.println("GAME OVER!!");
	}

}
