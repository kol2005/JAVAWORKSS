package com.biz.classes.arrays;

public class Array_01 {

	public static void main(String[] args) {
		

		// ���ڿ��� ������ �޸� 10���� �غ��϶�
		String[] str = new String[10];
		
		//�迭�� ��Ҹ� �����ϴ� ���
		//�迭[index] �������� ����
		//index�� "(�迭)÷��" ��� �θ���
		//array index ��� �θ���
		//�迭�� ���(0,1,2)�� ���� ���� (�Ҵ�, ����) �ϱ�
		str[0] = "���ѹα�";
		str[1] = "�츮����";
		str[2] = "Republic of Korea";
		
		//�迭�� ��� 1��° ��ġ ���� �о
		//console �� ���̱�
		System.out.println(str[1]);
		
		/*
		 * str �迭�� 10�� �����Ͽ����Ƿ� 
		 * index�� 0~9������ ����Ҽ� �ִ�
		 * �׷���, 10�� index �� �迭��Ҹ�
		 * console �� ���̶�� ����� ������
		 * ArrayIndexOutOf... exception �� �߻��Ѵ�
		 */
		System.out.println(str[10]);
		
		//�������� ������ �޸� 10���� �غ��϶�
		int[] intNum = new int[10];
		intNum[0] = 10;
		intNum[1] = 30;
		intNum[2] = 40;
		intNum[9] = 100;
		
		//�Ǽ����� ������ �޸� 10���� �غ��϶�
		float[] floatNum = new float[10]; 
		

	}

}
