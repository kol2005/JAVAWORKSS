package com.biz.classes.model;

/*
 * �л��� ����ó���� ����� VO Ŭ���� ������
 * prototype (�ڵ�) �ۼ�
 * ��ü�� �����ϴ� �ٺ��ڵ�
 * 
 * ����ó���� ���� �ʿ��� �����͵�
 * 
 * �й�, ����, ����, ����
 * ����, ���
 * 
 * �� �������߿���
 * ������ ����� ������ ��������
 * ��¿������ ������ �Է��ؾ��ϴ� �����͵��̴�
 * ������ ����� ������ �����ʹ� �ϴ� ��������� �����Ѵ�.
 */
public class GradeScoreVO {
	public String strNum;
	public int intKor;
	public int intEng;
	public int intMath;
	
	public int total;
	public float average;
	
	/*
	 * ���������� �հ踦 ����� ��
	 * total ��������� ���� ������ ����
	 */
	public void total() {
		total = intKor + intEng + intMath;
	}
	/*
	 * ���������� ����� ����� ��
	 * average ��������� ���� ������ ����
	 */
	public void average() {
		int sum = intKor + intEng + intMath;
		average = sum / 3.0f;
	}
	
	
	
}
