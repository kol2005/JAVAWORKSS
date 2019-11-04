package com.biz.iolist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.iolist.model.IolistVO;

public class IolistServiceImpV1 implements IolistService {

	/*
	 * ����������
	 * public : ������ ���ٰ����� ģ����
	 * private : ����(���� Ŭ�������� �ִ� method ������)
	 * 			���� ������ ģ����
	 * protected : private ������ �����鼭 ���� Ŭ������
	 * 				����� �������� �����Ӱ� �����Ҽ� �ֵ���
	 * 				�����ϴ� ������
	 * 
	 * IolistEx_01 �̳� IolistEx_02 ������ ���� �Ұ�!!
	 * IolistServiceimpV2 �� ImpV1 �� ��� �޾����Ƿ�
	 * 		���ٰ���
	 */
	// �Է��� �����͸� ������ ����Ʈ �����
	// ����
	protected List<IolistVO> iolist;
	
	// ������ �޼���
	// �ܺο��� �� Ŭ������ ����Ͽ� ��ü�� �����Ҷ�
	// �ڵ����� ����Ǵ� method
	// 1. ��������� ��ü�� �۵��ϴµ� �ʿ��� ��ҵ���
	//		�ʱ�ȭ �ϴ� �ڵ带 �ۼ�
	public IolistServiceImpV1() {
		
		// �� �ڵ尡 �����Ǹ�
		// input() method ���� NullpointException �� �߻��Ѵ�
		iolist = new ArrayList<IolistVO>();
		
		
	}
	
	@Override
	public void input() {
		
		IolistVO iolistVO = new IolistVO();
		Random rnd = new Random();
		
		// ��ǰ �̸��� "�Ϲݹ� 1ȣ" �������� ����
		int intH = rnd.nextInt(5)+1;
		String strPName = String.format("û���� %d ȣ", intH);
		
		// ������ �ð����ڿ� ����
		int intHour = rnd.nextInt(24);
		int intMin = rnd.nextInt(60);
		int intSec = rnd.nextInt(60);
		String strTime = String.format("%02d:%02d:%02d", intHour,intMin,intSec);
		
		// ������ ������ ����
		int intQty = rnd.nextInt(30)+10;
		
		iolistVO.setStrDate("2019-09-06");
		iolistVO.setStrTime(strTime);
		iolistVO.setStrPName(strPName);
		iolistVO.setIntPrice(intH*1000);
		iolistVO.setIntQty(intQty);

		// iolistVO(1�� �Ǹŵ�����)�� List �� �߰�
		iolist.add(iolistVO);
		
	}

	@Override
	public void input(int count) {
		for (int i = 0 ; i < count ; i++) {
			this.input();
		}

	}

	/*
	 * iolist �� ����� VO ���� total ���� ���
	 */
	@Override
	public void total() {
		
		int nSize = iolist.size();
		for(int i = 0 ; i < nSize ; i++) {
			
			// vo ����(��ü)���� iolist �� i ��° vo �� �ּҰ�
			// ����ȴ�
			IolistVO vo = iolist.get(i);
			
			// iolist.get(i).intPrice �а�
			// iolist.get(i).intQty �� �о ��������
			// total �� ��� ����
			int total = vo.getIntPrice()*vo.getIntQty();
			// iolist �� i ��°�� �������� iolistVO ��
			// intTotal (�ڵ�����) ������ ã�ư���
			// ���� ������ �ش�
			vo.setIntTotal(total);
		}
		
		// vo �� iolist ������ŭ �ڵ� �ݺ� ���� �Ǹ鼭
		// iolist ���� ������� iolistVO �� �ϳ��� ������
		// �� �ּҸ� vo�� ����ְ�
		// ���� for() ��ɹ��� ���� ������ �ڵ尡 ����ȴ�
		for(IolistVO vo : iolist) {
			int total = vo.getIntPrice()*vo.getIntQty();
			
			// iolist ���� ��ġ�� �ִ� iolistVO �� total ������
			// �ڵ����� ã�ư��� ���� �������ش�
			vo.setIntTotal(total);
		}

	}

	@Override
	public void list() {
		
		System.out.println("==========================================");
		System.out.println("�Ǹ� ����Ʈ");
		System.out.println("==========================================");
		System.out.println("�ŷ�����\t�ŷ��ð�\t��ǰ�̸�\t�ܰ�\t����\t�ݾ�");
		System.out.println("------------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrTime()+"\t");
			System.out.print(vo.getStrPName()+"\t");
			System.out.printf("%4d\t",vo.getIntPrice());
			System.out.printf("%3d\t",vo.getIntQty());
			System.out.printf("%5d\n",vo.getIntTotal());
		}

	}

	@Override
	public void view() {
		

	}

}
