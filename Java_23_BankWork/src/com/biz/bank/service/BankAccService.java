package com.biz.bank.service;

/*
 * ��������� app Service
 */
public interface BankAccService {


	public boolean viewAcc() throws Exception;


	
	
	public void input()  throws Exception;

	
	
	public void output()  throws Exception;
	
	public void  writeAccBook(String strBookFile) throws Exception;
	
	public void bankBookList()  throws Exception;

	
}
