package com.biz.exam.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.exam.domain.BBsVO;
import com.biz.exam.service.BBsReadService;
import com.biz.exam.service.BBsViewServiceV1;

public class BBsExec_01 {

	public static void main(String[] args) {

		String bbsFile = "src/com/biz/exam/bbs.txt";
		BBsReadService brs = new BBsReadService();
		BBsViewServiceV1 bvs = new BBsViewServiceV1();
		Scanner scanner = new Scanner(System.in);

		try {
			brs.readBBS(bbsFile);
			brs.getBBsList();
			List<BBsVO> bbsList = brs.getBBsList();
			bvs.setBBsList();
			bvs.viewBBS();
			System.out.println("===========================================");
			System.out.println("게시판 관리 시스템v1");
			System.out.println("===========================================");
			System.out.println("1.전체 2.작성자 3.날짜 0.종료");
			System.out.print("업무선택 >>");
			String strnum = scanner.nextLine();
			int intnum = Integer.valueOf(strnum);
			while (true) {
				if (intnum == 0)
					break;
				if (intnum == 1) {
					bvs.viewBBS();
				}
				if (intnum == 2) {
					System.out.print("제목을 입력하세요>>");
					String strsubjec = scanner.nextLine();
					bvs.viewBBS(strsubjec);
					


				}
				if (intnum == 3) {
					System.out.print("검색날짜를 입력하세요>>");
					String strdate1 = scanner.nextLine();
					String strdate2 = scanner.nextLine();
					int sDate = Integer.valueOf(strdate1);
					int eDate = Integer.valueOf(strdate2);
					bvs.viewBBS(sDate , eDate);
				}

			}
			// brs.readBBS();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
