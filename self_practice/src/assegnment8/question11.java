package assegnment8;

import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {
		
         System.out.println(result());
	}
  public static String result() {
	  
	  Scanner user_input=new Scanner(System.in);
	  
	  System.out.println("Enter buy price : ");
	  int buyprice=user_input.nextInt();
	  Scanner user_input2=new Scanner(System.in);
	  
	  System.out.println("enter sell price");
	  int sellprice=user_input2.nextInt();
	  
	  if (buyprice<sellprice) {
		  return "profits";
		  
	  }else if(buyprice>sellprice) {
		  
		  return "loss";
	  }else {
		  return "no loss";
		  
	  }
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
}
/*c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"*/