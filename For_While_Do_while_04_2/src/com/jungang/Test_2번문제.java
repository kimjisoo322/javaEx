package com.jungang;

public class Test_2번문제 {

	public static void main(String[] args) {
		//for문 1~100까지 정수 
		//3의 배수의 총합 
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sum += i;
				i++;
			}
		}System.out.println(sum);
	}

}
