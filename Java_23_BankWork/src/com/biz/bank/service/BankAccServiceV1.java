package com.biz.bank.service;

import java.util.Scanner;

import com.biz.bank.domain.BankAccVO;

/*
 * 1���� ���¿� ���� ó���� ������ Ŭ����
 */
public class BankAccServiceV1 implements BankAccService{

	BankAccVO bankAccVO;
	Scanner scanner;
	
	public BankAccServiceV1(String strNum, int intBalance) {
		scanner = new Scanner(System.in);
		bankAccVO = new BankAccVO();
		bankAccVO.setNum(strNum);
		bankAccVO.setBalance(intBalance);
	}
	
	/*
	 *  Ű���忡�� ���¹�ȣ�� �Է¹޾Ƽ�
	 *  vo�� ��� ���¹�ȣ�� ��ġ�ϸ�
	 *  ���� ������ �����ְ� true �� return
	 *  �׷��� ������ false �� return
	 */
	@Override
	public boolean viewAcc() {
		System.out.println("���¹�ȣ>>");
		// Ű���忡�� ���¹�ȣ�� �Է¹ޱ�
		String strAccNum = scanner.nextLine();
		if(!strAccNum.equals(bankAccVO.getNum())) {
			System.out.println("���¹�ȣ�� ����!!");
			return false;
		}
		System.out.println("===========================");
		System.out.println("���¹�ȣ : "+bankAccVO.getNum());
		System.out.println("�����ܾ� : "+bankAccVO.getBalance());
		System.out.println("�����ŷ� : "+bankAccVO.getLastDate());
		System.out.println("��� : "+bankAccVO.getRemark());
		System.out.println("===========================");
		return true;
	}
	@Override
	public void input() {
		//���������� ������ �Ա�����
		if(this.viewAcc()) {
		System.out.println("�Աݾ�");
		// Ű���忡�� �Աݾ� �Է¹ޱ�
		String strInput = scanner.nextLine();
		int intInput = Integer.valueOf(strInput);
		
		// �Է¹��� �Աݾ��� ���ܾ׿� (+)�ջ��ϱ�
		// bankAccVO �� ��� balance �� getter �Ͽ� input ���� �ջ��ϰ�
		// bankAccVO �� balance �� setter �ϱ�
		bankAccVO.setBalance(bankAccVO.getBalance()+intInput);
		}
	}
	@Override
	public void output() {
		if(this.viewAcc()) {
		System.out.println("��ݾ�");
		// Ű���忡�� ��ݾ� �Է¹ޱ�
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		
		// ���ܾװ� ��ݾ��� ���Ͽ�
		// ���ܾ� >= ��ݾ��̸�
		int intBalance = bankAccVO.getBalance();
		if(intBalance >= intOutput) {
			//�Է¹��� ��ݾ��� �� �ܾ׿��� (-)�����ϱ�
			intBalance -= intOutput;
			bankAccVO.setBalance(intBalance);
		}
		
		}
	}
	
	public void  writeAccBook(String strBookFile) throws Exception{
		
	}
	
	public void bankBookList()  throws Exception{
		
	}
}
