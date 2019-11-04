package com.biz.files;

import java.io.IOException;

public class FileEx_04 {

	public static void main(String[] args) throws IOException {
		
		FileReaderServiceV2 fs = new FileReaderServiceV2();
		String fileName = "src/com/biz/files/data.txt";
		
		fs.read(fileName);

	}

}
