package com.biz.string;

public class String_02 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		//���ڿ��� ������ intLength�� ���
		/*strNation ������ � ���ڿ��� ���� �������
		 * �Ʒ� �ڵ带 �����Ҷ� �ڵ��� ��ȭ����
		 * ������ �����ϱ� ���ؼ�
		 * �ڵ带 ����Ͽ� ���ڿ��� ������ ����.
		 * 
		 */
		int intLength = strNation.length();
		
		//for���� �ݺ�ȸ�� intLength ��ŭ
		//���� i �� ��ȭ�� 0 ~ (intLength - 1) �� �ȴ�
		for(int i = 0 ; i < intLength ; i++) {
			char cA = strNation.charAt( i );
			System.out.println(i + " ��° : " + cA);
		}
		
		System.out.println("===========================");
		
		for(int i = 0 ; i < intLength ; i++) {
			char cA = strNation.charAt( i );
			System.out.print(cA);
		}
		
		

	}

}
