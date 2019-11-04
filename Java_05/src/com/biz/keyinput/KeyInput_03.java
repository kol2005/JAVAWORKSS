package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String strIn = "";
		
		System.out.println("아무 키나 입력하시오");
		strIn = scanner.nextLine();
		System.out.println("입력문자열 : " + strIn);

	}

}
