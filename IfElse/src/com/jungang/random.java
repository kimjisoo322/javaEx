package com.jungang;

public class random {

	public static void main(String[] args) {
		//Math.random( ) 
		//0.0 ~ 1.0 사이의 무작위수를 추출해 double 타입으로 반환 
		
		//10을 곱했을 때 0-9   -> 1 ~ 10 (start에 1을 더해줌, 양쪽에 1씩 더해줘서 1부터 10까지의 범위가 완성) 
 		//100을 곱했을 때 0-99 
		
		//(Math.random()*n) + start		
		double rotto1 = (int)(Math.random()*45);
		double rotto2 = (int)(Math.random()*45);
		double rotto3 = Math.random();
		double rotto4 = Math.random();
		double rotto5 = Math.random();
		
		System.out.println(rotto1);
		System.out.println(rotto2);
		System.out.println(rotto3);
		System.out.println(rotto4);
		System.out.println(rotto5);
		
		
		//주사위 1~6까지
		//*6 => 0 ~5까지의 범위 
		//start에 1 추가 (1~6까지)범위로 완성
		int tric = (int)(Math.random()*6)+1;
		System.out.println(tric);
		
		
		
	}

}
