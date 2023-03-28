package extends_0328;

public class Tire {
	public int maxRotaion;    //최대회전수, 타이어가 생성될 때 초기화
	public int accumulatedRotaion; //누적회전수
	public String location; //타이어의 위치
	
	public Tire (String location, int maxRotaion) {
		//필드를 초기화 
		this.location = location;
		this.maxRotaion = maxRotaion;
	}
	
	/**
	 * 타이어 1회전 - rotation 1증가
	 * 1번 실행 할때마다 누적회전수를 증가시킵니다. 
	 * 만약, maxRotation(최대회전수) 보다 크거나 같으면 false를 리턴합니다.
	 * @return
	 */
	
	public boolean roll() {
		accumulatedRotaion++; //타이어 1회전 
		System.out.println(location + "누적 회전수 : " + accumulatedRotaion);
		System.out.println(location + "최대 회전수 : " + maxRotaion);
		if(maxRotaion <= accumulatedRotaion) {
			//바퀴를 교체해야한다고 알려준다.
			System.out.println("바퀴를 교체해주세요");
			return false;
		}else {
			return true;
		}
	}

}
