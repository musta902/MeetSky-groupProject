package week5;

public class exerciseString {

	public static void main(String[] args) {
		String sentence1="newsnewsnews";
		String word1 = "new";
		
		
		
		String sentence ="javajavajavajava";
			 //              javajavajava
			//                javajava
			//                java
			//                 ""
	    String word = "java";
	    
	    int a = newfrequancy(sentence1,word1);
	    System.out.println(a);
	    
	    
	    System.out.println(newfrequancy(sentence,word));
	}
   public static int newfrequancy(String sentence,String word) {
	
    int count = 0;
	for(int i = 0;i<sentence.length()-word.length()+1;i++) {
		if(word.equals(sentence.substring(i,i+word.length()))) {
			count++;
		}
			
			}
	return count;
	
	
		}
	
	

}
