package interfaceEx;

public class SmartTv extends Television implements Searchable{
	
	//부모 Television의 메서드를 오버라이딩 (재정의) >> 호출하면 자식클래스의 메서드 호출
	@Override
	public void turnOn() {
		System.out.println("SmartTV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다. 바이바이");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println("SmartTv url을 검색합니다.");
	}

}
