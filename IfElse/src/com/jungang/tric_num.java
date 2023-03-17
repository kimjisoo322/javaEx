package com.jungang;

public class tric_num {

	public static void main(String[] args) {
		double tric = Math.random();
		
		int result = (int)((tric*6)+1);
		System.out.println("주사위는 : "+ result);
		
		//break문이 없으면 다 실행됨. >> break문을 만날때까지 계속 실행하는 switch문
		switch(result){
		case 1:
			System.out.println("1번이 나왔습니다.");break;

		case 2:
			System.out.println("2번이 나왔습니다.");break;

		case 3:
			System.out.println("3번이 나왔습니다.");break;
			
		case 4:
			System.out.println("4번이 나왔습니다.");break;

		case 5:
			System.out.println("5번이 나왔습니다.");break;
			
		case 6:
			System.out.println("6번이 나왔습니다.");break;
			
		default: // case에 해당하지 않는 경우에만 실행된다. 
			System.out.println("종료");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		if(tric == 1) {
			System.out.println("1번 당첨! ");
		}else if(tric == 2) {
			System.out.println("2번 당첨! ");
		}else if(tric == 3) {
			System.out.println("3번 당첨! ");
		}else if(tric == 4) {
			System.out.println("4번 당첨! ");
		}else if(tric == 5) {
			System.out.println("5번 당첨! ");
		}else {
			System.out.println("6번 당첨! ");
		}
		*/
	}

}
