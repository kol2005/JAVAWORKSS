package com.biz.iolist.service;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV3 extends IolistServiceImpV2{
	
	/*
	 * =========================================================
	 * �ŷ�����		��ǰ��			����	�ܰ�	����	���Աݾ�	����ݾ�
	 * 2019-12-19	(��)��������	1		472			0			131
	 * 2019-10-22	8000ī��		2		0			8000			139
	 * ==========================================================
	 * 														���Աݾ��հ�	����ݾ��հ�
	 * ==========================================================
	 */
	public void list() {
		int Iprice = 0;
		int Oprice = 0;
		int ITotal = 0;
		int OTotal = 0;
		this.list_header();
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrPname()+"\t");
			/*
			 * ���� vo ����ܰ迡�� io ������ ���� ������
			 * int ������ ������ٸ� 
			 * ���Ͽ��� �����͸� �о���̴� �κп���
			 * Integer.valueOf() method �� �ѹ��� ��ȯ�� ��Ű��
			 * ���� �ٸ� �κп����� �δ���� ����Ҽ� �־��� ���̴�
			 * ������ ������ io �����ڸ� ���� ���� ����
			 * int ������ ��ȯ��Ű�� �ڵ尡 ������ �����ϰ� �Ǿ���
			 * �̷� ��츦 ���� �̽��� ���� ������� ��� �Ѵ�
			 */
			int intIo = Integer.valueOf(vo.getStrIo());
			if(vo.getStrIo().equals("1")) { }
			int intIPrice = 0;
			int intOPrice = 0;
			String strIoTitle = "����";
			
			if(intIo == 1) {
				intIPrice = vo.getIntPrice();
				strIoTitle = "����";
			}else {
				intOPrice = vo.getIntPrice();
			}
			System.out.print(strIoTitle+"\t");
			System.out.print(vo.getIntPrice());
			System.out.print(vo.getIntQty());
			
			Iprice = intIPrice*vo.getIntQty();
			Oprice = intOPrice*vo.getIntQty();
			System.out.printf("%8d\t",Iprice);
			System.out.printf("%8d\n",Oprice);
			
			ITotal += Iprice;
			OTotal += Oprice;

			
		}
		System.out.println("=======================================================");
		System.out.println("�հ� : \t\t\t\t\t\t\t"+ITotal+"\t"+OTotal);
		System.out.println("=======================================================");
	}

	
	protected void list_header() {
		System.out.println("==================================================");
		System.out.println("�ŷ�����\t��ǰ��\t\t����\t�ܰ�\t����\t���Աݾ�\t����ݾ�");
		System.out.println("--------------------------------------------------");
		
	}
	
	
}
