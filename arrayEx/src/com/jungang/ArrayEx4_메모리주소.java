package com.jungang;

public class ArrayEx4_메모리주소 {

	public static void main(String[] args) {
		// 스트링 타입의 배열 5칸을 만들기 
		// 첫번째 칸에 이름 입력하기
		
		String[] name = new String[5];
		name[0] = "김지수";
		
		System.out.print("name 배열의 메모리 주소: ");
		System.out.println(name);
		
		// 자바에서 참조형 변수의 메모리 주소를 표시하는 방법
		System.out.println("name 객체의 hashCode : " 
										+ name.hashCode());
		name.hashCode();
		//name 이 가진 hashCode 값을 16진수로 변환 
		System.out.println("16진수로 변환 : " 
									+ Integer.toHexString(name.hashCode()));
		System.out.printf("%x ", name.hashCode());
		
	}

}
