package com.biz.classes.string;

public class String_06 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		String strSearch = "r";
		int intLength = strNation.length();
		int index = 0;
		//5��° ��ġ���� ���ڿ��� �߶� �����޶�
		strNation.substring(5);
		
		//5��° ��ġ���� 8��° �ձ��� ���ڿ��� �߶� �����޶�
		strNation.substring(5, 8);
		
		String strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index-1 + " ��° ��ġ���� ã��");
		
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index-1 + " ��° ��ġ���� ã��");
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index-1 + " ��° ��ġ���� ã��");
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index-1 + " ��° ��ġ���� ã��");
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index-1 + " ��° ��ġ���� ã��");
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index-1 + " ��° ��ġ���� ã��");
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index-1 + " ��° ��ġ���� ã��");
		
	}

}
