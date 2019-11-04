package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;


public class StudentServiceV1 {
	
	protected List<StudentVO> stdList;
	
	public StudentServiceV1() {
		stdList = new ArrayList<StudentVO>();
	}
	
	public List<StudentVO> getStdList(){
		return this.stdList;
	}
	
	/*
	 * ���Ϸκ��� �л������� �о stdList�� ����
	 */
	public void readStudent(String fileName) throws Exception {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		while(true) {
			
			String str = buffer.readLine();
			if(str==null)break;
			
			String[] strspl = str.split(":");
			
			StudentVO sVO = new StudentVO();
			sVO.setS_num(strspl[0]);//�й�
			sVO.setS_name(strspl[1]);//�̸�
			sVO.setS_tel(strspl[2]);//����
			sVO.setS_grade(Integer.valueOf(strspl[3]));//�г�
			sVO.setS_addr(strspl[4]);//�ּ�
			stdList.add(sVO);
			
			//System.out.println(strspl[0]+strspl[1]+strspl[2]+strspl[3]+strspl[4]);
		}
		buffer.close();
		fileReader.close();

	}
}
