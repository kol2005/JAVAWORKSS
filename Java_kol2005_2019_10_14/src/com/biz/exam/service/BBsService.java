package com.biz.exam.service;

import java.util.List;

import com.biz.exam.domain.BBsVO;

public interface BBsService {

	public void readBBS(String bbsFile) throws Exception ;
	public List <BBsVO> getBBsList();
	
}
