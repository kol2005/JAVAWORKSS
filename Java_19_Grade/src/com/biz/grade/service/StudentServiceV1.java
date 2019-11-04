package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.utill.StudentIDX;

public class StudentServiceV1 {

	// Map
	// key, value ���·� �����͸� �����Ѵ�
	// key ������ ���� �����͸� �б� ������ ������ �Ǿ��ִ�
	// HashMap, TreeMap ���� ������ �� �ִ�
	// ���� put(), �б� get(key)

	// List
	// ���� ������� �����͸� �߰��ϰ�, ������� �д� ����
	// List �� ArrayList, LinkedList �����Ѵ�
	// ���� add(), �б� get(index)
	private Map<String, StudentVO> stdList;

	public StudentServiceV1() {
		// TreeMap �� put �� �����͸� ������� �ڵ� �����Ѵ�
		stdList = new TreeMap<String, StudentVO>();
	}
	
	public Map<String, StudentVO> getStdList() {
		return this.stdList;
	}

	// student.txt ������ �о stdList �� ������ ��������
	public void read(String stdFileName) throws Exception {

		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(stdFileName);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] stds = reader.split(":");
			/*
			 * stds[0] : �й� stds[1] : �̸� stds[2] : ��ȭ��ȣ stds[3] : �ּ�
			 */
			StudentVO stdVO = new StudentVO();
			stdVO.setNum(stds[StudentIDX.NUM]);
			stdVO.setName(stds[StudentIDX.NAME]);
			stdVO.setTel(stds[StudentIDX.TEL]);
			stdVO.setAddr(stds[StudentIDX.ADDR]);
			
			// key �� �й����� �����ϰ�
			// value �� StudentVO �� �����Ѵ�
			stdList.put(stds[StudentIDX.NUM], stdVO);

		}// end while
		buffer.close();
		fileReader.close();
	}
	
	public void list() {
		// map �� key �κи� �����ؼ� ����Ʈ�� ���� �ֵ��� ��ȯ
		// stdList Map ���� key �κи� �����Ͽ� Set ���� �ڷ� ��ȯ
		Set<String> stdNums = stdList.keySet();
		
		System.out.println("=======================================================");
		System.out.println("�л����");
		System.out.println("=======================================================");
		System.out.println("�й�\t�̸�\t��ȭ��ȣ\t�ּ�");
		System.out.println("-------------------------------------------------------");
		for(String key : stdNums) {
			//stdList ���� <String, StudentVO> ������ �ڷᰡ
			// ����Ǿ� �ֱ� ������
			// stdList.get("A001") ���·� ���� �����ϸ�
			// ����� �����ʹ� StudentVO type �� �ȴ�
			//���� stdList.get(key) method �� return �ϴ� ���� 
			// ������ ��������
			// ���� type �� StudentVO �̾�� �Ѵ�
			StudentVO stdVO = stdList.get(key);
			System.out.print(stdVO.getNum()+"\t");
			System.out.print(stdVO.getName()+"\t");
			System.out.print(stdVO.getTel()+"\t");
			System.out.print(stdVO.getAddr()+"\n");
		}
		System.out.println("=======================================================");
	}// end list
	
	// �й����� �л������� ��ȸ�ϴ� method
	public StudentVO getStudent(String strNum) {
		
		return stdList.get(strNum);
		
	}
}
