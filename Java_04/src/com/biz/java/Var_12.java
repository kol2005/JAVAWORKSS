package com.biz.java;

public class Var_12 {

	public static void main(String[] args) {
		
		int nCount = 0;
		
		nCount = nCount + 1;
		System.out.println("ī��Ʈ 1 : " + nCount);
		
		nCount += 1;
		System.out.println("ī��Ʈ 2 : " + nCount);
		
		System.out.println("ī��Ʈ 3 : " + (nCount++));
		//�����ڵ� ������ ���� 2�� ����ȴ�.
		//System.out.println("ī��Ʈ 3 : " + (nCount++));
		// nCount += 1;
		
		
		System.out.println("ī��Ʈ 4 : " + nCount);
		System.out.println("ī��Ʈ 5 : " + (++nCount));
		// �����ڵ�� ������ ���� 2�� ����
		// nCount += 1;
		//System.out.println("ī��Ʈ 5 : " + (++nCount));
		
		
		
		
		int n = (nCount++) +1;
		//���� �ڵ��
		//int n = nCount + 1;
		//nCount += 1;

	}

}
