package sec01.exam04;

public class SupersonicAirplaneExample {
		
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane(SupersonicAirplane.NORMAL);
		
		//이륙합니다.
		sa.takeOff();
		
		//부모 메서드
		sa.fly();
		
		// ** 가독성을 높이기 위해 상수사용 **
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		//자식 메서드
		sa.fly();
		
		sa.flymode = SupersonicAirplane.NORMAL;
		//부모 메서드
		sa.fly();
		
		//착륙
		sa.land();
	
	}
}
