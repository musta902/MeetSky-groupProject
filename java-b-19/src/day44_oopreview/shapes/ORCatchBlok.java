package day44_oopreview.shapes;

public class ORCatchBlok {

	

		static String str;

		public static void main(String[] args) {
			
			try {
				
				System.out.println(str.toUpperCase());
				
			}catch(IllegalArgumentException | NullPointerException e) {
				
				//Exception types can not be sub-parent types
				e.printStackTrace();
			}

	}

}
