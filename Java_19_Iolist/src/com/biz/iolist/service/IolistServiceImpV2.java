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
			
			// EOF 에 다다르면 반복문 종료 
			if(reader == null) break;
			
			// 문자열을 분리(분해)하여 token 생성
			String[] ios = reader.split(":");
			/*
			 * ios[0] : 날짜
			 * ios[1] : 상품명
			 * ios[2] : 매입매출구분, 1:매입, 2:매출
			 * ios[3] : 단가
			 * ios[4] : 수량
			 */
			
			
			// 생성된 token 을 vo 에 담기
			IolistVO ioVO = new IolistVO();
			
			// 1.
			ioVO.setStrDate(ios[0]);
			ioVO.setStrPname(ios[1]);
			ioVO.setStrIo(ios[2]);
			ioVO.setIntPrice(Integer.valueOf(ios[3]));
			ioVO.setIntQty(Integer.valueOf(ios[4]));
			
			// 2. 변수를 선언하여 변수에 ios 배열 요소를 담고
			//		변수를 VO 에 setting
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
			
			// vo 를 list에 추가
			iolist.add(ioVO);
		}
		buffer.close();
		fileReader.close();

	}

	/*
	 * =========================================================
	 * 거래일자		상품명			구분	매입단가	매출단가	수량
	 * 2019-12-19	(신)벌집핏자	1		472			0			131
	 * 2019-10-22	8000카드		2		0			8000			139
	 */
	@Override
	public void list() {
		
		this.list_header();
		
		for (IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.printf("%s\t",vo.getStrPname());
			System.out.printf("%16s\t",vo.getStrIo());
			
			int intIO = Integer.valueOf(vo.getStrIo());
			String strIoTitle = "매입";
			
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
		System.out.println("거래일자\t상품명\t\t\t구분\t매입단가\t매출단가\t수량");
		System.out.println("--------------------------------------------------");
	}
	

	@Override
	public void summany() {


	}

}
