package com.biz.arrays;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {
		
		// int[] : ���ݺ��� �迭�� �����ϰڴ�
		// intnum : �迭�� �̸��� intnum �� �ϰڴ�
		// new int[100] : �迭�� 100�� ����ڴ�
		int[] intnum = new int[100];
		Random rnd = new Random();
		int index = 0;
		
		/*
		 * 1�� �ڵ� 
		 * ���� �� 1���� ������ �� 
		 * 100���� �迭�� ���� ���� ä�� �ִ´�
		 * 
		 */
		//int intnum = rnd.nextInt(10) + 1;
		//for ( int i = 0 ; i < intnum.length; i++)
		
		
		// 2�� �ڵ�
		// intnum �迭�� ��ҵ��� ���� ������ ä��� ����
		// intnum �迭�� for �ݺ������� ��ҵ��� ��ȸ�ϸ鼭
		// ������ ������ ä�� �ִ´�
		for (int i = 0; i < intnum.length; i++) {
			//�迭�� ������ŭ ��� �ݺ��Ǵ� �ڵ�
			//�̶� i �� 0���� 99(�迭���� - 1 )���� ���Ѵ�
			intnum[i] = rnd.nextInt(10) + 1;
			
			//�ݺ����� �����ϴ� ��������
			// index += ?? ������ ���������� ����Ƿ���
			// index ������ �ݵ�� 0���� ����, �ʱ�ȭ ���־�� �Ѵ�
			if (intnum[i] % 2 == 0) {
				index += intnum[i];
				System.out.println(intnum[i]);
			}
		}
		System.out.println("===================");
		System.out.println("¦���� �� : " + index);
		
		
		//���ٿ� 5�� �׸� ǥ���ϰ��� �Ҷ�
		//�����Ҽ� �ִ� �ڵ�
		
		//i ���� 1�̻��̸� 5�� ����̸�
		//enter ���ڸ� ������ �ٹٲ��� �ϰ�
		for(int i = 0 ; i < intnum.length ; i++) {
			System.out.print(intnum[i]);
			if((i+1)%5 == 0) {
				System.out.println();
				//�׷��� ������ �ĸ�(,)�� ����
			}else {
				System.out.print(" , ");
			}
		}

	}

}
