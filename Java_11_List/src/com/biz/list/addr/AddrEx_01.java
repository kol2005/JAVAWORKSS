package com.biz.list.addr;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrEx_01 {

	public static void main(String[] args) {
		
		List<AddrVO> addrList = new ArrayList<AddrVO>();
		
		AddrVO aVO = new AddrVO();
		
		aVO.setStrName("ȫ�浿");
		aVO.setStrTel("02-111-1111");
		aVO.setStrAddr("����Ư����");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-1111-1111");
		
		addrList.add(aVO);
		
		aVO = new AddrVO();
		aVO.setStrName("�̸���");
		aVO.setStrTel("063-110-1111");
		aVO.setStrAddr("������");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-1111-1111");
		
		addrList.add(aVO);
		
		aVO = new AddrVO();
		aVO.setStrName("������");
		aVO.setStrTel("063-333-3333");
		aVO.setStrAddr("������");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-3333-3333");
		
		addrList.add(aVO);
		
		// addrList �� ������ ����ؼ� nSize ������ ��ƴ޶�
		
		System.out.println("=============================================");
		System.out.println("\t\t��\t��\t��");
		System.out.println("=============================================");
		System.out.println("\t�̸�\t��ȭ\t�ּ�\tEmail\t�ڵ���");
		System.out.println("=============================================");
		int nSize = addrList.size();
		for(int i= 0 ; i < nSize ; i++) {
			System.out.printf("%10s\t",addrList.get(i).getStrName());
			System.out.printf("%10s\t",addrList.get(i).getStrTel());
			System.out.printf("%10s\t",addrList.get(i).getStrAddr());
			System.out.printf("%10s\t",addrList.get(i).getStrEmail());
			System.out.printf("%10s\n",addrList.get(i).getStrHP());
			
		}
		System.out.println("=============================================");
		
		for(AddrVO vo : addrList) {
			System.out.printf("%s\t",vo.getStrName());
			System.out.printf("%s\t",vo.getStrTel());
			System.out.printf("%s\t",vo.getStrAddr());
			System.out.printf("%s\t",vo.getStrEmail());
			System.out.printf("%s\n",vo.getStrHP());
			
		}
	}

}
