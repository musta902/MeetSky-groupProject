package assegnment8;

import java.util.Scanner;

public class question15 {

	public static void main(String[] args) {
		boolean b = validateTask(false);
		System.out.println(b);

	}
	public static boolean validateTask(boolean flag) {
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter true or false and 2 task ID");
		flag = user_input.nextBoolean();
		int taskld = user_input.nextInt();
		int currentID = user_input.nextInt();
		
		if(flag==false) {
			flag=false;
		}else if(flag==true && taskld==(currentID+1)) {
			flag=true;
		}else {
			flag=false;
		}
		return flag;	
		

	}

	
}
/*We have a to do list app, every time a user adds a task - a few things needed to be checked.

It should not be empty. boolean parameter needs to be true
taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is 7) so the next task id is 8 , it can't be 10.


for example:

validateTask(true,2,1)
returns true

validateTask(true,3,1)
returns false

validateTask(false,3,2)
returns false*/