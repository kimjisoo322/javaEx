package com.jungang;

public class While_break {

	public static void main(String[] args) {
		/*주사위 번호 중 하나를 반복적으로 무작위 뽑되, 6이 나오면 while문을 종료
		 *1
		 *5
		 *6
		 *프로그램 종료 
		 */
		
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num == 6) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		
		
	}

}
