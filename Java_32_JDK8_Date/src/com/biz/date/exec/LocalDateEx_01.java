package com.biz.date.exec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEx_01 {
	
	public static void main(String[] args) {
		/*
		 * Date, Calendar Ŭ������ �پ��� �̽��� �ذ��ϰ�
		 * locale(������, ������)�������� ���׵��� �ذ��Ͽ�
		 * ���ο� Ŭ������ ����
		 * JDK 8 �̻󿡼��� ��밡���ϴ�
		 */
		LocalDate localDate = LocalDate.now();
		
		// ���ڿ��� �����ϱ�
		DateTimeFormatter dDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		String curDate = dDate.format(localDate);
		
		System.out.println("���ó�¥ : " + curDate);
		
		
		
		
		System.out.println(localDate);
	}
}
