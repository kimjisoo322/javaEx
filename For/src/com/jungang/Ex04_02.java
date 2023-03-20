package com.jungang;

public class Ex04_02 {
//for문 이용
//1~100까지 정수 중에서 3의 배수의 총합 구하기 
	
	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=100; i++) {
			
			if(i % 3 != 0) {
				//3의 배수가 아니면 증감식으로 이동
				// == 같으면 , != 같지 않으면 
				//break:반복문 탈출
				//continue:증감식으로 이동해 >  
				//continue 이후의 명령문장을 실행하지 않고 증감식으로 이동
				continue;
			}//3의 배수만 넘어올 수 있다.
			System.out.println("i = "+ i);
			sum+=i;
		} //for문의 끝 
		System.out.println("3의 배수의 총합은 = "+ sum);
	}
}
