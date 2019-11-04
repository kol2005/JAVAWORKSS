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
 * ������ ���¿� ���� ����� ó��
 */
public class BankAccServiceV2 implements BankAccService {

	/*
	 * ������� ������ ����� ������ �������, �ʵ� ��� �θ��� ���⿡ ����� �������� ������Ʈ�� ����Ǽ� �۵��Ǵ� ���� �� ���� ����ؼ�
	 * �����ϰ� �ִ�
	 */
	Map<String, BankAccVO> bankList;

	/*
	 * viewAcc() method ���� bankList �� ���¹�ȣ�� ��ȸ�� ������ �ش��ϴ� ���¹�ȣ�� ��ȸ�Ǹ� bankList ���� �ش��ϴ�
	 * ���������� ��� ���� �ν��Ͻ� �����̴�
	 * 
	 * ���� �� �ν��Ͻ��� ������ �ִ� ����������� ����(����)�ϸ� �� ������ bankList ���� �ݿ��� �ȴ�
	 * 
	 * bankAccVO �� balance, lstDate, remark ������ update �ϸ� bankList �� �ٽ� ���� �ʾƵ� �ڵ�����
	 * bankList �� �ݿ��� �ȴ�
	 */
	BankAccVO bankAccVO;
	Scanner scanner;

	public BankAccServiceV2() {
		bankList = new TreeMap<String, BankAccVO>();
		scanner = new Scanner(System.in);

		// �������� ����
		for (int i = 0; i < 10; i++) {
			// 0001 ������ ���� ��ȣ ����
			String strNum = String.format("%04d", i + 1);

			// ���������� ���� vo ����
			BankAccVO bVO = new BankAccVO();
			bVO.setNum(strNum);
			bVO.setBalance(100000);
			bVO.setLastDate("2019-09-23");
			bVO.setRemark("�ű�");
			bankList.put(strNum, bVO);
		}
	}

	@Override
	public boolean viewAcc() throws Exception {

		System.out.print("���¹�ȣ>>");
		String strNum = scanner.nextLine();

		// �ʵ庯��
		bankAccVO = bankList.get(strNum);
		// ���� strNum ���°� bankList �� ������ �ش� ����������
		// bankAccVO �� �����̰�
		// �׷��� ������ bankAccVO ���� null ���� ��� ���̴�

		if (bankAccVO != null) {
			System.out.println("===============================");
			System.out.println("���¹�ȣ : " + bankAccVO.getNum());
			System.out.println("�����ܾ� : " + bankAccVO.getBalance());
			System.out.println("�ŷ����� : " + bankAccVO.getLastDate());
			System.out.println("�ŷ����� : " + bankAccVO.getRemark());
			System.out.println("===============================");
		} else {
			System.out.println("�������� ����");
		}
		return false;
	}

	@Override
	public void input() throws Exception {
		this.viewAcc();
		if (bankAccVO != null) {
			// �Ա�ó�� ����
			System.out.print("�Աݾ�>>");
			String strInput = scanner.nextLine();
			int intInput = Integer.valueOf(strInput);

			int intBalance = bankAccVO.getBalance();
			intBalance += intInput;

			/*
			 * ���� bankAccVO �� balance �ʵ忡 ���� �����ϸ� bankList �� �ڵ����� ���� ���� �ݿ��� �ȴ�
			 * 
			 * bankAccVO ���� ������ �� bankList �� �����ϰų� �ϴ� �ڵ带 ����� �ʿ䰡 ����
			 */
			bankAccVO.setBalance(intBalance);
			bankAccVO.setRemark("�Ա�");

			// ���� �Ա�ó���� ��¥�� �߰�
			// ��ǻ���� ���� �ð��� ���ϴ� Ŭ����
			Date date = new Date();

			// DecimalFormat
			// ���ڰ��� 3000 = 3,000 ���� �ٲܶ� ����ߴ� Ŭ������
			// ����� �������

			// ��¥���� ���ϴ� ������ ���ڿ��� ��ȯ��Ű�� Ŭ����
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
			String strLastDate = sd.format(date);
			bankAccVO.setLastDate(strLastDate);

		} else {
			System.out.println("�������� ����!!");
		}

	}

	@Override
	public void output() throws Exception {

		this.viewAcc();
		if (bankAccVO != null) {
			System.out.print("��ݾ�>>");
			String strOutput = scanner.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			int intBalance = bankAccVO.getBalance();

			if (intBalance >= intOutput) {
				intBalance -= intOutput;
				bankAccVO.setBalance(intBalance);
				bankAccVO.setRemark("���");

				// ���� �Ա�ó���� ��¥�� �߰�
				// ��ǻ���� ���� �ð��� ���ϴ� Ŭ����
				Date date = new Date();
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
				String strLastDate = sd.format(date);

				bankAccVO.setLastDate(strLastDate);

			} else {
				System.out.println("�ܾ׺��� ��ݺҰ�");
			}
		}

	}

	public void bankBookList() {
		// Map �� ��� �����͸� for �ݺ������� ó���Ϸ���
		// ���� key �� set ���� �����ͼ� ó���ؾ� �Ѵ�
		Set<String> keysets = bankList.keySet();

		System.out.println("================================");
		System.out.println("����\t�ܾ�\t�ŷ�����\t����");
		System.out.println("--------------------------------");
		for (String s : keysets) {
			System.out.print(bankList.get(s).getNum()+"\t");
			System.out.print(bankList.get(s).getBalance()+"\t");
			System.out.print(bankList.get(s).getLastDate()+"\t");
			System.out.println(bankList.get(s).getRemark()+"\t");
			
		}
		System.out.println("================================");
	}

	// ������ ����ɶ� ���� �޸𸮿��� �������̴�
	// ���³����� ���Ͽ� ����
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
