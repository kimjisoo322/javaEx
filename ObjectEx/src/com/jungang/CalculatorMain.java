package com.jungang;

public class CalculatorMain {

	public static void main(String[] args) {
		
		//Calculator 객체를 생성 후 주소값을 반환
		//new Calculator();
		
		// 클래스를 이용해 객체를 생성하면, 타입은 그 클래스가 됨.
		Calculator calc = new Calculator();
		System.out.println("================");
		
		
	//	System.out.println(calc.name);
	//	calc.name = "실수 계산기";
	//	System.out.println(calc.name);
		
		// . : 주소접근연산자  (내가 사용할 수 있는 메서드와 필드가 나옴)
		// 메서드 호출 시, 값만 넣어줌
		// 메서드 생성 시, 타입 넣어줌 
		calc.add(10, 12);

		//재사용할때는 변수에 담아준다.
		int plus = calc.add(20, 30);
		System.out.println(plus);
		
		
	}
}
