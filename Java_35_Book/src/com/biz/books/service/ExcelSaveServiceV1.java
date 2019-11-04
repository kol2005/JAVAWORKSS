package com.biz.books.service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import com.biz.books.domain.BookVO;

/*
 * text ������ Java���� �⺻������ �а� ����(����)�� �����ϴ�
 * �� �� BIN(binary,�̹���,����,����,����)���� �⺻������
 * �б�� ���������� �о �����ΰ� ����ó���� �ϴ°��� �ſ� ��ƴ�
 * �� ���Ŀ� �µ��� �����ϴ� �͵� �ſ� ��ƴ�
 * 
 * Binary ������ �а� ���µ��� 3rd Party SDK(Software Devel.Kit)�����ͼ�
 * ����ؾ� �Ѵ�
 * 
 * ���� �����ϱ�� text ���� �����ϱ⸦ ���� �����ϸ�
 * �ƽ���� ����� �����ϴ�
 */
public class ExcelSaveServiceV1 {

	private List<BookVO> bookList;

	// comma separater value(�ĸ��� �и��� ����)
	private String excelExt = ".csv";

	int listSize = 10;

	// FileWriter fileWriter;
	BufferedWriter buffer;

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	private void bufferOpen(String fileName) throws IOException {
		FileOutputStream fo = new FileOutputStream(fileName + excelExt);

		// �ѱ� encoding�� ��ȯ
		// excel ������ �ѱ� encoding ���� ��ȯ : euc=kr
		OutputStreamWriter os = new OutputStreamWriter(fo, "euc-kr");

		buffer = new BufferedWriter(os);

	}

	public void excelSave(String fileName, String text) throws IOException {
		this.bufferOpen(fileName);
		this.title();
		listSize = 1;
		// �ۼ��κ�
		for (BookVO vo : bookList) {
			if (vo.getB_title().contains(text.trim())) {
				this.body(vo);
				listSize++;
			}
		}

		this.footer();
		buffer.flush();
		buffer.close();
		// fileWriter.close();
	}

	public void excelSave(String fileName, int grPrice, int lessPrice) throws IOException {
		this.bufferOpen(fileName);
		this.title();
		listSize = 1;
		// �ۼ��κ�
		for (BookVO vo : bookList) {
			int price = vo.getB_price();
			if (price > -grPrice && price <= lessPrice) {
				this.body(vo);
				listSize++;
			}
		}
		this.footer();
		buffer.flush();
		buffer.close();
		// fileWriter.close();
	}

	private void title() throws IOException {

		// ISBN,TITLE,COMP,WRITER,DATE,PRICE
		buffer.write("ISBN,");
		buffer.write("������,");
		buffer.write("���ǻ�,");
		buffer.write("����,");
		buffer.write("������,");
		buffer.write("����,");
		buffer.newLine();// enter Ű �Է�
		buffer.flush();

	}

	private void body(BookVO vo) throws IOException {
		buffer.write("'" + vo.getB_isbn() + ",");
		buffer.write(vo.getB_title() + ",");
		buffer.write(vo.getB_comp() + ",");
		buffer.write(vo.getB_writer() + ",");
		buffer.write(vo.getB_date() + ",");
		buffer.write(vo.getB_price() + ",");
		buffer.newLine();// enter Ű �Է�
		buffer.flush();
	}

	private void footer() throws IOException {

		// int nSize = bookList.size();
		buffer.write("��������,");
		buffer.write("=COUNTA(B1..B" + listSize + "),");
		buffer.newLine();// enter Ű �Է�
		buffer.flush();
	}

}
