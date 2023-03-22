package com.jungang;

public class Calculator {
	
	//필드 
	//전역변수 
	//접근제한자를 붙이지 않으면 default
	//default > 패키지 내에서 사용할 수 있음 
	private String name;
	
	//생성자의 특징 2가지
	// 1) 클래스명과 동일한 이름 
	// 2) 반환타입이 없다. 
	// 3) new 연산자 만나 객체가 생성될때 생성자 실행
	public Calculator() {
		// 객체를 초기화한다!
		name = "정수 계산기";
		System.out.println(name);
//		System.out.println("Calculator() 생성자를 실행합니다.");
	}
	
	
	//메서드 생성
	//접근제한자 반환타입 메서드명(매개변수타입 변수명){}
	
	//정수의 합계를 구하는 메서드 두 수를 입력받아 두 수의 합을 반환
	/**
	 * 두개의 정수를 입력받아 두 수의 합을 반환합니다
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
