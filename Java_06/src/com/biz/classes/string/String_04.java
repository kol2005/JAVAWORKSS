package com.biz.classes.string;

public class String_04 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		String strSearch = "r";
		int intLength = strNation.length();
		
		//5��° ��ġ���� ���ڿ��� �߶� �����޶�
		strNation.substring(5);
		
		//5��° ��ġ���� 8��° �ձ��� ���ڿ��� �߶� �����޶�
		strNation.substring(5, 8);
		
		String strAt = strNation.substring(0,1);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println("0��° ��ġ���� ã��");

		strAt = strNation.substring(1,2);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println("1��° ��ġ���� ã��");

		strAt = strNation.substring(2,3);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println("3��° ��ġ���� ã��");

		strAt = strNation.substring(3,4);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println("4��° ��ġ���� ã��");

		
		
	}

}
