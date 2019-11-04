package com.biz.exam.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsReadService implements BBsService {

	
	private List<BBsVO> bbsList;
	public BBsReadService() {
		bbsList = new ArrayList<BBsVO>();
	}
	@Override
	public void readBBS(String bbsFile) throws Exception {
		FileReader fileReader = new FileReader(bbsFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		while(true) {
			String str = buffer.readLine();
			if(str == null)break;
			String[] strsp = str.split(":");
			
			BBsVO vo = new BBsVO();
			vo.setSeq(Integer.valueOf(strsp[0]));//순번
			vo.setAuth(strsp[1]);//작성자
			vo.setDate(Integer.valueOf(strsp[2]));//작성일자
			vo.setSubject(strsp[3]);//제목
			vo.setText(strsp[4]);//내용
			vo.setCount(Integer.valueOf(strsp[5]));//조회수
			
			bbsList.add(vo);
		}
		buffer.close();
		fileReader.close();
		
		
	}

	@Override
	public List<BBsVO> getBBsList() {
		return	this.bbsList;
	}

}
