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
		// 추가된 순서를 유지하도록 하기 위한 방법
		// Java 1.4 이상에서 새로 추가된 class
		scList = new LinkedHashMap<String, ScoreVO>();
		
		//추가된 순서에 관계없이 내부 알고리즘에 따라
		// 순서가 정해져서 임의로 순서를 바꾸기가 애매하다
		scList = new HashMap<String, ScoreVO>();
		
		// 추가된 순서에 관계없이 
		// key 값을 기준으로 오름차순 정렬한다
		scList = new TreeMap<String, ScoreVO>();
		
	}	
	
	// 외부에서 
	public Map<String, ScoreVO> getScList() {
		return this.scList;
	}
	
	/*
	 * scoreFileName 파일을 읽어서
	 * 데이터를 생성하여 scList 에 추가
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
			//4개의 매개변수를 받아서
			//학번,국어,ㅇ여어,수학 점수를 초기화 하는 
			// 생성자를 만들고
			ScoreVO sVO 
			= new ScoreVO(scs[ScoreIDX.NUM],
					Integer.valueOf(scs[ScoreIDX.KOR]),
					Integer.valueOf(scs[ScoreIDX.ENG]),
					Integer.valueOf(scs[ScoreIDX.MATH])
					);
			
			try {
			
			} catch (Exception e) {
				System.out.println(scs[ScoreIDX.NUM]+"학생 성적 확인!!");
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
		 * Collections 자료형의 반복문을 도와주는 class
		 * Iterator 를 사용하면 while() 반복문을 사용하여
		 * 리스트를 처리할수 있다
		 */
		//key 들을 추출하여 Set list 로 생성
		Set<String> _s = scList.keySet();
		
		// key 들을 추출한 Set list 를 Iterator 형으로 변환
		Iterator<String> _list = scList.keySet().iterator();
		
		System.out.println("===============================================");
		System.out.println("성적일람표");
		System.out.println("===============================================");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("-----------------------------------------------");
		
		// Iterator 의 hasNext() method 는 
		// Iterator 의 리스트에 아직 읽을 데이터가 있느냐?
		while(_list.hasNext()) {
			
			// 읽을 데이터가 있으면
			// next() 메서드를 호출하여 값을 읽기
			// 이 값은 scList 의 key 값중의 1가지가 되고
			// 그 key 값으로 ScoreVO 를 추출하여 
			// scVO 에 담아라
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
		System.out.println("총점리스트");
		System.out.println("============================");
		System.out.println("학번\t 총점\t 평균");
		System.out.println("----------------------------");
		for(String key : keys) {
			ScoreVO sVO = scList.get(key);
			System.out.printf("%5s\t%5d\t%5.1f\n",sVO.getNum(),sVO.getSumScore(),sVO.getAverage());
			
		}
		System.out.println("============================");
	}
	
	/*
	 * scList 를 총점기준으로 내림차순 정렬한 후
	 * rank 필드에 순서대로 숫자를 추가하여
	 * 석차를 표기한다
	 * 단, 동점자 처리는 무시한다
	 */
	/*
	 * 데이터가 Map 구조로 저장되어 있는 경우
	 * Map key값으로 정렬하는것은 크게 문제가 없으나
	 * value 값으로 정렬하기 위해서는 몇가지 절차가 필요하다
	 * 1. Map의 value 전체를 추출하여 List 로 변환
	 * 2. List 를 정렬하고, 연산을 수행한 다음
	 * 3. 다시 List 를 Map 에 업데이트를 수행한다
	 */
	public void rank() {
		
		// 1. Map 데이터에서 value 전체를 추출하여
		//		list(sortList) 로 변환
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
	
	// 성적순으로 내림차순 정렬 후에 rank 멤버변수에
	// 석차값을 세팅

	}

}
