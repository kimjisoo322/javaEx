package sec01.exam04;

public class Main {
	public static void main(String[] args) {
		//부모타입으로 자식 객체를 생성합니다. 
		//자동형변환됩니다. 
		Airplane airplane  = new SupersonicAirplane(SupersonicAirplane.SUPERSONIC);
		
		// 부모타입으로 변환시,
		// 1. 부모가 가지고 있는 필드 or 메서드 접근이 가능하다.
		// 2. 재정의 메서드 호출시
		System.out.println("재정의 메서드 호출");
		airplane.fly();

		//자식타입으로 형변환 -> 강제형변환
		SupersonicAirplane supersonic = (SupersonicAirplane)airplane;
		
		//원래 타입으로 변환 시, 
		//자식 클래스가 가지고 있는 필드 또는 메서드에 접근이 가능해진다. 
		System.out.println("자식타입으로 강제 형변환");
		supersonic.booster();
		System.out.println(supersonic.flymode);
	}

}
