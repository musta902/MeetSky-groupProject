package day38_inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {
		StaticSub obj = new StaticSub();
		obj.num =5;
		obj.print();
		StaticSuper.num=10;
		obj.print();
		System.out.println(StaticSub.num);
		
		//StaticSub.m2(); wrong because m2 is not static you need to call object name
		obj.m2();
		

	}

}
