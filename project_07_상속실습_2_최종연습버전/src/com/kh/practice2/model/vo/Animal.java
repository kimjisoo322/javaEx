package com.kh.practice2.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		//초기화 
		
		this.name = name;
		this.kinds =kinds;
	}
	
	public String toString() {   //toString() 메서드를 호출했을 때 문자열을 리턴해준다는 의미! 출력해주는 것이 x 
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak();
}
