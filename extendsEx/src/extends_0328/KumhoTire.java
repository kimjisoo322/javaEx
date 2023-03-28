package extends_0328;

public class KumhoTire extends Tire{
	
	
	public KumhoTire (String location, int maxRotaion) {
		//부모가 가진 생성자를 호출 
		//생성자를 만들면 기본생성자가 생성되지 않습니다. 
		//그래서 직접 부모가 가진 매개변수 생성자를 호출해야합니다. 
		
		//금호타이어는 더 좋아졌으니까, 지정해준 maxRotation에서 +2를 추가 지정해준다. 
		super(location, maxRotaion+2);
	}
	
	@Override
	//Tire가 가진 roll() 메서드를 금호타이어에서 재정의해본 것!
	public boolean roll() {
		accumulatedRotaion++; //타이어 1회전 
		System.out.println("******금호타이어 " + 
		                   location + "누적 회전수 : " + accumulatedRotaion);
		System.out.println("******금호타이어 " +
		                   location + "최대 회전수 : " + maxRotaion);
		if(maxRotaion <= accumulatedRotaion) {
			//바퀴를 교체해야한다고 알려준다.
			System.out.println("바퀴를 교체해주세요");
			return false;
		}else {
			return true;
		}
	}

}
