package interfaceEx4;

public class Main {

	public static void main(String[] args) {
		//객체를 생성
		//내가 정의해놓은 class를 타입으로 사용
		kumhoTire kumho = new kumhoTire();
		// 금호타이어가 타이어를 구현하고 있어서 tire로 자동형변환! 
		Tire tire = new kumhoTire();
		
		
		// Car 생성자의 매개변수가 tire 타입이니까 그 구현체를 대입시킬 수 있다. 
		Car kumho_Car = new Car(new kumhoTire());
		Car Hankook_Car = new Car(new HankookTire());

		//생성자의 매개변수의 타입으로 인터페이스를 사용하고 있으므로 
		//인터페이스의 구현체를 매개변수로 넣어줘야한다. 
		//인터페이스의 구현체는 추상메서드를 모두 구현해야하며
		//구현체가 구현한 메서드가 실행된다. 
		
		
		kumho_Car.run();
		//kumho_Car.tire.roll();
		System.out.println("======================");
		Hankook_Car.run();
		
		
		
	}

}
