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
			vo.setSeq(Integer.valueOf(strsp[0]));//����
			vo.setAuth(strsp[1]);//�ۼ���
			vo.setDate(Integer.valueOf(strsp[2]));//�ۼ�����
			vo.setSubject(strsp[3]);//����
			vo.setText(strsp[4]);//����
			vo.setCount(Integer.valueOf(strsp[5]));//��ȸ��
			
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
