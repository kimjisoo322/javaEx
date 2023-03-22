package com.jungang;

public class ArrayEx10_복사2 {

	public static void main(String[] args) {
		
		String[] arr = {"a","b","c"};
		String[] arr2 = new String[5];
		
		// 원본배열, 복사시작 index, 새로운 배열, 새배열에 복사를 시작할 인덱스, 복사할 개수  
		//System.arraycopy(arr, 0, arr2, 0, 0);
		
		//자바 기본 API에서 제공해주는 메서드를 활용해서 배열을 복사 
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		for(int i =0; i<arr2.length; i++) {
			// 배열의 값에 접근할때는 배열이름[인덱스]
			System.out.println("새로운 배열:" + arr2[i]);
		}
		
		//향상된 for문 이용하는 방법
		//(타입 변수명 : 배열의이름)
		//배열에 들어있는 값을 하나씩 꺼내서 변수에 담아준다 > 방번호는 0번부터 끝까지! 
		for(String store : arr2) {
			System.out.println(store);
		}
	}

}
