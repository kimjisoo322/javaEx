package extends_0328_;

public class Bus extends Vehicle {
	
	
	//부모가 가진 run()메서드 재정의 
	@Override
	public void run() {
		//super.run();
		System.out.println("버스가 달립니다.");
	}

}
