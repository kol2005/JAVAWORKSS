package com.biz.date.exec;

import java.util.Calendar;

public class CalendarEx_01 {

	public static void main(String[] args) {
		
		/*
		 * Java에서 Date 클래스를 사용해서 날짜관련된 연산을
		 * 수행하는 과정에서 많은 이슈가 있어서
		 * 개선을 위해 Calendar 라는 클래스를 만들었다
		 * 그런데 이 Calendar도 상당히 많은 이슈를 그대로 
		 * 가지고 있다
		 * 하지만 날짜 관련된 연산을 Date 클래스에서 제거하면서
		 * Calendar를 사용한다
		 * 
		 * Calendar 는 생성자로 객체를 생성할수 없다!!!
		 * Calendar는 싱글톤객체
		 * 1개의 프로젝트에서 공통으로 공유하는 객체
		 * 
		 * 객체를 만드는게 아니라 이미 생성되어있는 객체를
		 * getInstance() method를 통해서 가져다 쓴다
		 */
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("올해연도 : " + calendar.get(calendar.YEAR));
		System.out.println("현재월 : " + calendar.get(calendar.MONTH));
		System.out.println("오늘 : " + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("현재시 : " + calendar.get(calendar.HOUR_OF_DAY));//24시간
		System.out.println("현재시 : " + calendar.get(calendar.HOUR));//12시간
		System.out.println("현재분 : " + calendar.get(calendar.MINUTE));
		System.out.println("현재초 : " + calendar.get(calendar.SECOND));
		
		System.out.printf("%02d:%02d:%02d",calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND));
		
		
		
		

	}

}
