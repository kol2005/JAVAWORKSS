package com.biz.classes.string;

public class String_07 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		String strSearch = "r";
		int intLength = strNation.length();
			
		for(int i = 0 ; i < intLength ; i++) {
		String strAt = strNation.substring( i , i + 1 );
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(i + " ��° ��ġ���� ã��");
		}
	}

}