package car.common;

public class Car {
	//필드 생성
	String company = "현대자동차";
	String model; 
	String color; 
	int maxSpeed;
	
	
	//생성자의 오버로딩
	//매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	//생성자의 특징
	//반환타입이 없음, 클래스명과 동일함 
	public Car() { // 기본생성자
		//this() 생성자 호출
		//this. : 필드
		//생성자를 사용하기 위해서 매개변수에 알맞은 파라미터를 넣어줍니다. 
		this("기본모델", "블랙",150);
	}
	
	public Car(String model) {
		this(model, null, 0);
	}
	
	public Car(String model, String color) { //개수가 다름 
		this(model, color, 0);
	}
	public Car(String model, String color, int maxSpeed) { //개수+타입이 다름
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
