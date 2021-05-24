package test;

import Utilities.GmailUtility;

public class SendGmail {

	public static void main(String[] args) {
		   //credentials:
        String userName = "mustafaay668@gmail.com";
        String passWord = "";
        
        //email:
        String[] receivers = {"mustafaay668@gmail.com"};
        String subject = "hello";
        String text = "how are you";

        int times = 1;
        
        for(int i =1; i <= times; i++) {
        
            for(String eachReceiver: receivers) {
                GmailUtility.sendEmail(userName, passWord, eachReceiver, subject, text);
                System.out.println("Send to: "+eachReceiver+"   "+i);
            }
        }
        
        
        
        System.out.println("Complete");
        
    }

	}


/*
if you want to use your own google account please go to:

  https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web

    Make sure that your google account allows third part app
        
*/

