package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV2;

public class IolistEx_02 {

	/*
	 * �׵��� �ǸŰ��� App�� ����Ͽ� �Ϲݹ� �ǸŰ�����
	 * �� ����ߴ�
	 * 
	 * �׷��� ���ο� �̼��� �����Դ�
	 * �޹���ǰ�� �ǸŸ� �����ϸ� �ǸŰ����� �����ؾ��� ����
	 * �߻��� �ߴ�
	 * 
	 * �Ϲݹ̸� �Ǹ��Ҷ��� �ܼ��� �ܰ� * ���� = �Ǹűݾ��� ��길
	 * �ϸ� �Ǿ��µ�
	 * 
	 * �޹��� �Ǹ��ϸ鼭
	 * �ΰ���ġ��(VAT : Value Added Tax)�� ����� �ؼ�
	 * �����־�� �� �ʿ䰡 �����
	 * 
	 * 1. �޹��� �Ǹ��ϱ� ���ؼ� ���ο� ������Ʈ�� ������ �ұ�?
	 * 2. ������ ����� IolistService... Ŭ������ ���� ���̱� �Ͽ�
	 * 		�Ϻ� �ڵ带 �����Ͽ� ����ұ�?
	 * 
	 * ��ü���� ����� Java������
	 * ���(inheritance) ��� ����� �̿��ϰ� �ȴ�
	 * ��� = �����޴´� ��� �����ε�
	 * Java������ �����޴´ٴ� ���� + ������ ����� Ȯ���ؼ�
	 * 	����Ѵ�
	 */
	public static void main(String[] args) {
		
		IolistService ioService = new IolistServiceImpV2();
		
		ioService.input(50);
		ioService.total();
		ioService.list();
		
		
		

	}

}
