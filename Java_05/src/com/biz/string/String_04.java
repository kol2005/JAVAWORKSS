package com.biz.string;

public class String_04 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		// 12��° ��ġ���� �߶� strKorea �� ���
		String strKorea = strNation.substring(12);
		System.out.println(strKorea);
		
		// 2��° ��ġ���� 8�� �ձ��� �߶� strPub�� ���
		String strPub = strNation.substring(2,8);
		System.out.println(strPub);
		

	}

}
