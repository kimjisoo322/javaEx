package com.objectEx;

public class ObjectEx2 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println("===========object비교=========");
		boolean result =obj1.equals(obj2);
		System.out.println(result);
		System.out.println(obj1.equals(obj2));
	
		String str3 = new String(" ");
		String str4 = new String(" ");
		
		System.out.println("==============string 비교============");
	
		System.out.println(str3==str4); //주소는 다르지만 
		
		System.out.println(str3.equals(str4)); //값이 같다면 일치한다. 메서드 재정의 
	}
}
