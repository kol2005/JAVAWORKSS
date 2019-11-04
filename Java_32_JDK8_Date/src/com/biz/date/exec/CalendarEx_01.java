package com.biz.date.exec;

import java.util.Calendar;

public class CalendarEx_01 {

	public static void main(String[] args) {
		
		/*
		 * Java���� Date Ŭ������ ����ؼ� ��¥���õ� ������
		 * �����ϴ� �������� ���� �̽��� �־
		 * ������ ���� Calendar ��� Ŭ������ �������
		 * �׷��� �� Calendar�� ����� ���� �̽��� �״�� 
		 * ������ �ִ�
		 * ������ ��¥ ���õ� ������ Date Ŭ�������� �����ϸ鼭
		 * Calendar�� ����Ѵ�
		 * 
		 * Calendar �� �����ڷ� ��ü�� �����Ҽ� ����!!!
		 * Calendar�� �̱��水ü
		 * 1���� ������Ʈ���� �������� �����ϴ� ��ü
		 * 
		 * ��ü�� ����°� �ƴ϶� �̹� �����Ǿ��ִ� ��ü��
		 * getInstance() method�� ���ؼ� ������ ����
		 */
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("���ؿ��� : " + calendar.get(calendar.YEAR));
		System.out.println("����� : " + calendar.get(calendar.MONTH));
		System.out.println("���� : " + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("����� : " + calendar.get(calendar.HOUR_OF_DAY));//24�ð�
		System.out.println("����� : " + calendar.get(calendar.HOUR));//12�ð�
		System.out.println("����� : " + calendar.get(calendar.MINUTE));
		System.out.println("������ : " + calendar.get(calendar.SECOND));
		
		System.out.printf("%02d:%02d:%02d",calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND));
		
		
		
		

	}

}
