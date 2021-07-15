package week5;

public class FrequencyOfWord {

	public static void main(String[] args) {
	//	String sentence ="javajavajavajava";
		//                javajavajava
		//                javajava
		//                java
		//                 ""
		//String word = "java";
		String sentence ="I like programing languages,java is programing languages ";
		String word = "programing";
		int count = 0;
		while(sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
			
			}
		System.out.println(count);
		
		
		System.out.println("--------------------------");
		
		String str="cat cat cat cat cat cat cat dog dog dog dog";
		int numberOfCats=frequency(str,"cat");
		int numberOfdogs=frequency(str,"dog");
		System.out.println(numberOfCats);
		System.out.println(numberOfdogs);

	}
	public static int frequency(String sentence,String word) {
		sentence= sentence.toLowerCase();
		word = word.toLowerCase();
		
	
		int count = 0;
		
		while(sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		
	}
		return count;
		
}
}