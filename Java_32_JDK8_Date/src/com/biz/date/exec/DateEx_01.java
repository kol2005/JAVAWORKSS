package com.biz.date.exec;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {

	public static void main(String[] args) {
		
		// old java ���� ����ϴ� ��¥�� ���õ� class 1
		/*
		 * Java ���� ���Ǿ��� Date Ŭ������ 
		 * ��¥�� ���õ� ���� �̽��� ������ �ִ�
		 * Ư�� ��¥�� ���õ� ����(��¥ �� �� ���)����
		 * ��Ȯ���� ���� ���� ����Ǿ�
		 * app �� �ۼ��ϴµ� ���� ������� �־���
		 * 
		 * �̷� ���� ����������
		 * �ǹ����� ��¥�� ���õ� ���� �����ʹ�
		 * ������ ���ڿ��� ��ȯ �ϰų�
		 * �پ��� ������� ������ ������ �Դ� 
		 */
		
		

		// Date date = new Date()
		// Date() �����ڿ� �Ű������� ������� ������
		// JDK 8 �̻�������� ������ ����Ų��
		
		// ���� �ý��� ��¥ ��������
		Date date = new Date(System.currentTimeMillis());
		
		// ��¥�� ���ڿ��� ��ȯ�ϴ� ���
		// 1. SimpleDateFormat �� ����ؼ� ����������ü ����
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		
		// 2. format() method �� ����ؼ� ���ڿ��� ��ȯ
		String curDate = sf.format(date);
		
		// �ð��� ���ڿ��� ��ȯ�ϴ� ���
		// 1. SimpleDateFormat�� ����ؼ� ����������ü ����
		SimpleDateFormat st = new SimpleDateFormat("hh:mm:ss");
		
		// 2. format() method �� ����ؼ� ���ڿ��� ��ȯ
		String curTime = st.format(date);
		
		System.out.println("���� : " + curDate);
		System.out.println("����ð� : " + curTime);
		
		
		
		
	}

}
