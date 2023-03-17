package com.jungang;

public class RoopFor {

	public static void main(String[] args) {
		//반복문 -for문 
		//for(초기식; 조건식; 증감식){코드블럭}
		// 실행순서 : 초기식 -> 조건식 -> 코드블럭 -> 증감식 -> 조건식
		
		//1~100가지의 합
		
		//for문 만들 때, i부터 출력해봐라. 다 만들고 출력하려고 하지 않기 
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			//System.out.println("for문 " + i);
			//sum = sum + i;
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
		
		int i = 0;
		int sum1 = 0;
		while(i < 5) {
			System.out.println("while 출력 : " + i) ;
			sum1 +=i;
			i++;
		}
		System.out.println("while문 sum은 : " + sum1);
	}

}
