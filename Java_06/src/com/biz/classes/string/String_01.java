package com.biz.classes.string;

public class String_01 {

	public static void main(String[] args) {
		
		/*
		 * strNation ���ڿ� �߿��� u ��� ���ڰ�
		 * ���° ��ġ�� �ֳ�?
		 */
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		int num1 = 0;
		
		for(int i = 0 ; i < intLength ; i++) {
			char cA = strNation.charAt( i );
			//System.out.println(i + " ��° " + cA);
			if(cA == 'u') { 
				num1 = i; 
			
			System.out.println("Republic of Korea �� ���ڿ��� u �� "+ i + "��° ���̴�");
			}
		}
		//System.out.println("Republic of Korea �� ���ڿ��� u �� "+ num1 + "��° �̴�");
		
	}

}
