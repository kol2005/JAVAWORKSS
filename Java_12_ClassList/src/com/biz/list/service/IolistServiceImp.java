package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.IolistVO;

public class IolistServiceImp {

	List<IolistVO> iolist;

	public IolistServiceImp() {
		iolist = new ArrayList<IolistVO>();
	}
	
	public void input() {
		IolistVO iolistVO;
		
		/*
		 * 4���� �Ű������� �����ϸ鼭 ��ü�� �����ϴ� ���
		 * 4���� �ӸŰ������� �ִ� �����ڰ� �۵��Ǿ�
		 * ��ü�� �����
		 */
		iolistVO = new IolistVO("2019-09-05","14:00:01","cj�޹�",1500);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05","14:00:02","cj�޹�",1600);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05","14:00:03","cj�޹�",1700);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05","14:00:04","cj�޹�",1800);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05","14:00:05","cj�޹�",1900);
		iolist.add(iolistVO);
		
	}//input end
	
	public void input(int count) {
		
		IolistVO iolistVO;
		Random rnd = new Random();
		for(int i = 0 ; i < count ; i++) {
		String strTime = String.format("14:00:%02d", i);
		int intH = rnd.nextInt(5)+1;
		String strPName = String.format("�Ϲݹ� %d ȣ", intH);
		
		int intQty = rnd.nextInt(30)+10;//10 ~ 39 ���� ����
		
		/*
		 * �Ű������� 5���� �����ڸ� �̿��ؼ� ��ü ����
		 */
		iolistVO = new IolistVO("2019-09-05",strTime,strPName,1000*intH,intQty);
		iolist.add(iolistVO);
		
		}
	}
	
	public void total() {
		// setter �޼��带 ����� ���
		// setter �޼��尡 ����� �۵����� ������
		// ���� for�� ����ؾ� �Ѵ�
		int nSize = iolist.size();
		for(int i = 0 ; i < nSize ; i++) {
			IolistVO vo = iolist.get(i);
			int total = vo.getIntPrice()*vo.getIntQty();
			vo.setIntTotal(total);
		}
		
		for(IolistVO vo : iolist) {
		}
	}

	public void list() {
		System.out.println("=============================================");
		System.out.println("�ŷ�����");
		System.out.println("=============================================");
		System.out.println("����\t\t�ð�\t\t��ǰ��\t\t�ܰ�\t����\t��ǰ�ݾ�");
		System.out.println("---------------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrTime()+"\t");
			System.out.print(vo.getStrPname()+"\t");
			System.out.print(vo.getIntPrice()+"\t");
			System.out.print(vo.getIntQty()+"\t");
			System.out.print(vo.getIntTotal()+"\n");
		}
		System.out.println("=============================================");
	}

}
