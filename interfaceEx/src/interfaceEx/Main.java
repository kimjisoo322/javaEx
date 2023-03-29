package interfaceEx;

public class Main {
	public static void main(String[] args) {
		//인터페이스는 생성할 수 없지만 
		//참조변수의 타입으로 사용할 수 있다. 
		
		//인터페이스의 다형성 
		//인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다. 
		RemoteControl rc = new Audio();

		//이 방법도 가능 
		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();
		
		RemoteControl tv = new Television();
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
		
		//상속단계에 있는 부모가 인터페이스를 구현하고 있는 경우
		//인터페이스의 타입으로 생성이 가능하다 
		//smartTv는 구현체가 아니지만 상속하는 부모가 구현체이기 때문에! 
		RemoteControl smart = new SmartTv();
		smart.turnOn();
		tv.setVolume(20);
		smart.turnOff();
		
		Searchable scSmart = new SmartTv();
		
		Television tvSmart= new SmartTv();
		
		Searchable scAudio = new Audio();
		scAudio.search("");
		
	}
}
