package com.biz.iolist.service;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV3 extends IolistServiceImpV2{
	
	/*
	 * =========================================================
	 * 거래일자		상품명			구분	단가	수량	매입금액	매출금액
	 * 2019-12-19	(신)벌집핏자	1		472			0			131
	 * 2019-10-22	8000카드		2		0			8000			139
	 * ==========================================================
	 * 														매입금액합계	매출금액합계
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
			 * 만약 vo 설계단계에서 io 구분자 저장 변수를
			 * int 형으로 만들었다면 
			 * 파일에서 데이터를 읽어들이는 부분에서
			 * Integer.valueOf() method 로 한번만 변환을 시키면
			 * 이후 다른 부분에서는 부담없이 사용할수 있었을 것이다
			 * 하지만 지금은 io 구분자를 쉽게 쓰기 위해
			 * int 형으로 변환시키는 코드가 곳곳에 산재하게 되었다
			 * 이런 경우를 설계 미스로 인한 비용증가 라고 한다
			 */
			int intIo = Integer.valueOf(vo.getStrIo());
			if(vo.getStrIo().equals("1")) { }
			int intIPrice = 0;
			int intOPrice = 0;
			String strIoTitle = "매출";
			
			if(intIo == 1) {
				intIPrice = vo.getIntPrice();
				strIoTitle = "매입";
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
		System.out.println("합계 : \t\t\t\t\t\t\t"+ITotal+"\t"+OTotal);
		System.out.println("=======================================================");
	}

	
	protected void list_header() {
		System.out.println("==================================================");
		System.out.println("거래일자\t상품명\t\t구분\t단가\t수량\t매입금액\t매출금액");
		System.out.println("--------------------------------------------------");
		
	}
	
	
}
