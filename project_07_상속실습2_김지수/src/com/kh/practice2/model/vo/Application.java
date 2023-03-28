package com.kh.practice2.model.vo;

public class Application {
	public static void main(String[] args) {
		//animal타입의 객체배열 크기 5로 생성
		Animal[] animalArr = new Animal[5];
	
		
		//각 인덱스에 무작위로 Dog 또는 Cat 객체로 생성
		//매개변수 생성자를 이용하여 생성
		
		Animal aniDog = new Dog("강쥐", "말티즈", 20);
		//aniDog.speak();
		
		Animal aniCat = new Cat("고얌이", "냥냥", "서울", "화이트");
		//aniCat.speak();
		
		// animalArr[0] = aniDog;
		
		 //System.out.println(num);
		 
		 for(int i =0; i <5; i++) {
			 int num = (int)(Math.random()*2);
			 if(num == 0) {
				 animalArr[i] = aniDog;
			 }else {
				 animalArr[i] = aniCat;
			 }
		 }
		 for(int i=0; i<5; i++) {
			 animalArr[i].speak();
			// System.out.println(animalArr[i]);
		 }
		
	}

}
