package com.biz.java;

/*
 * ������ Ȱ���Ͽ� ����,���̱� ���� ���� �ּ�ȭ
 * 
 * �ѵ����� �ڵ带 �����Ͽ� ����� ���
 * ���� ������ �ڵ尡 �������� ������ ���忡����
 * ����� ������ �ڵ尡 �ȴ�
 * 
 * �̶� ���� ���� ��, �ڵ��� ������ �ּ������� �ǵ���
 * ���� �ڵ带 �ۼ��ϴ� ���� ����
 */
public class Var_09 {

	public static void main(String[] args) {
		
		int nCount = 0;
		char cA = 'A';
		
		//nCount ���� 1���� ���Ѷ�
		nCount = nCount + 1 ;
		// 1. cA�� ��� ���� A�� ASCII �ڵ� ���� 1�� ���ϰ�
		// 2. ������ ASCII �ڵ尪�� ���ڷ� ��ȯ�Ͽ� 
		// 3. �ٽ� cA ������ �����϶�
		// ==> 'B' ���ڿ��� cA ������ ����
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		nCount = nCount + 1 ;
		cA = (char)(cA + 1);
		
		// %d : ����ǥ�ù���
		// %c : char ǥ�ù���
		//System.out.printf("A���� ���� %d��° ���ڴ� %c �̴�",nCount,cA);
		System.out.printf("A���� ���� %d��° "
				+ "���ڴ� %c �̰� "
				+ "ASCII �ڵ�� %d �̴�",nCount,cA,(int)cA);
		

	}

}
