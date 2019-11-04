package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankBookVO;
import com.biz.bank.domain.BankInfo;

public class BankServiceImpV1 implements BankService {

	// TODO ���¹�ȣ, ��������VO �� ����� list
	Map<String,BankBookVO> bankBookList = null;;
	BankBookVO bookVO = null;
	
	// TODO Ű���� ��ġ ����
	Scanner scanner = null;
	
	//public String bookFile;
	
	String bookFile;
	
	
	// TODO ������ method
	public BankServiceImpV1() {
		// TreeMap : key ���� �߽����� �������� �ڵ�����
		bankBookList = new TreeMap<String,BankBookVO>();
		
		// TODO Ű���� ����
		scanner = new Scanner(System.in);
		
		//outwriter = new PrintWriter();
		
	}
	
	@Override
	public void readBook(String bookFile) throws Exception {
		//TODO Ű����� �ּ��������� ���Ǵ� keyword ��
		//	�ҽ��ڵ带 ���� ã�ư��� �ִ� book mark �� �����Ѵ�
		
		this.bookFile = bookFile;
		// TODO �ܰ���� ������ �о ����Ʈ�� ����
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader==null)break;
			
			// ���Ͽ��� ������ �о� reader �� ����� ���ڿ���
			// ����(�и�)�Ͽ� ���������� ����
			String[] books = reader.split(":");
			/*
			 * books[0] : ��������
			 * books[1] : �����ܾ�
			 * books[2] : �����ŷ�����
			 * books[3] : ����
			 */
			String strNum = books[BankInfo.BOOK.NUM];//books[0]
			String strBalance = books[BankInfo.BOOK.BALANCE];//books[1]
			String strLastDate = books[BankInfo.BOOK.LASTDATE];//books[2]
			String strRemark = books[BankInfo.BOOK.REMARK];//books[3]
			
			int intBalance = Integer.valueOf(strBalance);
			
			// reader ���� �� �׸񺰷� �и��� ���� BankBookVO �� ���
			BankBookVO bookVO = new BankBookVO();
			bookVO.setNum(strNum);
			bookVO.setBalance(intBalance);
			bookVO.setLastDate(strLastDate);
			bookVO.setRemark(strRemark);
			
			//����Ʈ�� �߰�
			bankBookList.put(strNum, bookVO);
			
