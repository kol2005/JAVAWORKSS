package com.biz.bank.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankAccVO;

/*
 * 여러개 계좌에 대한 입출금 처리
 */
public class BankAccServiceV2 implements BankAccService {

	/*
	 * 멤버변수 영역에 선언된 변수들 멤버변수, 필드 라고 부르며 여기에 선언된 변수들은 프로젝트가 실행되서 작동되는 동안 그 값을 계속해서
	 * 유지하고 있다
	 */
	Map<String, BankAccVO> bankList;

	/*
	 * viewAcc() method 에서 bankList 를 계좌번호로 조회를 했을때 해당하는 계좌번호가 조회되면 bankList 에서 해당하는
	 * 계좌정보를 담고 있을 인스턴스 변수이다
	 * 
	 * 또한 이 인스턴스가 가지고 있는 멤버변수들을 변경(수정)하면 그 정보는 bankList 에도 반영이 된다
	 * 
	 * bankAccVO 의 balance, lstDate, remark 정보를 update 하면 bankList 에 다시 담지 않아도 자동으로
	 * bankList 에 반영이 된다
	 */
	BankAccVO bankAccVO;
	Scanner scanner;

	public BankAccServiceV2() {
		bankList = new TreeMap<String, BankAccVO>();
		scanner = new Scanner(System.in);

		// 계좌정보 생성
		for (int i = 0; i < 10; i++) {
			// 0001 형태의 계좌 번호 생성
			String strNum = String.format("%04d", i + 1);

			// 계좌정보를 담을 vo 생성
			BankAccVO bVO = new BankAccVO();
			bVO.setNum(strNum);
			bVO.setBalance(100000);
			bVO.setLastDate("2019-09-23");
			bVO.setRemark("신규");
			bankList.put(strNum, bVO);
		}
	}

	@Override
	public boolean viewAcc() throws Exception {

		System.out.print("계좌번호>>");
		String strNum = scanner.nextLine();

		// 필드변수
		bankAccVO = bankList.get(strNum);
		// 만약 strNum 계좌가 bankList 에 있으면 해당 계좌정보가
		// bankAccVO 에 담길것이고
		// 그렇지 않으면 bankAccVO 에는 null 값이 담길 것이다

		if (bankAccVO != null) {
			System.out.println("===============================");
			System.out.println("계좌번호 : " + bankAccVO.getNum());
			System.out.println("최종잔액 : " + bankAccVO.getBalance());
			System.out.println("거래일자 : " + bankAccVO.getLastDate());
			System.out.println("거래구분 : " + bankAccVO.getRemark());
			System.out.println("===============================");
		} else {
			System.out.println("계좌정보 없음");
		}
		return false;
	}

	@Override
	public void input() throws Exception {
		this.viewAcc();
		if (bankAccVO != null) {
			// 입금처리 수행
			System.out.print("입금액>>");
			String strInput = scanner.nextLine();
			int intInput = Integer.valueOf(strInput);

			int intBalance = bankAccVO.getBalance();
			intBalance += intInput;

			/*
			 * 지금 bankAccVO 의 balance 필드에 값을 변경하면 bankList 에 자동으로 현재 값이 반영이 된다
			 * 
			 * bankAccVO 값을 변경한 후 bankList 에 저장하거나 하는 코드를 사용할 필요가 없다
			 */
			bankAccVO.setBalance(intBalance);
			bankAccVO.setRemark("입금");

			// 현재 입금처리한 날짜를 추가
			// 컴퓨터의 현재 시각을 구하는 클래스
			Date date = new Date();

			// DecimalFormat
			// 숫자값을 3000 = 3,000 으로 바꿀때 사용했던 클래스와
			// 비슷한 기능으로

			// 날짜값을 원하는 형태의 문자열로 변환시키는 클래스
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
			String strLastDate = sd.format(date);
			bankAccVO.setLastDate(strLastDate);

		} else {
			System.out.println("계좌정보 없음!!");
		}

	}

	@Override
	public void output() throws Exception {

		this.viewAcc();
		if (bankAccVO != null) {
			System.out.print("출금액>>");
			String strOutput = scanner.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			int intBalance = bankAccVO.getBalance();

			if (intBalance >= intOutput) {
				intBalance -= intOutput;
				bankAccVO.setBalance(intBalance);
				bankAccVO.setRemark("출금");

				// 현재 입금처리한 날짜를 추가
				// 컴퓨터의 현재 시각을 구하는 클래스
				Date date = new Date();
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
				String strLastDate = sd.format(date);

				bankAccVO.setLastDate(strLastDate);

			} else {
				System.out.println("잔액부족 출금불가");
			}
		}

	}

	public void bankBookList() {
		// Map 에 담긴 데이터를 for 반복문으로 처리하려면
		// 먼저 key 를 set 으로 가져와서 처리해야 한다
		Set<String> keysets = bankList.keySet();

		System.out.println("================================");
		System.out.println("계좌\t잔액\t거래일자\t구분");
		System.out.println("--------------------------------");
		for (String s : keysets) {
			System.out.print(bankList.get(s).getNum()+"\t");
			System.out.print(bankList.get(s).getBalance()+"\t");
			System.out.print(bankList.get(s).getLastDate()+"\t");
			System.out.println(bankList.get(s).getRemark()+"\t");
			
		}
		System.out.println("================================");
	}

	// 업무가 종료될때 현재 메모리에서 수행중이던
	// 계좌내용을 파일에 저장
	public void writeAccBook(String strBookFile) throws Exception {

		//FileWriter filewriter = new FileWriter(strBookFile);
		//BufferedWriter buffer = new BufferedWriter(filewriter);
		PrintWriter fileOut = new PrintWriter(strBookFile);

		Set<String> keysets = bankList.keySet();

		for (String vo : keysets) {

			BankAccVO bvo = bankList.get(vo);

			fileOut.printf("%s:%d:%s:%s\n", bvo.getNum(), bvo.getBalance(), bvo.getLastDate(), bvo.getRemark());
			fileOut.flush();
		}
		fileOut.close();
		//buffer.close();
		//filewriter.close();
	}
}
