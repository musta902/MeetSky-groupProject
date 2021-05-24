package Assegnment10;

public class question27 {

	public static void main(String[] args) {
		String word1="java methods";
		String word2= "me";
		
		coverString(word1,word2);
		System.out.println(coverString(word1,word2));

	}
public static String coverString(String str1 ,String str2) {
	
	String grab = "";

	for (int i = 0; i < str1.length() - str2.length() + 1; i++) {

		if (str1.substring(i, i + str2.length()).equals(str2)) {

			grab += str1.replace(str1.substring(i, i + str2.length()), "[" + str2 + "]");
			break;
		}

	}
	return grab;
	
	
}
}
/*coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Sample Output:

     coverString("java methods", "me") ) ; ==> "java [me]thods"

     coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

     coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

     coverString("apples", "pears") ) ; ==> "[apples]"*/