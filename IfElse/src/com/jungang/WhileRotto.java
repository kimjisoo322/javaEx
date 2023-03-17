package com.jungang;

public class WhileRotto {

	public static void main(String[] args) {
		int i =0;
		while(true){
			int rotto = (int)(Math.random()*45)+1;
			System.out.println("오늘의 로또! " + rotto);
			
			if(i++ == 5) {
				break;
			}
			
		}
	}

}
