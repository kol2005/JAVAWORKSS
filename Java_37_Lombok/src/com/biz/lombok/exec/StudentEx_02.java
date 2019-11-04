package com.biz.lombok.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentServiceV1;
import com.biz.lombok.service.StudentViewServiceV1;
import com.biz.lombok.service.StudentViewServiceV2;

/*
 * 학생정보.txt 파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두개의 정수를 입력받아 해당 범위의 
 * 		학년에 해당하는 학생들만 콘솔에 보이기 
 */
public class StudentEx_02 {

	public static void main(String[] args) {
		
		StudentServiceV1 sRead = new StudentServiceV1();
		StudentViewServiceV1 sView = new StudentViewServiceV2();
		String strName = "src/com/biz/lombok/학생정보.txt";
		Scanner scanner = new Scanner(System.in);
		
		try {
			sRead.readStudent(strName);
			List<StudentVO> stdList = sRead.getStdList();
			sView.setStdList(stdList);
			sView.view();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("=========");
			System.out.println("학생정보검색");
			System.out.println("========");
			System.out.println("1.이름 2.학년 3.학년범위 0.종료");
			System.out.println("-------------------");
			System.out.print("선택>>");
			String strn = scanner.nextLine();
			int intM = Integer.valueOf(strn);
			if(intM == 0)break;
			if(intM == 1) {
				System.out.print("제목>>");
			}
		}
	}

}
