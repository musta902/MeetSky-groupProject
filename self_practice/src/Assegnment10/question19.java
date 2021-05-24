package Assegnment10;

public class question19 {

	public static void main(String[] args) {
		
		String str="javaxjavaapplepearjavaegg";
		
		String str1="java";
		String x ="";
		
		int count= 0;
		
		for (int i=0;i<=str.length()-x.length();i++) {
			if(str.substring(i,i+x.length()).contentEquals(x)) {
				x += str.substring(i, i+x.length());
				count++;
			}
		}
		System.out.println(count);
		System.out.println(x);

		}
	}

/*Return the number of times that the string "java" appears anywhere in the given string word.

Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3*/