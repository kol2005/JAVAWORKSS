package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {

	private static int[] intKor;

	private static Scanner scanner;

	public static void main(String[] args) {
		intKor = new int[5];
		scanner = new Scanner(System.in);
		for (int i = 0; i < intKor.length; i++) {
			input(i);
		}
		// main()에서 배열의 개수만큼 반복적으로
		// view() 메서드에게 점수를 표시하라고 지시
		for (int i = 0; i < intKor.length; i++) {
			view(i);
		}

		// 아예 intKor 배열을 통째로 view() 메서드에게 보내고
		// 알아서 표시하라고 지시
		view(intKor);
	}// main end

	public static void input(int index) {
		System.out.print((index + 1) + "번의 점수 : ");
		String strnum = scanner.nextLine();
		intKor[index] = Integer.valueOf(strnum);
	}

	public static void view(int index) {
		System.out.println((index + 1) + "번 점수 : " + intKor[index]);
	}

	public static void view(int[] intKor) {
		for (int i = 0; i < intKor.length; i++) {
			System.out.println((i + 1) + "번 : " + intKor[i]);
		}
	}
}
