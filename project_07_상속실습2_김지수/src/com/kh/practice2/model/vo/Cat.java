package com.kh.practice2.model.vo;

public class Cat extends Animal {
	private String location;
	private String color;
	
	public Cat() {
		
	}
	
	public Cat(String name, String kind, String location, String color) {
		super(name, kind);
		this.location = location;
		this.color = color;
	}
	//메서드
	@Override
	public void speak() {
		System.out.println(super.toString()+ " " + getLocation()+ "에 서식하며, 색상은 " + getColor() +"입니다.");
		
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
