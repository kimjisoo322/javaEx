package com.objectEx;

import java.util.HashMap;

public class ObjectEx3 {
	public static void main(String[] args) {
		/**
		 *         타입   타입
		 * HashMap<key><value>
		 * ket, value의 값에 들어가는 타입을 지정할 수 있음!
		 * 
		 * 해쉬맵 선언부 
		 * HashMap<String, String> hashMap = new HashMap<>();
		 * 데이터를 담아올때 put
		 * 데이터 꺼내올때 get
		 * ** 동일한 키가 저장될 수 없음, 동일한 키값이 오게되면 덮어쓰기! 
		 */
		HashMap<String, String> hashMap = new HashMap<>();
		
		//데이터를 담을 때는 키, value
		hashMap.put("학생1", "박지민");
		hashMap.put("학생2", "김태형");
		hashMap.put("학생3", "new value!");
		
		//데이터를 꺼낼때는 키값만
		hashMap.get("키3");

		String str = hashMap.get("키2");
		System.out.println(str);
		
		System.out.println("새로운 키값 등장:" + hashMap.get("학생1"));
	
		
		
		
		
		
		
		
		
		
	}
}
