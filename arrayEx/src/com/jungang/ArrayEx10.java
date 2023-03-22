package com.jungang;

public class ArrayEx10 {
//배열 복사
	public static void main(String[] args) {
		//int 타입 배열 선언
		//배열의 값 목록
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5];
		
		//기존배열에서 값을 꺼내온다
		for(int i=0; i<oldArray.length; i++) {
			//System.out.println(oldArray[i]);
			System.out.println("oldArray " + i + ":" + oldArray[i]);
			
			//기존배열의 값을 new배열에 대입
			newArray[i] = oldArray[i];
		}
		//newArray출력
		System.out.println("==============newArray============");
		for(int j=0; j<newArray.length; j++) {
			System.out.print(newArray[j]);
		}
		
		
	}

}
