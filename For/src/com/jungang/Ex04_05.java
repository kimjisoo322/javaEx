package com.jungang;

public class Ex04_05 {
/*
 
      * 
     ** 
    ***
   ****

 */
	//i = 1,2,3,4
	//j = 4,3,2,1
	public static void main(String[] args) {
		for(int i =1; i<=4; i++) {
			for(int j=4; j>0; j--) {
				
				if(i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

