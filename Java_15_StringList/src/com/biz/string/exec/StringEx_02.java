package com.biz.string.exec;

public class StringEx_02 {

	public static void main(String[] args) {
		
		String[] nameList = new String[] {
				"ȫ�浿:001:33","�̸���:002:18","������:003",
				"ȫ�浿:001:33","�̸���:002:18","������:003"
				};
		
		int nCount = 0;
		for (String s : nameList) {
			try {
				String[] names = s.split(":");
				
				System.out.println("�̸�:" + names[0]);
				System.out.println("�й�:" + names[1]);
				System.out.println("����:" + names[2]);
					
			} catch (Exception e) {
				System.out.println("Exception �߻�");
				System.out.printf("%d��° ������\n",nCount);
			}
			nCount ++;
			
		}
	}

}
