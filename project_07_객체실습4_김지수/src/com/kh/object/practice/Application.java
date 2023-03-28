package com.kh.object.practice;

public class Application {

	public static void main(String[] args) {
		//staticSample의 value 필드 값을 초기화 
		//정적 멤버 접근 : 클래스명.필드명 or 클래스명.메서드명 
		StaticSample.setValue("Java");
		//직접 접근이 안돼! > get 메서드를 활용하여 필드값 추출
		System.out.println("1. value :" + StaticSample.getValue());
		
		//메서드 호출 후 value 값 출력
		StaticSample.toUpper();
		System.out.println("2. 대문자로 변경 : " + StaticSample.getValue());

		//2번째 인덱스의 값을 j로 변경
		StaticSample.setChar(0, 'C');
		System.out.println("3. 0번째 값을 C로 변경 : " + StaticSample.getValue());
		
		System.out.println("4. 문자열의 길이 : " + StaticSample.valueLength());
		
		System.out.println("5. PROGRAMMING을 붙여서 : "+ StaticSample.valueConcat("PROGRAMMING"));
		
	}

}
