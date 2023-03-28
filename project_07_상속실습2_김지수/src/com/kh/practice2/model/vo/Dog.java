package com.kh.practice2.model.vo;

public class Dog extends Animal {
	public String PLACE = "애견카페";
	
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kind, int weight) {
		super(name, kind);
		this.weight = weight;
	}
	
	//메서드
	@Override
	public void speak() {
	    System.out.println(super.toString()+ " " + "몸무게는" + getWeight()+ "kg 입니다.");
	}

	public String getPLACE() {
		return PLACE;
	}

	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
