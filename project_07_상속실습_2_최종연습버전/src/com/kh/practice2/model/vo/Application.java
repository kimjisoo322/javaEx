package com.kh.practice2.model.vo;

public class Application {
	public static void main(String[] args) {
		
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] aniArr = new Animal[5];
		
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		
		Dog dog = new Dog("뫙뫙이", "시츄", 25);
		Cat cat = new Cat("냐옹이", "페르시안", "서울", "화이트");
		
		//무작위로 뽑아오기 > 고양이 또는 강아지만 들어가니까 2가지 범위 _0,1
		//무작위로 5번 뽑아와야 해서 for문을 사용
		//만약에 뽑은 숫자가 0이면 배열이름[방번호]에 강아지를 아니면 배열이름[방번호]에 고양이 넣기
		for(int i =0; i<5; i++) {
			int num = (int)(Math.random()*2);
			
			if(num == 1) {
				aniArr[i] = dog;
			}else{
				aniArr[i] = cat;
		} 
	}
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		
		for(Animal a :aniArr) {
			//자식객체에서 재정의(오버라이딩) 되어진 메서드가 호출됨
			a.speak();
		}
	}
}

