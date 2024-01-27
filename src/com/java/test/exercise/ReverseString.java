package com.java.test.exercise;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "GoodMorningEveryone";
		char[] array = str.toCharArray();
		String reversedStr ="";
		
		for(int a = array.length-1; a>=0; a--) {
			reversedStr = reversedStr+array[a];
		}
		
		System.out.println(reversedStr);
	}

}
