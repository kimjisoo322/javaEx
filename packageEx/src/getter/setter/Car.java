package getter.setter;
//싱글톤 패턴
public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
	    //필드값을 반환
		return speed;
	}
	public void setSpeed(int speed) {
		//필드값을 변경
		//유효하지 않은 값은 변경할 수 없게끔, 검증 작업 후 변경한다.
		if(speed>0) {
			this.speed = speed;
		}else {
			this.speed = 0;
		}
	}
	//is로 시작하면 반환타입이 boolean인 경우가 많음
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		if(stop) {
			this.setSpeed(0);
		}
		
		this.stop = stop;
	}

}
