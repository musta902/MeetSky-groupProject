package assegnment8;

import java.util.Scanner;

public class question16 {

	public static void main(String[] args) {

		boolean b = simpleRoomBook(false);
		System.out.println(b);
	}

	public static boolean simpleRoomBook(boolean flag) {

		Scanner user_input = new Scanner(System.in);

		System.out.println("Enter true or false for reservation: ");
		flag = user_input.nextBoolean();

		System.out.println("Enter reservation Date as MONTH: ");
		int resMonth = user_input.nextInt();

		System.out.println("Enter reservation as DAY: ");
		int resDay = user_input.nextInt();

		if (flag == false) {
			return false;
		} else if (flag == true && resMonth == 7 && resDay >=1 && resDay <= 8) {
			return false;
		} else {
			return true;
		}
		
		
	

	}

}
/*To book a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false*/