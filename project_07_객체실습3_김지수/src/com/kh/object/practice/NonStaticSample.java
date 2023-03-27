package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {
	//메서드
	//1~45까지의 임의의 정수 6개(중복x)
	//오름차순 출력
	public void LottoNumbers() {
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
		for(int j=0; j<i; j++) {
			if(lotto[i] == lotto[j]) {
				i--;
				break;
			}
		}
	}
		Arrays.sort(lotto);  //오름차순 정렬
		System.out.println("1. 랜덤 값 : " + Arrays.toString(lotto));
		
}
	//전달받은 문자를 전달받은 숫자만큼 출력
	public void outputChar(int num, char c) {
		char a =(char)( c * num);
		System.out.println("2. "+ c+"문자 "+num+"개 출력 : "+ a);
	}
	//임의의 알파벳을 하나 리턴
	public char alphabette() {
		int num = 0;
		
		 while(true) {
			 num =(int) Math.random()+58 * 65;
			 
			 if(num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z'){
				 break;
			 } 
		 }
		return (char) num;
	}
	
	//문자열과 시작인덱스, 끝인덱스를 전달받아
	//해당 인덱스 범위의 문자열 리턴 
	public String mySubstring(String str, int index1, int index2) {
		
		String input = str.substring(index1, index2);
		return input;
		
	
	}

}
