package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//리스트에 저장
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("myBATIS");
		list.add(2,"Database"); //2번째 자리에 추가됨 (즉, 방의 번호가 자연스럽게 늘어남) 
		
		list.remove(0);  //삭제, 바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨짐 
		
		list.set(1, "Oracle"); //변경 
		
		//리스트에 저장된 총 개수
		int size = list.size();
		System.out.println("총 개수 : " + size);
		
		//리스트에 저장된 객체 열기 
		String str = list.get(2);
		System.out.println("2번 인덱스 : "+str);
		
		for(int i=0; i<list.size(); i++) {
			 str = list.get(i);
			 System.out.println(i + " : " + str);
		}
		
		//강제로 인덱스 지정 
		int i = 0;
		System.out.println("==========강제로 인덱스 지정한 ver.=======");
		for(String s : list) {
			System.out.println(i + " : " + s);
			i++;
		}
	
	}
}
