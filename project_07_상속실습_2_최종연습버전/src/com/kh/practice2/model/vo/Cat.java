package com.kh.practice2.model.vo;

public class Cat extends Animal{
	private String location;
	private String color;
	
	public Cat() {
		
	}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);     //부모 생성자 호출 
		this.color =color;
		this.location=location;
		//setLocation(location);  //내가 가지고 있는 값으로 필드를 초기화 > set 
		//setColor(color);
	}

	@Override
	public void speak() {
		String str = super.toString();
		System.out.println(str + " " + location + "에 서식하며, 색상은 " + color + "입니다.");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
