package com.biz.files;

public interface NameService {
	
	// 1. �̸������� �о nameList �ۼ�
	public void readNameList(String nameFile) throws Exception  ;
	
	// 2. ���������� �о famList �ۼ�
	public void readFamList(String famFile) throws Exception ;
	
	// 3. nameList �� famList �� ������ �����Ͽ�
	// �ѱ�����̸� list �� ���� ���Ͽ� ���
	public void writeNameFile(String korNameFile,int length) throws Exception ;
	
}
