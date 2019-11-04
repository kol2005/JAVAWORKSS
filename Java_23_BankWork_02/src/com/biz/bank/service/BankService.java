package com.biz.bank.service;
/*
 * BankService ���� ������ ���� ��Ȯ�� ���ǵ��� �ʾƼ�
 * ��(blank) interface �� �����
 * ���� class ����鼭 interface ���Ǹ� ����
 * 
 * 1. �ܰ����(����)���� ���� ���µ��� �ܰ� ����Ʈ�� �����ͼ�
 * 		����Ʈ�� ������ �ϰ�
 * 2. �� ���º��� ��, ����� �����ϰ�
 * 3. �ٽ� �ܰ���忡 ��, ��� ������ �ݿ�
 * 
 * 4. �� ���º��� ��, ��� ����(List) �� ���Ϸ� ����
 */
/*
 * interface �� method �� ���Ǹ� �ְ�
 * ==> method prototype ����
 * method �� ��ü������ �������� �ϴ��� �𸥴�
 * �ٸ�, ������ method �� return type �� �Ű������� ���ĸ� ������ �Ѵ�
 */
public interface BankService {
	
	// �ܰ�������� ���� ���µ��� �ܰ� ����Ʈ�� �����ͼ�
	// ����Ʈ�� ����
	// obj.readBook("�ŷ�����.txt") �������� ȣ��� method
	public void readBook(String bookFile)	throws Exception;// {} ���� ���Ǹ� �ִ�
	
	// ���¹�ȣ�� �Է¹޾Ƽ�
	// ������ ����(�ܾ�, �����ŷ����� ���...) �� �����ִ� method
	public void viewAcc();
	
	// ��ȸ�� ���¹�ȣ�� �ش��ϴ� ���¿�
	// Ű����� ���� �Աݾ��� �Է� �޾Ƽ� �Ա� ó�� ���� method
	public void input() throws Exception;
	
	// ���ó�� method
	public void output() throws Exception;
	
	// ��,����� �Ϸ�Ǿ����� ���� ������ ������Ʈ �ϴ� method
	public void bookWriter(String bookFile) throws Exception;
	
	// �� ���º��� ����� ������ ���Ͽ� ��������
	public void accListWrite(String remark, int money) throws Exception;
	
	
}
