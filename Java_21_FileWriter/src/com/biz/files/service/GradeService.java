package com.biz.files.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.files.domain.ScoreVO;

public interface GradeService {
	
	// 임의 난수를 발생시켜서
	// 성적일람표 파일을 생성하는 method
	public void makeScoreFile(String scoreFile,int length) throws Exception;
	
	// 1. 이름표가 있는 파일을 열어서 nameList 를 작성
	public void readNameFile(String nameFile) throws Exception;
	
	// 2. nameList 에 학번을 부여해서 학생명부 파일을 작성
	// nameList 에 있는 학생이름 중에서 length 개수만큼만
	// 학생명부 파일로 생성
	public void makeStudentFile(String StudentFile, int length) throws Exception;
	
}
