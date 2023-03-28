package extends_0328_;

public class Driver {
	//메서드
	//Vehicle을 상속받아서 만들어진 객체를 vehicle로 전달받을 수 있다. 
	void drive(Vehicle vehicle) {

		//Vehicle을 상속받아서 구현된 객체가 매개변수로 입력된 경우 
		//부모타입으로 자동형변환 된 경우만!  >> 강제타입형변환이 가능 
		//if문으로 원래 타입에 대해 물어보고 
		//instanceof : vehicle이 어떤 클래스로부터 생성되었는지 알기 위해서 
		// => 어떤 객체가 어느 클래스의 인스턴스인지 확인
		// boolean a = 좌항(객체)instance of 우항(타입)
		
		//부모타입이 자식타입으로 강제캐스팅 : 오류!!
		
		//자식 -> 부모 --> 자식 
		//만약, vehicle의 원래 타입이 bus가 맞다면 
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			//new 연산자로 생성된 타입을 확인
			System.out.println("Bus타입으로 변환 성공");
		}else {
			System.out.println("Bus타입으로 변환 불가능");
		}
		
		if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi)vehicle;
			System.out.println("택시 타입 변환 성공");
		}else {
			System.out.println("택시 타입 변환 X!!!");
		}
		vehicle.run();
	}
}
