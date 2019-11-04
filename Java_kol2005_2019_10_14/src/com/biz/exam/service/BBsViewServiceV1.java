package com.biz.exam.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsViewServiceV1 implements BBsViewService {

	
	private List<BBsVO> bbsList;
	public BBsViewServiceV1() {
		bbsList = new ArrayList<BBsVO>();
	}
	@Override
	public List<BBsVO> setBBsList() {
		return this.bbsList();
	}

	private List<BBsVO> bbsList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void viewBBS() {
		
		for(BBsVO vo : bbsList) {
		System.out.println(vo.getSeq());//순번
		System.out.println(vo.getDate());//작성자
		System.out.println(vo.getAuth());//작성일자
		System.out.println(vo.getSubject());//제목
		System.out.println(vo.getText());//내용
		System.out.println(vo.getCount());//조회수
		}
		
	}

	@Override
	public void viewBBS(String subject) {
		this.viewBBS();

	}

	@Override
	public void viewBBS(int sDate, int eDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewBBS(boolean sort) {
		// TODO Auto-generated method stub

	}

}
