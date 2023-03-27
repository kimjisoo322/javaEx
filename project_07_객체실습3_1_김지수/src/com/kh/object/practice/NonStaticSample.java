package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		//1. 1~45까지의 임의의 정수 출력
		//중복을 제거 
		
		//0 <= random <1
		//0 <= random <45 
		//1 <= random <46 범위 : 0~44이고 초기화 1을 통해 1~45까지의 수 
//		int num = (int)(Math.random()*45 +1);
		
		int[] lotto = new int[6];
		
		for(int i = 0; i< lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 +1);
			
			//2. 중복체크 
			//동일한 숫자가 입력되었는지 체크 
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		//방을 바꿀 때 필요한 저장공간을 생성
		int temp = 0;
		//3. 순서대로 정렬하기
		for(int i =0; i <lotto.length; i++) {
			for(int j = i; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					//방바꾸기
					temp = lotto[i];
					//작은수가 아프올 올 수 있도록 자리바꿈
					lotto[i] = lotto[j];
					//큰 수를 뒤로 이동
					lotto[j] = temp;
				}
			}
		}
		//반복문을 활용하여 배열을 출력
	//	System.out.println("lotto number");
		for(int num : lotto) {
			System.out.print(num + " ");
		}
		Arrays.sort(lotto);
		System.out.println();
	}
	
	//입력받은 숫자만큼 반복문을 실행
	public void outputChar(int num, char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
	}
	//임의의 알파벳 리턴
	public char alphabette() {
		//문자코드 A = 65, z = 122
		//임의의 수를 생성 
		//숫자를 추출해서 char타입으로 변환
		int num = (int)(Math.random()*58 + 65);
		System.out.print((char)num);
		return (char)num;
		//91~96번까지는 제외	
	}
	
	public String mySubstring(String str, int index1, int index2) {
		//원하는 위치의 문자열을 추출하여 반환해주므로
		//원본은 수정되지 않는다.
		String input = str.substring(index1, index2);
		System.out.println(input);
		return input;
	}
	
}
