package com.jungang;

public class ArrayEx5 {

/*  접근제어자 정적변수 반환타입 메서드이름(매개변수) 
 *                             (타입[]변수) 
 *  void : 반환타입이 없다는 의미
 *  정적변수 : 무조건 메모리에 올려라는 의미 
 */
	public static void main(String[] args) {
		// System.out.println(args.length);
		
		// mode가 1일때 로컬 / 2일때 테스트 / 3일때 운영
		int mode = Integer.parseInt(args[0]);   //args 가 string 타입이라서 정수형으로 변환

		if(mode==1) {
			System.out.println("로컬환경입니다.");
			// 로컬 DB 접속 
		}else if(mode==2) {
			System.out.println("텍스트환경입니다.");
			// 테스트 DB 접속
		}else {
			System.out.println("운영환경입니다.");
		}
		/*
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
	}
}
