package com.biz.date.exec;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeEx_01 {

	public static void main(String[] args) {
		
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		System.out.println("����:"+local.getYear());
		System.out.println("�̴�:"+local.getMonth());
		System.out.println("����:"+local.getDayOfYear());
		
		System.out.printf("%02d:%02d:%02d\n",local.getHour(),local.getMinute(),local.getDayOfYear());
		
		// local ������ ��� ��¥�� 3�� plus�� ��¥
		local.plusDays(3);
		System.out.println(local.plusDays(3).toString());// +3��
		System.out.println(local.minusDays(3).toString());// -3��
		System.out.println(local.plusMonths(3).toString());// +3����
		System.out.println(local.minusMonths(3).toString());// -3����
		
		System.out.println(local.plusHours(3).toString());// +3�ð�
		System.out.println(local.minusHours(3).toString());// -3�ð�
		
		System.out.println(local.with(TemporalAdjusters.firstDayOfYear()));// ���� ù��
		System.out.println(local.with(TemporalAdjusters.firstDayOfNextYear()));// ���� ù��
		System.out.println(local.with(TemporalAdjusters.lastDayOfYear()));// ���� ��������
		System.out.println(local.with(TemporalAdjusters.firstDayOfMonth()));// �̴��� ù��		
		System.out.println(local.with(TemporalAdjusters.lastDayOfMonth()));// �̴��� ��������
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));// �̴��� ù��° ������ ��¥
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));// �̴��� ù��° �Ͽ��� ��¥
		System.out.println(local.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY)));// �̴��� ������ ������ ��¥
		System.out.println(local.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));// �̴��� ������ �ݿ��� ��¥
		System.out.println(local.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));// ������ �Ͽ���
		System.out.println(local.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));// ���� �����ؼ� ������ �Ͽ��� ���� ������ �Ͽ����̸� ���ó�¥
		System.out.println(local.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)));// ������ �Ͽ���
		System.out.println(local.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)));// ���� �����ؼ� ������ �Ͽ��� ���� ������ �Ͽ����̸� ���ó�¥
		
		// ������ �ð� ����
		LocalDateTime makeDateTime = LocalDateTime.now();
		
		makeDateTime = makeDateTime.withYear(2000);
		makeDateTime = makeDateTime.withMonth(9);
		makeDateTime = makeDateTime.withDayOfMonth(29);
		
		makeDateTime = makeDateTime.withHour(10);
		makeDateTime = makeDateTime.withMinute(12);
		makeDateTime = makeDateTime.withSecond(22);
		
		System.out.println("�ð����� : "+makeDateTime.toString());
		
		LocalDateTime t = LocalDateTime.now();
		
		int curMonth = t.getYear();
		int p3Month = t.plusYears(2).getYear();
		
		System.out.printf("%d - %d = %d",p3Month,curMonth,p3Month-curMonth);
		
		
		
		
		
		
		

	}

}
