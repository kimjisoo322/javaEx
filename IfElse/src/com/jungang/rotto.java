package com.jungang;

public class rotto {

	public static void main(String[] args) {
		//1부터 45까지의 수 중에서 로또 만들기
		//무작위로 5개의 숫자를 출력
		//*45 = 0~44의 범위를 가짐 
		//+1 = 1~45의 로또 범위를 만들어줌. 
		int i = 1;
		while(i<=5) {
			int rotto = (int)(Math.random()*45)+1;
			System.out.printf("오늘의 로또번호: %d \n", rotto);
			i++;
		}
	}
}
