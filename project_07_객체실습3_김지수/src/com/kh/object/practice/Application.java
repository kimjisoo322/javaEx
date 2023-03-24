package com.kh.object.practice;

public class Application {

	public static void main(String[] args) {
		NonStaticSample ns = new NonStaticSample();
		
		ns.LottoNumbers();
		
		ns.outputChar(5, 'a');
		
		//ns.alphabette();
		
		System.out.println(ns.mySubstring("apple", 2, 4));
		
	}

}
