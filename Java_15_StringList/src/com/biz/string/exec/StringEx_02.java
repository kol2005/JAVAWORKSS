package com.biz.string.exec;

public class StringEx_02 {

	public static void main(String[] args) {
		
		String[] nameList = new String[] {
				"È«±æµ¿:001:33","ÀÌ¸ù·æ:002:18","¼ºÃáÇâ:003",
				"È«±æµ¿:001:33","ÀÌ¸ù·æ:002:18","¼ºÃáÇâ:003"
				};
		
		int nCount = 0;
		for (String s : nameList) {
			try {
				String[] names = s.split(":");
				
				System.out.println("ÀÌ¸§:" + names[0]);
				System.out.println("ÇĞ¹ø:" + names[1]);
				System.out.println("³ªÀÌ:" + names[2]);
					
			} catch (Exception e) {
				System.out.println("Exception ¹ß»ı");
				System.out.printf("%d¹øÂ° µ¥ÀÌÅÍ\n",nCount);
			}
			nCount ++;
			
		}
	}

}
