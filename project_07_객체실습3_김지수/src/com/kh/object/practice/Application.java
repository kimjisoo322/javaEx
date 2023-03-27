package com.kh.object.practice;

public class Application {

	public static void main(String[] args) {
		NonStaticSample ns = new NonStaticSample();
		
		ns.LottoNumbers();
		
		ns.outputChar(5, 'a');
		
		System.out.println("랜덤 영문자 출력: "+ ns.alphabette());
		
		System.out.println("4. apple의 2번 4번 인덱스 사이의 값 출력:"+ ns.mySubstring("apple", 2, 4));
		
	}

}
