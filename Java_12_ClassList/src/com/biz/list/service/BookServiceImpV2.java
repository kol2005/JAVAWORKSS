package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

/*
 * Ű���忡�� ���������� �Է¹޾Ƽ�
 * List �� �߰��ϰ�
 * ��Ϻ���, ��������
 * ����� ���׷��̵� �� �ڵ�
 */
public class BookServiceImpV2 implements BookService {
	
	/*
	 * scan ��ü�� bookList ��ü�� ������ �ߴµ�
	 * ���� ����(����� �غ�) �ȵȻ���
	 * 
	 * scan �� bookList�� ����, �ʱ�ȭ�� �ؾ��Ѵ�
	 */
	Scanner scan;
	List<BookVO> bookList;
	/*
	 * scan �� bookList �� ����, �ʱ�ȭ �ϴ� �ڵ带
	 * Ŭ������ �����ڿ� �ۼ��Ѵ�
	 */
	public BookServiceImpV2() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	@Override
	public void input(int count) {
		
		for(int i = 0 ; i < count ; i++){
			System.out.println("==========================================");
			System.out.println((i+1)+" ��° �������� �Է�");
			System.out.println("------------------------------------------");
			try {
				this.input();	
			} catch (Exception e) {
				System.out.println("�����͸� �ٽ� �Է��ϼ���");
				i--;
				continue;
			}
		}

	}

	@Override
	public void input() {
		

		//������ȣ,������,����,���ǻ�,����,���ǿ���
		System.out.print("������ȣ > ");
		String strNum = scan.nextLine();
		
		System.out.print("������ > ");
		String strName = scan.nextLine();

		System.out.print("���� > ");
		String strWriter = scan.nextLine();

		System.out.print("���ǻ� > ");
		String strComp = scan.nextLine();

		System.out.print("���� > ");
		String strPrice = scan.nextLine();
		
		int intPrice = 0;
		// ���ڿ��� ���ڸ� ���ڷ� �����ϴ� ��������
		// ���� ��Ȳ�� ���� �߻��ϴ���
		// ���� ó���� �߰��Ϸ��� �Ѵ�
		// 1. ���� ��Ȳ�� �߻��� �ڵ带 �ۼ�
		// 2. �����ؼ� ���� ��Ȳ�� �߻��ϵ��� �׽�Ʈ�ϱ�
		// 3. ���⿡�� NumberFormatException �� �߻��� �ϴ���
		// 4. ���� ó���� ����
		//		��. try catch ���� �ۼ�
		//		��. ���ܰ� �߻��� �ڵ带 try () ������ �̵�
		//		��. ���ܻ�Ȳ�� ó���ϴ� �ڵ带 catch() { }�� 
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			/*
			 * ���� ���������� �Է��ϴ� ���߿�
			 * NumberFormat.... ���ܰ� �߻��ϸ�
			 * ���� �Է��ϴ� ���������� �ٽ� �Է��ϵ���
			 * �ڵ带 �ۼ�
			 */
			/*
			 * Ű����� ���� ���� �Է¹ް�
			 * ��ȯ�� �ϴ� ���� �ڵ尡
			 * for() { } �ݺ������� ������ �ִٸ�
			 * for �ݺ����� �� �����ϴ� continue Ű���带 
			 * ����Ͽ� �ٽ� �Է��� �õ� �ϵ��� �� �� �ִ�
			 * 
			 * ������,
			 * ���� �ۼ��� input() �޼����
			 * for �ݺ������� ������ ȣ���� �޼����̱� ������
			 * continue Ű���带 ����Ҽ� ����
			 * 
			 * �����
			 * ���� input() �޼��忡�� exception�� �߻��� �ϸ�
			 * ȣ���� ���� exception �� �߻� �ߴٰ� �˷��ְ�
			 * �װ����� ó�� �ϵ��� �ϸ� �ȴ�
			 */
			System.out.println("!! ������ ���ڸ� �Է��ϼ��� !!");
			
			// throw : ��(input() method) �� ȣ���� ������
			// ���ܸ� ������.
			// ���� �߻��� ���ܸ� �װ� ��� ó���� �޶�
			// ��� ��û
			throw new NumberFormatException();
		}
		
