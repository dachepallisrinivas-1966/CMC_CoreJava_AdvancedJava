package in.cms.ui;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("JAva");
		System.out.println(str);
		
		System.out.println(str.length());
		str.toUpperCase();
		System.out.println(str);
		str.toLowerCase();
		System.out.println(str);

		
//		str = str.toUpperCase();
//		System.out.println(str);
//		str = str.toLowerCase();
//		System.out.println(str);
		
		String str2 = new String("java program");
		//						  012345678901
		
		System.out.println(str2.indexOf("a"));
		System.out.println(str2.lastIndexOf("a"));
		
		System.out.println(str2.startsWith("java"));
		System.out.println(str2.endsWith("ram"));
		System.out.println(str2.contains("rog"));
		System.out.println(str2.contains("java"));
		System.out.println(str2.contains("ram"));
		
		System.out.println(str2.charAt(5));
		// System.out.println(str2.charAt(15));
		
		
		
		
		
		
		
		
		


	}

}
