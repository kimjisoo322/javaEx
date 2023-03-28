package extends_0328_;

public class Application {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		//참조타입만 올 수 있어서 참조타입인 vehicle 타입이 들어옴 (?)
		//차량이 달립니다.
		driver.drive(new Vehicle());
		
		//bus가 vehicle을 상속받아서 구현되어서
		//vehicle로 자동형변환 될 수 있다. 
		//부모의 메서드(vehicle)가 오버라이딩(bus에서) 된 경우 자식 메서드를 호출 
		//매개값으로 어떤 자식 객체가 제공되는가에 따라 메서드 실행결과가 다양해짐 > 다형성! 
		driver.drive(new Bus());
		
		//**상속받아서 구현된 클래스만 형변환이 가능하다! 
		
		driver.drive(new Taxi());
	}
	
}
