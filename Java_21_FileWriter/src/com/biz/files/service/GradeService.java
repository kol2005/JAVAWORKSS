package com.biz.files.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.files.domain.ScoreVO;

public interface GradeService {
	
	// ���� ������ �߻����Ѽ�
	// �����϶�ǥ ������ �����ϴ� method
	public void makeScoreFile(String scoreFile,int length) throws Exception;
	
	// 1. �̸�ǥ�� �ִ� ������ ��� nameList �� �ۼ�
	public void readNameFile(String nameFile) throws Exception;
	
	// 2. nameList �� �й��� �ο��ؼ� �л���� ������ �ۼ�
	// nameList �� �ִ� �л��̸� �߿��� length ������ŭ��
	// �л���� ���Ϸ� ����
	public void makeStudentFile(String StudentFile, int length) throws Exception;
	
}
