package day19_StringManupulation_part1;

public class String_Lengt {

	public static void main(String[] args) {
		
		String str ="Java";
		
		System.out.println(str.length());
		
		int x = str.length();
		System.out.println(x*10);
		
		String str1 = new String ("Java");
		System.out.println(str1.length());
		
		str.charAt(0);
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.concat("Emre"));
		System.out.println(str.substring(2));
		
		String result = "10.000 uzeri sonuc arasindan 1-16 arasi gosteriliyor.";
		result.substring(15);
		System.out.println(result.substring(31,33));

	}
}
