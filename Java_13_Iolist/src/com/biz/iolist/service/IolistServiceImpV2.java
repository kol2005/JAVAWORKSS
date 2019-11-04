package com.biz.iolist.service;

import com.biz.iolist.model.IolistVO;

/*
 * IolistServiceImpV2����
 * IolistServiceImpV1 �� ��� �޾Ҵ�
 */
public class IolistServiceImpV2 extends IolistServiceImpV1 {

	/*
	 * V1 �� �̹� �ۼ��� list() �޼��带
	 * Override, �� ���� �Ͽ���.
	 */
	@Override
	public void list() {
		
		System.out.println("==============================================");
		System.out.println("�ǸŸ���Ʈ");
		System.out.println("==============================================");
		System.out.println("��ǰ�̸�\t�ܰ�\t����\t���ް���\t�ΰ���\t���޴밡");
		System.out.println("----------------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrPName()+"\t");
			System.out.printf("%4d\t",vo.getIntPrice());
			System.out.printf("%3d\t",vo.getIntQty());
			
			
			// �ΰ������� �ݾ� : �Ϲ� ������ 1.1�� ���� ��
			int amt = (int)(vo.getIntTotal()/1.1);
			
			// �ΰ���ġ�� = �Ϲݱݾ� - �ΰ��������ݾ�
			int vat = vo.getIntTotal() - amt;
			
			System.out.printf("%7d\t\t",amt);
			System.out.printf("%6d\t",vat);
			System.out.printf("%7d\n",vo.getIntTotal());
		}
		
	}
	
	

}
