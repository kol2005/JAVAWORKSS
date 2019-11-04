package com.biz.string;

import com.biz.string.domain.StudenVO;
import com.biz.string.StringService;
import com.biz.string.service.StudentServiceV1;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		StringService stService = (StringService) new StudentServiceV1();
		
		stService.input();
		stService.list();
		
		// StudentServiceV1 클래스에
		// StringService 인터페이스에 정의되지 않은
		// search() method 가 있는데
		// 그 search() method 를 사용하기 위해서
		// stService 를 잠시 studentServiceV1 인 것처럼
		// 바꾸는 것
		StudenVO stdVO = ((StudentServiceV1)stService).search("00002");
		
		// search() method 를 호출하면서 학번 00001 을 매개변수
		// 전달하였고
		
		// 만약 해당 학번의 데이터가 있으면
		// stdVO 에는 학생정보가 담겨있을 것이다
		
		//혹시 데이터를 못찾았으면
		//stdVO 에는 null 값이 담겨있을 것이다
		
		if(stdVO == null) {
			System.out.println("찾는 데이터 없음!!");
		} else {
			System.out.println(stdVO.toString());
		}
	}

}
