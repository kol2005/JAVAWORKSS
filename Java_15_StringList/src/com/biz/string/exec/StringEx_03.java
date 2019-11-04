package com.biz.string.exec;

public class StringEx_03 {

	/*
	 * strNation 에 담긴 문자열을
	 * 역순으로 콘솔에 표시하시오
	 * aeroK fo cilbupeR
	 */
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		String[] strN1 = strNation.split("");
		//int index = strN1.length;
		for (int i  = strN1.length-1 ; i > -1 ; i--) {
			
			//if(i < 0) break;
			System.out.print(strN1[i]);
//			if(i == -1) break;
//			System.out.println(strN1[i]);
			
		}
		//for (index = strN1.length ; index < strN1.length ; index --) {
			//System.out.println(strN1[index]);
		//}
	}

}
