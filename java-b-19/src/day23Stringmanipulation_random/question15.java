package day23Stringmanipulation_random;

public class question15 {

	public static void main(String[] args) {
String str = "badxx"; //0 and 1
		
		//String str = "xbadxx";
		
		//String str = "xxbadxx";
		
		boolean flag = true;
				
				
				
		for(int i=0;i<2;i++) {
			
			if(str.substring(i, i+3).equals("bad")) {
				
				flag = true;
				break;
				
			}else {
				
				flag = false;
			}
			
		}
		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
/*Question-15Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
 *  such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
 * hasBad("badxx") →true
 * hasBad("xbadxx") →true
 * hasBad("xxbadxx") →false*/
 