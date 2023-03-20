package com.jungang;

public class Dan2 {
//이중for문 이용해 구구단 출력하기
	public static void main(String[] args) {
		//2~9
		
		Outter:
		for(int dan =2; dan<=9; dan++) {
			System.out.println(dan + "단");
		//1~9
			for(int i=1; i<=9; i++) {

				if(dan==6) {
					break Outter;
					}
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			//중첩for문 종료
			System.out.println();
		} //for문 종료
	} //main 코드블럭 종료
}//class 코드블럭 종료
