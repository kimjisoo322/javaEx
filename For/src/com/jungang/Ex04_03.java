package com.jungang;

public class Ex04_03 {

	public static void main(String[] args) {
		while(true) {
			//두개의 주사위를 던져서 나온 수 
			//1,2,3,4,5,6개의 수가 나올 수 있다. 
			//0보다 크거나 같고 5보다 작은 값을 추출 = 0 1 2 3 4 5 
			//주사위는 6, 범위는 *6 (0~5)까지라서 +1(초기값 지정) >> 1~6 숫자를 얻을 수 있음
			
			int tric1 = (int)(Math.random()*6+1);
			int tric2 = (int)(Math.random()*6+1);
			
			int result = tric1 + tric2;
			
			if(result == 5) {
				System.out.println("("+tric1+","+tric2+")");
				break;
			}
		}
	}

}
