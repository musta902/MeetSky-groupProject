package Assegnment10;

import java.util.Scanner;

public class question22 {

	

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        String html = "!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>";

	        boolean flag =false;

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a search value=");
	        String input = sc.next();

	        for (int i = 0; i < html.length() - 3; i++) {

	            if (html.substring(i, i + 4).equals(input)) {

	                flag=true;
	                break;
	            }


	        }

	        if (flag==true) {

	            System.out.println("html contains " + input);

	        }else {

	            System.out.println("invalid input");
	        }
	}

}
