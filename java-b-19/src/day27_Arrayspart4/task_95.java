package day27_Arrayspart4;

public class task_95 {

	public static void main(String[] args) {
		int[][] scores = {
				{68,75,54,80}, //student-0
				{100,64,20,50},
				{10,35,40,90}
		};
		
		int sum=0;
		for(int column=0;column<scores[0].length;column++) {
			
			sum = sum + scores[0][column];
			
			     // 0 + 68 =68
			    //  68 + 75 =
			
		}
		
		System.out.println(sum/scores[0].length);
		
		int sum2=0;
		for(int row=0;row<scores.length;row++) {
			
			sum2 = sum2 + scores[row][0];
			
		}
		
		System.out.println(sum2);
		
		
	}

}
/*Task-
 * 956875548010064205010354090
 * Student-1Student-2Student-3MathChemistryHistorySport1.
 * Calculate the avg score of student-12.
 
 * Calculate the total math scores
 */