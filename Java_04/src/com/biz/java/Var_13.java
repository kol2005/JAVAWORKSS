package com.biz.java;

public class Var_13 {

	public static void main(String[] args) {
		
		int nC = 0;
		
		//�ֿܼ� ����ϱ� ���� ������ ++�� ���� ���������Ƿ�
		//�ֿܼ� +1 �� ���� ��µȴ�.
		nC++;
		System.out.println(nC);
		
		++nC;
		System.out.println(nC);
		
		/*
		 * ���������ڸ� �ٸ� ��ɹ��� �Բ� ����� ���
		 * ++����(��������), ����++(��������)�� ����
		 * ����� ���� ����� �ٸ��� ��Ÿ���� �ִ�
		 * � ������ ���� ����Ǵ��� �� �����ؾ��Ѵ�
		 * ���� ���� ��ɹ��� 2���� ��ɹ����� �����Ͽ�
		 * ����Ǵ� ���� �� �����ؾ� �Ѵ�
		 */
		System.out.println(nC++);
		// 1.System.out.println(nC++);
		// 2.nC += 1;
		
		
		System.out.println(++nC);
		// 1.nC += 1;
		// 2.System.out.println(++nC);
		

	}

}
