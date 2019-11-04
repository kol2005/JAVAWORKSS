package com.biz.for_if;

public class Boolean_01 {

	public static void main(String[] args) {
		
		//java에서 기본적으로 제공하는 변수 형
		// primitive 변수형
		
		// 변수 형 (type)의 종류
		int intnum1 = 0; // 4byte 크기의 값을 저장하는 정수
		long longnum2 = 0l; // 8byte 크기의 값을 저장하는 정수
		
		float floatnum =0.0f; // 정밀도가 일반형인 정수
		double dublenum = 0.0; //배 정밀도의 갖는 실수
		
		boolean byes = true; // true, false 만을 갖는 변수
		boolean bno = false; // 
		
		byes = 3 == 3; //우측에 있는 3 == 3 연산식이 참이냐?
		bno = 3 > 3; //우측에 있는 3 > 3 연산식이 참이냐?
		
		char ca= 'A'; //한개의 문자를 저장, 1byte, 2byte
		
		// 변수의 기본형이 아니고 class 라는 형태의 
		//특별한 type 이며
		//사용법은 일반 변수와 같이 사용하면 된다
		String strname = "대한민국"; //문자열을 저장하는 변수
		
		byes = 3 == 3; //true 가 byes에 저장
		byes = 3 > 3; //false 가 byes에 저장
		
		byes = 3 != 3; // 3과 3이 다르냐? , false 가 byes에 저장
		byes = !byes; // byes 값을 역전(Inverter, NOT 연산)
		
		int n = 1;
		n *= -1; // n의 값을 -1로 변환
		n *= -1; // n의 값을 다시 1로 변환
		n = -n; // n의 값을 양수와 음수를 역전
		n = -n; // n의 값을 양수와 음수를 역전
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
