package com.biz.network.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerV1 {

	public static void main(String[] args) throws IOException {
		
		// Socket �� ����� 
		ServerSocket server = new ServerSocket(8085);
		
		// ������ ���� �ҷ��ٶ����� ��ٸ���
		System.out.println("Wait.....");
		Socket listen = server.accept();
		
		System.out.println("Connect : " + listen.getInetAddress());
		System.out.println("Port : " + listen.getLocalPort());
		
		while(true) {
			
			// socket���� ���� InputStream ������ ��������
			// ���� ������ �غ�
			InputStream is = listen.getInputStream();
			
			// ���� ������ ���ۺ����� ����
			// �ѹ��� 255����Ʈ�� �������ڴ�
			byte[] msg = new byte[255];
			
			// ���۸�ŭ �����͸� �����ϱ�
			int msgSize = is.read(msg);
			
			// ������ �����͸� �ٽ� UTF-8�� ���ڵ�
			String reader = new String(msg,0,msgSize,"UTF-8");
			System.out.println(">> " + reader);
		}
		
		//OutputStream os = listen.getOutputStream();
		//DataOutputStream dos = new DataOutputStream(os);
		
		
		
	}
}
