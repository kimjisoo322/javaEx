package interfaceEx4;

public class Car {
	//Tire tire = new Tire(); 는 오류! why?? 인터페이스는 객체 생성x 
	
	//조건> 인터페이스의 구현체인 경우 = 즉, 한국타이어가 Tire를 구현(implement)했을 경우!
	//인터페이스를 참조변수(tire)의 타입(Tire)으로 사용할 수 있다. 
	Tire tire = new HankookTire();
	
	
	// Car 생성자 (객체) 가 생성될 때 매개변수로 인터페이스가 사용된 경우
	public Car(Tire tire) {
		this.tire = tire; 
	}
	
	public void run() {
		tire.roll();
	}
}
