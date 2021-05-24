package day27_Arrayspart4;

public class Loop2DArray {

	public static void main(String[] args) {
		
		int[][] numbers= {{1,2,3},{4,5},{7,8,9}};
		
		for(int rows =0;rows<numbers.length;rows++) {
			for(int column=0;column<numbers[rows].length;column++){
				
				
				System.out.println(numbers[rows][column]);
			}
		}
		
		
		
		
		

	}

}
