package extends_0328;

//Car 라는 객체가 tire를 부품으로 가지고 있음 > 필드로 만든 건 나의 속성으로 사용하겠다. 
public class Car {
	//타이어 초기값 null; 
	//참조변수 를 필드로 사용 ** 
	private Tire tireFR;
	private Tire tireFL;
	private Tire tireBR;
	private Tire tireBL;

	
	public Car(Tire tire1
			  ,Tire tire2
			  ,Tire tire3
			  ,Tire tire4) {
		
		tireFR = tire1;
		tireFL = tire2;
		tireBR = tire3;
		tireBL = tire4;
		
	}
		//생성자
		//타이어 필드를 초기화
		
	/*	
	 * 
		tireFR = new Tire("FR", 3);
		tireFL = new Tire("FL", 5);
		tireBR = new Tire("BR", 1);
		tireBL = new Tire("BL", 10);
*/

	
	/**
	 * 바퀴를 굴려줍니다.
	 * @return
	 */
	public int run() {
		boolean next = tireFR.roll();
		//타이어 교체
		if(!next) {
			System.out.println(tireFR.location + "타이어가 교체됩니다.");
			return 1;
			//다형성에 의해 
			//자식객체는 부모의 타입으로 자동형변환 된다!!!!!!
		}
		if(!tireFL.roll()) {
			System.out.println(tireFL.location + "타이어가 교체됩니다.");
			return 2;
		}
		if(!tireBR.roll()) {
			System.out.println(tireBR.location + "타이어가 교체됩니다.");
			return 3;
		}
		if(!tireBL.roll()) {
			System.out.println(tireBL.location + "타이어가 교체됩니다.");
			return 4;
		}
		return 0;
	}
	
	/**
	 * 바퀴의 위치를 매개변수로 받아서 
	 * 해당 위치의 바퀴를 교체하는 메서드 
	 * @param location
	 */
	public void changeTire(int location) {
		switch (location) {
		case 1:
			tireFR = new KumhoTire(tireFR.location, 3);
			break;
		case 2:
			tireFL = new KumhoTire(tireFL.location, 3);
			break;
		case 3:
			tireBR = new KumhoTire(tireBR.location, 3);
			break;
		case 4:
			tireBL = new KumhoTire(tireBL.location, 3);
			break;

		default:
			break;
		}
	}
}