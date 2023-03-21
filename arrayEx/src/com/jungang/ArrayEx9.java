package com.jungang;

public class ArrayEx9 {
	public static void main(String[] args) {
		String[] name = new String[3];
		name[0] ="최우식";
		name[1] ="최우식";
		name[2] = "윤시윤";
		
		
		//참조타입에서 == : 주소를 비교 
		//equlas : 문자열 자체를 비교 
		if(name[0] == name[1]){
			System.err.println("0번방 == 1번방");
		}else {
			System.out.println("0번방 != 1번방");
		}
	}
}
