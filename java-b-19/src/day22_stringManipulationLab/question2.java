package day22_stringManipulationLab;

public class question2 {
	
/*Question-2
 * Create a method that accepts two strings, a and b, 
 * return the result of putting them together in the order abba,
 *  e.g. "Hi" and "Bye" returns "HiByeByeHi".makeAbba("Hi", "Bye") → "HiByeByeHi"makeAbba("Yo", "Alice") → 
 * "YoAliceAliceYo"makeAbba("What", "Up") → "WhatUpUpWhat"
 * 
 * 
 */
	public static void main(String[] args) {
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up"));
		
		
		

	}
public static String makeAbba(String str1,String str2) {
		
		return str1 + str2 + str2 + str1;

		
}
}
