package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrServiceImpV2 implements AddrService {

	private List<AddrVO> addrList;

	@Override
	public void input() {

		// input() method 의 구현

		// input() methos 에서 할일들의 코드를
		// 작성하는 것

		// 형태만 만들어진 input() method 에
		// 구체적인 코드를 작성하는 것
		addrList = new ArrayList<AddrVO>();

		AddrVO aVO = new AddrVO();

		aVO.setStrName("홍길동");
		aVO.setStrTel("02-111-1111");
		aVO.setStrAddr("서울특별시");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-1111-1111");

		addrList.add(aVO);

		aVO = new AddrVO();
		aVO.setStrName("이몽룡");
		aVO.setStrTel("063-110-1111");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-1111-1111");

		addrList.add(aVO);

		aVO = new AddrVO();
		aVO.setStrName("성춘향");
		aVO.setStrTel("063-333-3333");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-3333-3333");

		addrList.add(aVO);

	}

	@Override
	public void list() {

		System.out.println("=============================================");
		System.out.println("\t\t주\t소\t록");
		System.out.println("=============================================");
		System.out.println("이름\t전화\t주소\tEmail\t핸드폰");
		System.out.println("=============================================");
		int nSize = addrList.size();
		System.out.println("=============================================");

		for (AddrVO vo : addrList) {
			System.out.printf("%s\t", vo.getStrName());
			System.out.printf("%s\t", vo.getStrTel());
			System.out.printf("%s\t", vo.getStrAddr());
			System.out.printf("%s\t", vo.getStrEmail());
			System.out.printf("%s\n", vo.getStrHP());

		}
	}

	@Override
	public void view(int num) {

		if (num > addrList.size() - 1) {
			System.out.println("데이터가 없음");
			return;// view() method 강제 끝!!!
		}
		AddrVO aVO = addrList.get(num);

		System.out.println("이름 : " + aVO.getStrName());
		System.out.println("전화 : " + aVO.getStrTel());
		System.out.println("주소 : " + aVO.getStrAddr());
		System.out.println("이메일 : " + aVO.getStrEmail());
		System.out.println("핸드폰 : " + aVO.getStrHP());
		int nSize = addrList.size();
		for(int i= 0 ; i < nSize ; i++) {
			System.out.printf("%3s\t",addrList.get(i).getStrName());
			System.out.printf("%5s\t",addrList.get(i).getStrTel());
			System.out.printf("%5s\t",addrList.get(i).getStrAddr());
			System.out.printf("%5s\t",addrList.get(i).getStrEmail());
			System.out.printf("%5s\n",addrList.get(i).getStrHP());
			
		}

	}

}
