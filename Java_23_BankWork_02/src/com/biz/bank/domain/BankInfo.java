package com.biz.bank.domain;

public class BankInfo {
	
	/*
	 * inner class
	 *  class 내부에 선언된 클래스
	 */
	public static class BOOK{
		public final static int NUM = 0;
		public final static int BALANCE = 1;
		public final static int LASTDATE = 2;
		public final static int REMARK = 3;
	}
	public static class REMARK{
		public final static String INPUT = "입금";
		public final static String OUTPUT = "출금";
	}
	public static class ACC{
		public final static int NUM = 0;
		public final static int BALANCE = 1;
		public final static int LASTDATE = 2;
		public final static int REMARK = 3;
	}
	
}
