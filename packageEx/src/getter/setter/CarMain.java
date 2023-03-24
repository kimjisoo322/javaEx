package getter.setter;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		
		//private 접근자를 이용한 경우
		//필드에 직접 접근할 수 없으므로,
		//setter 메서드를 이용하여 필드의 값을 변경시켜 줄 수 있다. 
		car.setSpeed(-50);
		System.out.println("현재속도는 : " + car.getSpeed());
		
		car.setSpeed(50);
		System.out.println("현재속도는 : " + car.getSpeed());
		
		//isStop은 true 와 false 값을 가짐
		//처음 생성시, false 값 
		//멈추지 않은 상태라면 멈추는 메서드를 호출 >> 상태확인 
		if(!car.isStop()) {  // 차가 멈췄어? 아니야? > 차가 멈추지 않았으면 멈춰줘
			car.setStop(true);
		}
		
		car.setStop(true);
		System.out.println("현재속도는 : " + car.getSpeed());
	}

}
