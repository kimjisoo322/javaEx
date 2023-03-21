package com.jungang;

public class array2Ex {

	public static void main(String[] args) {
		//배열 생성
		
		String[] menu = {"김치찌개", "부대찌개", "된장찌개", "순두부찌개", "금식"};
		
		//반복문을 이용해 배열에 입력된 값을 출력 
		//초기화; 조건식; 증감식
		
		for(int i =0; i<menu.length; i++) {
			// 배열의 값에 접근 : 변수이름[방번호] 
			System.out.println(menu[i]);
		}
		System.out.println("오늘의 점심메뉴는 : " + menu[0]);
	}

}
