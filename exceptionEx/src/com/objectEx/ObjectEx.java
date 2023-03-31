package com.objectEx;


/**
 * 1. API(Application Programming Interface)
 * -API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다.
 * -자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모듬을 말한다.
 * -(라이브러리라고 부르기도 한다.)
 * 
 */
public class ObjectEx {
	public static void main(String[] args) {
		String str = "호호"; // -> object 로 변환 
		print(str);
		System.out.println("=======================");
		
		int num = 0;  // -> Integer -> object로 변환
		print(num);
		System.out.println("=======================");
		
		ObjectEx objectEx = new ObjectEx();
		print(objectEx);
		
		
	}
	//참조타입의 최상위계층 = Object 
	public static void print(Object obj) {
		//Object 클래스에 toString이 정의되어있지만 
		//메서드의 오버라이딩에 의해서 
		//String 클래스, Integer 클래스에 정의되어 있는 메서드가 호출된다.
		System.out.println(obj.toString());
		
		//두 객체가 가지고 있는 주소값이 같은지 비교
		//주소가 같은면 true, 다르면 false
		obj.equals(new Object());
		
	}



}
