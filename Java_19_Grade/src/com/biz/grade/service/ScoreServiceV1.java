package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.utill.ScoreIDX;

public class ScoreServiceV1 {
	
	private Map<String, ScoreVO> scList;
	public ScoreServiceV1() {
		// �߰��� ������ �����ϵ��� �ϱ� ���� ���
		// Java 1.4 �̻󿡼� ���� �߰��� class
		scList = new LinkedHashMap<String, ScoreVO>();
		
		//�߰��� ������ ������� ���� �˰��� ����
		// ������ �������� ���Ƿ� ������ �ٲٱⰡ �ָ��ϴ�
		scList = new HashMap<String, ScoreVO>();
		
		// �߰��� ������ ������� 
		// key ���� �������� �������� �����Ѵ�
		scList = new TreeMap<String, ScoreVO>();
		
	}	
	
	// �ܺο��� 
	public Map<String, ScoreVO> getScList() {
		return this.scList;
	}
	
	/*
	 * scoreFileName ������ �о
	 * �����͸� �����Ͽ� scList �� �߰�
	 */
	public void read(String scoreFileName)  throws Exception {
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(scoreFileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		int intTotal = 0;
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			
			String[] scs = reader.split(":");
			//4���� �Ű������� �޾Ƽ�
			//�й�,����,������,���� ������ �ʱ�ȭ �ϴ� 
			// �����ڸ� �����
			ScoreVO sVO 
			= new ScoreVO(scs[ScoreIDX.NUM],
					Integer.valueOf(scs[ScoreIDX.KOR]),
					Integer.valueOf(scs[ScoreIDX.ENG]),
					Integer.valueOf(scs[ScoreIDX.MATH])
					);
			
			try {
			
			} catch (Exception e) {
				System.out.println(scs[ScoreIDX.NUM]+"�л� ���� Ȯ��!!");
			}
		
			scList.put(scs[ScoreIDX.NUM], sVO);
			/*
			ScoreVO scVO = new ScoreVO();
			//scVO.setNum(scds[0]);
			scVO.setNum(scds[ScoreIDX.NUM]);
			//scVO.setKorScore(Integer.valueOf(scds[1]));
			scVO.setKorScore(Integer.valueOf(ScoreIDX.KOR));
			//scVO.setEngScore(Integer.valueOf(scds[2]));
			scVO.setEngScore(Integer.valueOf(ScoreIDX.ENG));
			//scVO.setMathScore(Integer.valueOf(scds[3]));
			scVO.setMathScore(Integer.valueOf(ScoreIDX.MATH));
			
			intTotal = ScoreIDX.KOR + ScoreIDX.ENG + ScoreIDX.MATH;
			//scVO.setSumScore(Integer.valueOf(scds[4]));
			scVO.setSumScore(Integer.valueOf(ScoreIDX.SUM));
			scVO.setSumScore(intTotal);
			//scVO.setAverage(Integer.valueOf(scds[5]));
			scVO.setAverage(Integer.valueOf(ScoreIDX.AVG));
			scVO.setAverage(intTotal/3);
			//scVO.setRank(Integer.valueOf(scds[6]));
			scVO.setRank(Integer.valueOf(ScoreIDX.RANK));
			*/
			scList.put(scs[ScoreIDX.NUM], sVO);
		}// end whlie
		fileReader.close();
		buffer.close();
	}// end read
	public void liss() {
		/*
		 * Collections �ڷ����� �ݺ����� �����ִ� class
		 * Iterator �� ����ϸ� while() �ݺ����� ����Ͽ�
		 * ����Ʈ�� ó���Ҽ� �ִ�
		 */
		//key ���� �����Ͽ� Set list �� ����
		Set<String> _s = scList.keySet();
		
		// key ���� ������ Set list �� Iterator ������ ��ȯ
		Iterator<String> _list = scList.keySet().iterator();
		
		System.out.println("===============================================");
		System.out.println("�����϶�ǥ");
		System.out.println("===============================================");
		System.out.println("�й�\t����\t����\t����");
		System.out.println("-----------------------------------------------");
		
		// Iterator �� hasNext() method �� 
		// Iterator �� ����Ʈ�� ���� ���� �����Ͱ� �ִ���?
		while(_list.hasNext()) {
			
			// ���� �����Ͱ� ������
			// next() �޼��带 ȣ���Ͽ� ���� �б�
			// �� ���� scList �� key ������ 1������ �ǰ�
			// �� key ������ ScoreVO �� �����Ͽ� 
			// scVO �� ��ƶ�
			ScoreVO scVO = scList.get(_list.next());
			System.out.print(scVO.getNum()+"\t");
			System.out.print(scVO.getKorScore()+"\t");
			System.out.print(scVO.getEngScore()+"\t");
			System.out.print(scVO.getMathScore()+"\n");
			
		}
		
		System.out.println("===============================================");
		
	}
	public void total() {
		Set<String> keys = scList.keySet();
		for(String key : keys) {
			ScoreVO scVO = scList.get(key);
			int total = scVO.getKorScore();
			total += scVO.getEngScore();
			total += scVO.getMathScore();
			scVO.setSumScore(total);
			scVO.setAverage(total/3);
		}
	}
	public void listotal() {
		Set<String> keys = scList.keySet();
		System.out.println("============================");
		System.out.println("��������Ʈ");
		System.out.println("============================");
		System.out.println("�й�\t ����\t ���");
		System.out.println("----------------------------");
		for(String key : keys) {
			ScoreVO sVO = scList.get(key);
			System.out.printf("%5s\t%5d\t%5.1f\n",sVO.getNum(),sVO.getSumScore(),sVO.getAverage());
			
		}
		System.out.println("============================");
	}
	
	/*
	 * scList �� ������������ �������� ������ ��
	 * rank �ʵ忡 ������� ���ڸ� �߰��Ͽ�
	 * ������ ǥ���Ѵ�
	 * ��, ������ ó���� �����Ѵ�
	 */
	/*
	 * �����Ͱ� Map ������ ����Ǿ� �ִ� ���
	 * Map key������ �����ϴ°��� ũ�� ������ ������
	 * value ������ �����ϱ� ���ؼ��� ��� ������ �ʿ��ϴ�
	 * 1. Map�� value ��ü�� �����Ͽ� List �� ��ȯ
	 * 2. List �� �����ϰ�, ������ ������ ����
	 * 3. �ٽ� List �� Map �� ������Ʈ�� �����Ѵ�
	 */
	public void rank() {
		
		// 1. Map �����Ϳ��� value ��ü�� �����Ͽ�
		//		list(sortList) �� ��ȯ
		List<Map.Entry<String,ScoreVO>> sortList = new LinkedList<Map.Entry<String,ScoreVO>>(scList.entrySet());
		
		//List<Map.Entry<String,StudentVO>> stdList = new LinkedList<>(stdList.entrySet());
		//List<Map.Entry<String,ScoreVO>> sortList1 = new LinkedList<>(scList.entrySet());
		
		Collections.sort(sortList, new Comparator<Map.Entry<String,ScoreVO>>(){

			@Override
			public int compare(Entry<String, ScoreVO> o1, Entry<String, ScoreVO> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().getSumScore() - o1.getValue().getSumScore();
			}
		});
		//Collections.sort(sortList, new Comparator<Map.Entry<String,ScoreVO>>());
		int rank = 0;
		for(Map.Entry<String, ScoreVO> vo : sortList) {
			vo.getValue().setRank(++rank);
			System.out.println(vo.getValue().toString());
		
	}
	
	// ���������� �������� ���� �Ŀ� rank ���������
	// �������� ����

	}

}