			// debugging code
			// bookVO �� ���� ����� ��峪�� Ȯ���ϴ� �ڵ�
			System.out.println(bookVO.toString());
			
			
		}// end while
		buffer.close();
		fileReader.close();
		

	}

	/*
	 * Ű����� ���¹�ȣ�� �Է¹޾Ƽ�
	 * ���¹�ȣ�� list �� ������
	 * ��������(VO)�� �����Ͽ� �ӽú����ϱ�
	 */
	@Override
	public void viewAcc() {
		// TODO ����������ȸ
		System.out.print("���¹�ȣ>>");
		String strNum = scanner.nextLine();
		
		// bankBookList ���� strNum Ű���� ��ȸ�ϰ�
		// �� ����� bankBookVO �� ���
		//BankBookVO bookVO = bankBookList.get(strNum);
		
		// BankBookList ���� ����� bookVO �� ��, ��� ó�� method ����
		// ����� �� �ֵ��� ������� �������� �̵��ϱ�
		bookVO = bankBookList.get(strNum);
		
		// bookVO ���� ���������� null ���� ���� �ȴ�
		// ���������� ���� ��� ? : strNum ���°� list �� ������
		// null ���� ���� ��� ? : strNum ���°� list �� ������
		if(bookVO == null) {
			System.out.println("���������� ����");
		}
		
		
		
	}

	@Override
	public void input() throws Exception {
		// TODO �Ա�ó��
		this.viewAcc();// ������ȸ
		
		// �տ��� ��ȸ�� ���������� ��ȿ���� �˻�
		// viewAcc() ���� ��ȿ���� ���� ���������� ���ؼ���
		// �̹� �޼����� ���� �־����Ƿ�
		// ���⿡���� �˻縸 �ϰ�, ���̻� ������ ���߾������
		if(bookVO == null)return;
		
		System.out.print("�Աݾ�>>");
		String strInput = scanner.nextLine();
		int intInput = Integer.valueOf(strInput);
		
		// ���� �Աݾ��� (-) �̸� �Աݰź�!!
		if( intInput < 0) {
			System.out.println("�Աݾ��� 0�� �̻��̾�� ��!!");
			return;
		}
		
		int intBalance = bookVO.getBalance();
		intBalance += intInput;
		bookVO.setBalance(intBalance);
		
		// �ŷ�����, ���� �� �߰�
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String lastDate = sd.format(date);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark(BankInfo.REMARK.INPUT);
		
		// �Ա�ó���� ������ �������Ͽ� �����ϱ�
		// ���й��ڿ��� �Աݵ� �ݾ��� �Ķ���ͷ� ����
		this.accListWrite(BankInfo.REMARK.INPUT, intInput);
		
		// �Ա�ó���� �Ϸ�� ��
		// ���忡 ������ �����ϴ� bookWriter() method �� ȣ���Ѵ�
		// ���⼭ �ϳ��� ������ �߻��ϴµ�
		// ������ �����̸��� �Ѱ��� ����� ����ؾ� �Ѵ�
		// input() method �� �����Ͽ�
		// input(string bookFile) �������� �ٲ� ���� ������
		// �׷��� �ϸ�
		// interface, �׸��� interface �� implement �� Ŭ����
		// ��θ� �����ؾ��ϴ� �� ���簡 �ʿ��ϴ�
		
		// �ּ����� �ڵ带 �����Ͽ�
		// ���ϴ� ����� ��� ���ؼ�
		// Service Ŭ�������� bookFile �������(�ʵ�)�� �ϳ�
		// �����ϰ�,
		// readBook() method ���� bookFile ���� ���� setting �Ͽ�
		// ���� �����ϵ��� �����Ѵ�
		this.bookWriter(bookFile);
	}

	/*
	 * 1. �տ��� ��ȸ�� ���¹�ȣ�� ��ȿ���� ������ method ����
	 * 		bookVO �� null �̸� ���¹�ȣ�� ��ȿ���� �ʴ�
	 * 2. Ű����� ��ݾ��� �Է¹ް� 
	 * 3. �����̸� ��� �ź�
	 * 		�Է¹��� �� < 0 �̸� �ź�
	 * 4. �ܾ� >= ��� �̸� ���ó��
	 * 5. �ƴϸ� ��� �ź�
	 */
	@Override
	public void output() throws Exception {
		// TODO ���ó��
		this.viewAcc();// ������ȸ
		if(bookVO != null) {
			System.out.print("��ݾ�>>");
			String strOutput = scanner.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			if(intOutput > 0) {
				int intBalance = bookVO.getBalance();
				if(intBalance >= intOutput) {
					intBalance -= intOutput;
					bookVO.setBalance(intBalance);
					LocalDate localDate = LocalDate.now();
					DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					String lastDate = localDate.format(df);
					bookVO.setLastDate(lastDate);
					bookVO.setRemark(BankInfo.REMARK.OUTPUT);
					this.accListWrite(BankInfo.REMARK.OUTPUT,intOutput);
					this.bookWriter(bookFile);
				}else {
					System.out.println("�ܾ׺��� ��ݰź�!!");
				}
			}else {
				System.out.println("��ݾ��� 0 �̻��̾�� ��!!");
			}
		}
		
	}

	/*
	 * ��,����� �Ϸ�Ǵ� ���� bookFile��
	 * ���� ���� ����
	 * 
	 * bookFile ������ �Ű������� �޾�
	 * �������� ���ϸ����� �ϴ� ó���� �����ؾ� �Ѵ�
	 */
	@Override
	public void bookWriter(String bookFile) throws Exception {
		// TODO �������� ���Ͽ� ����
		PrintWriter fileOut = null;
		
		fileOut = new PrintWriter(bookFile);
		Set<String> keys = bankBookList.keySet();
		for(String s : keys) {
			//BankBookVO bvo = bankBookList.get(s);
			//fileOut.printf("%s:%d:%s:%s\n", bookVO.getNum(),bookVO.getBalance(),bookVO.getLastDate(),bookVO.getRemark());
			fileOut.printf("%s:%d:%s:%s\n", 
					bankBookList.get(s).getNum(), 
					bankBookList.get(s).getBalance(), 
					bankBookList.get(s).getLastDate(), 
					bankBookList.get(s).getRemark());
			fileOut.flush();
			
		}
		fileOut.close();
	}

	/*
	 * � ���¿��� �Ա��̳� ����� �߻��� �ϸ�
	 * ������ "���¹�ȣ ����" �� ������ �Ѵ�
	 */
	@Override
	public void accListWrite(String remark, int money) throws Exception {
		// TODO �ŷ����� ���Ϸ� ����
		String strAccPath = "src/com/biz/bank/";
		
		FileWriter fileWriter;
		PrintWriter accBook;
		
		// ���¹�ȣ�� �ŷ������� ������ �����̸��� ����
		// BOOK-0001
		String accBookFile = String.format("BOOK-%s.txt",bookVO.getNum());
		
		// FileWriter(,true)
		//	������ �̹� ������ append(�߰�) mode �� open �ϰ�
		//	�׷��� ������ (������ ������) �����϶�
		//	���� ���� : src/com/biz/bank/acc/BOOK-0001.txt
		fileWriter = new FileWriter(strAccPath + accBookFile,true);
		accBook = new PrintWriter(fileWriter);
		
		int intBalance = bookVO.getBalance();
		String lastDate = bookVO.getLastDate();
		
		int intInput = 0;
		int intOutput = 0;
		
		intInput = money;
		if(remark.equals(BankInfo.REMARK.OUTPUT)) {
			intInput = 0;
			intOutput = money;
		}
		
		// �ŷ�����, ����, �Ա�, ���, ���ܾ�
		String strWriter = String.format("%s:%s:%d:%d:%d", lastDate,remark,intInput,intOutput,intBalance);
		accBook.println(strWriter);
		
		accBook.flush();
		accBook.close();
		fileWriter.close();
	}
	

}
