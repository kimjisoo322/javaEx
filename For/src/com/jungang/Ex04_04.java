package com.jungang;

public class Ex04_04 {
/*
 
*
**
***
****

*/	
	
	public static void main(String[] args) {
		for(int i =1; i<=4; i++) { //i는 1부터 4까지 가지는 행
			for(int j=1; j<=i; j++) { //j가 1부터 별찍기 출력
				System.out.print("*");
			}
			System.out.println(); //별찍기가 끝나서 나오면 줄바꿈
		}
	}

}
