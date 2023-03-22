package car.object;

public class Car {
	//필드
	//값을 초기화 해주지 않으면 초기값을 입력 ex) 정수 0, 실수 0.0, 논리 false, 참조타입 null
	String company = "현대자동차";
	String model = "그랜저";
	int speed;
	boolean enginStart;
	
	// 매개변수가 있는 생성자 
	public Car(String company) {
		// 필드의 이름과 매개변수의 이름이 동일한 경우 지역변수인 매개변수가 우선됨 
		// 결과적으로 블록 내부에서 company 값은 매개변수의 값을 가르킴
		// this : 생성된 객체를 의미 
		// 내가 생성된 객체 안의 필드에다가 매개변수의 값을 넣어줘 
		this.company = company;
	}
	// 매개변수가 없는 *기본생성자
	// 생성자를 만들지 않으면 컴파일러가 자동으로 만들어주는 생성자 
	// 생성자를 하나라도 만들면 자동으로 만들어주지 않는다!! 
	public Car() {
	}

	public void speedUp() {
		speed += 10;
	}

}
