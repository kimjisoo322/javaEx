package com.kh.practice2.model.vo;

public class Dog extends Animal{
	public static final String PLACE = "애견카페";
	private int weight;

	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds); //부모 생성자 호출
		setWeight(weight);  //내가 가지고 있는 값으로 필드를 초기화 > set 
	}

	@Override
	public void speak() {
		//부모의 메서드를 호출
		//호출된 메서드를 변수에 저장
		String str = super.toString();
		
		System.out.println(str + " " + "몸무게는" + weight + "kg입니다.");
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
	
	
}
