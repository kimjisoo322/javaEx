package interfaceEx;

public interface RemoteControl {
	//생성자를 가질 수 없음
	//-인스턴스 필드도 가질 수 없음
	//-> 상수는 사용가능
	//-보통 추상메서드를 가지고 있음
	
	//static final 자동으로 붙여줌
	//상수 : 대문자로 작성하고 문자가 연결될경우 _(언더바) 이용
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	//추상메서드 
	//abstract 키워드 없어도
	//인터페이스에서 작성된 메서드를 추상메서드로 정의해줌 
	
	//자바8버전 이후, default, static 등 
	//일반 메서드로 바꿀 수 있게 해줌
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
}
