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

public class ScoreServiceV2 {
	
	private Map<String, ScoreVO> scList;
	public ScoreServiceV2() {
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
		
		// Map<String,ScoreVO> type 으로 데이터를 가지고 있는
		// scList 값을 List type 인 sortList 로 변환하는 방법
		// <제네럴>
		// List<제네럴> : List 가 어떤 type 의 데이터들을
		//		가지고 있을 것인가 명시
		// Map 형태를 List 로 변환시킬때는
		// List<Map.Entry<>> 형태로 선언을 해 주어야 한다
		List<Map.Entry<String,ScoreVO>> sortList = new LinkedList<Map.Entry<String,ScoreVO>>(scList.entrySet());
		
		Collections.sort(sortList, new Comparator<Map.Entry<String,ScoreVO>>(){
			@Override
			public int compare(Entry<String, ScoreVO> o1, Entry<String, ScoreVO> o2) {
				// o2.getValue()
				// list 형태로 바뀐 Map 에서 VO 를 추출하는 method
				return o2.getValue().getSumScore() - o1.getValue().getSumScore();
			}
		});
		// 성적순으로 내림차순 정렬 후에 rank 멤버변수에
		// 석차값을 세팅
		int rank = 0;
		for(Map.Entry<String, ScoreVO> vo : sortList) {
			vo.getValue().setRank(++rank);
			System.out.println(vo.getValue().toString());
		
	}
	


	}

}
