package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV2 implements IolistService {

	protected List<IolistVO> iolist;
	
	public IolistServiceImpV2() {
		iolist = new ArrayList<IolistVO>();
	}
	
	@Override
	public void read(String fileName) throws Exception {
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			
			// EOF �� �ٴٸ��� �ݺ��� ���� 
			if(reader == null) break;
			
			// ���ڿ��� �и�(����)�Ͽ� token ����
			String[] ios = reader.split(":");
			/*
			 * ios[0] : ��¥
			 * ios[1] : ��ǰ��
			 * ios[2] : ���Ը��ⱸ��, 1:����, 2:����
			 * ios[3] : �ܰ�
			 * ios[4] : ����
			 */
			
			
			// ������ token �� vo �� ���
			IolistVO ioVO = new IolistVO();
			
			// 1.
			ioVO.setStrDate(ios[0]);
			ioVO.setStrPname(ios[1]);
			ioVO.setStrIo(ios[2]);
			ioVO.setIntPrice(Integer.valueOf(ios[3]));
			ioVO.setIntQty(Integer.valueOf(ios[4]));
			
			// 2. ������ �����Ͽ� ������ ios �迭 ��Ҹ� ���
			//		������ VO �� setting
			String strDate = ios[0];
			String strPname = ios[1];
			String strIo = ios[2];
			int intPrice = Integer.valueOf(ios[3]);
			int intQty = Integer.valueOf(ios[4]);
			
			ioVO.setStrDate(strDate);
			ioVO.setStrPname(strPname);
			ioVO.setStrIo(strIo);
			ioVO.setIntPrice(intPrice);
			ioVO.setIntQty(intQty);
			
			// vo �� list�� �߰�
			iolist.add(ioVO);
		}
		buffer.close();
		fileReader.close();

	}

	/*
	 * =========================================================
	 * �ŷ�����		��ǰ��			����	���Դܰ�	����ܰ�	����
	 * 2019-12-19	(��)��������	1		472			0			131
	 * 2019-10-22	8000ī��		2		0			8000			139
	 */
	@Override
	public void list() {
		
		this.list_header();
		
		for (IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.printf("%s\t",vo.getStrPname());
			System.out.printf("%16s\t",vo.getStrIo());
			
			int intIO = Integer.valueOf(vo.getStrIo());
			String strIoTitle = "����";
			
			int intIPrice = 0;
			int intOPrice = 0;
			
			//System.out.print((Integer.valueOf(vo.getStrIo()))+"\t");
			if(vo.getStrIo().equals("1")) {
				System.out.printf("%10d\t",vo.getIntPrice());
				System.out.printf("%10d\t\t",0);
			}else {
				//System.out.printf("%16s\t",vo.getStrIo());
				System.out.printf("%10d\t\t",0);
				System.out.printf("%10d\t",vo.getIntPrice());
			}
			System.out.print(vo.getIntQty()+"\n");
		}
		System.out.println("===================================================");

	}
	
	protected void list_header() {
		System.out.println("==================================================");
		System.out.println("�ŷ�����\t��ǰ��\t\t\t����\t���Դܰ�\t����ܰ�\t����");
		System.out.println("--------------------------------------------------");
	}
	

	@Override
	public void summany() {


	}

}
