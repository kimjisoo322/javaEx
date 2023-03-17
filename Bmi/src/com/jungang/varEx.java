package com.jungang;

public class varEx {

	public static void main(String[] args) {
		
		int value = 0;
		// == 비교연산자
		// 변수의 사용범위 -> 선언된 코드블럭을 벗어나면 사라진다.
		//value 값이 0이라면 코드블럭을 실행 
		if(value == 0) {
			int value2 = value + 20;
		}
		int sum = value + 10;
		System.out.println(sum);
		//int sum2 = value2; //코드블럭을 벗어나면 참조 불가능
	}

}
