package com.jungang;

public class Practice_중첩for문 {

	public static void main(String[] args) {
		// 구구단 출력하기 
		// 처음에는 a1 * a2 = 결과값 
		// 2단~9단을 출력
		// 즉, a2는 1~9까지 곱해져야 하고  (for i=1; i<=9; i++)		
		// a1은 2부터 9까지 곱해져야 함.   (for j=2; j<=9; j++)
		
		//**a2가 두번째 곱해지는 부분이라서 중첩된다. a1 for문 안으로 들어가야 함.
		// 출력은 j * i = j * i 
		for(int j=2; j<=9; j++) {
			System.out.println("****구구단****");
			for(int i=1; i<=9; i++) {
				System.out.println(j +"*"+i + "="+ j*i);
				
			}
		}
	}

}
