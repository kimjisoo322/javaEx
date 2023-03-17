package com.jungang;

public class While {

	public static void main(String[] args) {
		int i = 1; 
		int sum = 0;
		
		//i = 1~10 
		while(i<=10) {
			//i = 1~10
			i++;
			//2~11
			System.out.println(i);
			
			sum += i;
		}
		System.out.println("1부터 100까지의 합은: "+ sum);
		
	}

}
