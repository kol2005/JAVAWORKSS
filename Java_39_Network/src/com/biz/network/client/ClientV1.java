package com.biz.network.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// 192.168.123.21
public class ClientV1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		String serverIP = "192.168.123.45";
		int port = 8085;
		
		Socket sendSocket = new Socket();//(serverIP,port);

		System.out.println("Client Start!!");
		
		//sendSocket.connect(new InetSocketAddress(8085));
		
		while(true) {
			
			System.out.print(">> ");
			String strSend = scanner.nextLine();
			
			// Ű����� �Է��� ���ڿ���
			// UTF-8 �� ���ڵ� �� �� byte �迭�� ��ȯ
			// socket�� ���ؼ� ���ڿ��� �����ϱ� ���� �غ�
			byte[] msg = strSend.getBytes("UTF-8");
			OutputStream os = sendSocket.getOutputStream();
			os.write(msg);
		}
		
	}

}
