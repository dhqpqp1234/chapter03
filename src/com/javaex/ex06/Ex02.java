package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		System.out.println(a.concat(b)); 
		System.out.println(a+b);
		
		
		a = a.concat(b);
		System.out.println(a);
		
		System.out.println(a.trim());//문자열 앞뒤 공백을 없앰);
		
		a = a.replace("ab", "12");
		System.out.println(a);
		
		System.out.println("-------------------");
		
		String[] sArray = a.split(",");
		for(int i = 0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		System.out.println("--------------------");
		
		String str = "Hello java!";
		String result01 = str.substring(3);
		System.out.println(result01);
		
		String result02 = str.substring(1,7);
		System.out.println(result02);
		
		char result03 = str.charAt(8);
		System.out.println(result03);
		
		
	}

}