		System.out.print("���ǿ��� > ");
		String strPubYear = scan.nextLine();
		int intPubYear = 0;
		try {
			/*
			 * intPubYear ������ try {} �ȿ��� �����ϰ� �Ǹ�
			 * ���� ���������� �ڵ尡 ����ǰ�
			 * try ������ ����ڵ带 �����ϴ� ��������
			 * intPubYear ������ ���� �Ҽ� ����.
			 * 
			 * �ݵ�� try�� ���۵Ǳ�����
			 * ������ �����ϰ� clear �� �� ���¿���
			 * try ������ ������ � ���� �����ϵ���
			 * �ڵ尡 �ۼ��Ǿ�� �Ѵ�
			 */
			intPubYear = Integer.valueOf(strPubYear);
		} catch (Exception e) {
			System.out.println("!! ������ ���ڸ� �Է��ϼ��� !!");
			//throw new NumberFormatException();
			while(true) {
				System.out.println("������ �ٽ� �Է�(���� : -1) > ");
				String s = scan.nextLine();
				try {
					intPubYear = Integer.valueOf(s);
					if(intPubYear == -1)break;
					break;
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		
		
		BookVO bookvo = new BookVO();
		bookvo.setStrNum(strNum);
		bookvo.setStrName(strName);
		bookvo.setStrWriter(strWriter);
		bookvo.setStrComp(strComp);
		bookvo.setIntPrice(intPrice);
		bookvo.setIntPubYear(intPubYear);
		
		bookList.add(bookvo);
		
	}

	@Override
	public void list() {
		
		System.out.println("==============================================");
		System.out.println("���� ���� �϶�ǥ");
		System.out.println("==============================================");
		System.out.println("ISBN\t������\t���ǻ�\t����\t����\t���ǿ���");
		System.out.println("----------------------------------------------");
		int nSize = bookList.size();
		/*
		for(int i = 0 ; i < nSize ; i++) {
			BookVO vo = bookList.get(i);
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getStrComp()+"\t");
			System.out.print(vo.getStrWriter()+"\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
			
		}
		*/
		for(BookVO vo : bookList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getStrComp()+"\t");
			System.out.print(vo.getStrWriter()+"\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
			
		}

	}

	@Override
	public void view(int index) {
		
		BookVO vo = bookList.get(index);
		System.out.println("=====================================================");
		// �� �׸��� console �� ǥ���Ҷ�����
		// bookList�� ���� index ��°�� BookVO �� �����ϰ�
		// ����� BookVO �� getter() �޼��带 ȣ���ϴµ�
		System.out.println("ISBN : " + bookList.get(index).getStrNum());
		
		// �ڵ� ����������
		// bookList �� ���� index ��°�� BookVO �� �����Ͽ�
		// ������ ������ �ΰ�
		// getter() �޼��常�� ȣ���Ͽ� ���� ǥ���Ѵ�
		// �� �ڵ庸�� ������ ȿ���� ���� ������ ����ȴ�
		System.out.println("ISBN : " + vo.getStrNum());
		System.out.println("������ : " + vo.getStrName());
		System.out.println("���ǻ� : " + vo.getStrComp());
		System.out.println("���� : " + vo.getStrWriter());
		System.out.println("���� : " + vo.getIntPrice());
		System.out.println("���ǿ��� : " + vo.getIntPubYear());
		System.out.println("=====================================================");
		
	}

	@Override
	public void view(String strName) {
		int nSize = bookList.size();
		for (int i = 0 ; i < nSize ; i ++) {
			BookVO vo = bookList.get(i);
			String voStrName = vo.getStrName();
			
			// ������� �˻���(strName)�� �ݵ�� ��ġ�ϴ� ��츸 �˻�
			if(voStrName.equalsIgnoreCase(strName)) {
				this.view(i);
				break; // ���ʷ� �߰ߵ� 1���� ������ Ȯ���ϰ� ��ħ
			}
			
			// ������ ���ڿ��߿� strName ���ڿ��� ���ԵǾ�
			// ������ �� ���� ǥ������
			// �߰����ڿ� �˻�
			// "ABC".contains("B")
			// ���ڿ� ABC �߿� ���ڿ� B�� ���ԵǾ� �ֳ�?
			if (voStrName.toUpperCase().contains(strName.toUpperCase())) {
				this.view(i);
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
