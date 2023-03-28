package abstract_0328;

public class Main {
	public static void main(String[] args) {
		//추상클래스 ===> 생성도 할 수 없고, 미완성된 메서드를 포함하고 있을 수 있어 생성x
		
		//Phone p = new Phone();
		
		//추상클래스를 상속받아 추상메서드를 모두 구현하면 
		//일반 클래스로 생성할 수 있다. 
		SmartPhone sp = new SmartPhone("owner");
		
		//참조형 변수의 타입으로 사용이 가능하다
		//->다형성을 활용할 수 있다. 
		Phone phone = new SmartPhone("캔디");
//		-> Phone으로 생성은 못하지만 참조타입으로 사용은 가능
		
		sp.turnOn();
		sp.turnOff();
		sp.internetSearch();
		
		phone.turnOn();
		
	}
}
