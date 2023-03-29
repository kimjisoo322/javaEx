package interfaceEx2;

import interfaceEx.Audio;
import interfaceEx.RemoteControl;
import interfaceEx.SmartTv;

public class MyClass {
	//인터페이스는 생성할 수 없다. 
	//인터페이스는 필드, 생성자의 매개변수
	//메서드의 매개변수, 메서드의 로컬 변수로 선언할 수 있다. ==> 타입으로 사용할 수 있음
	
	//필드의 타입, 생성자의 매개변수 타입, 메서드의 매개변수의 타입, 메서드의 로컬변수 타입 ====즉, 다형성 
	
	//인터페이스가 필드의 타입으로 선언된 경우
	//인터페이스의 구현체만 인터페이스를 타입으로 사용할 수 있다.  (인터페이스를 상속 받았을 때, 구현했을 때만 다형성 이용)***
	RemoteControl rc = new SmartTv();
	
	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {
		//매개변수로 받아온 rc를 필드에 저장 
		this.rc=rc;
	}
	
	public void methodA() {
		//Audio객체를 생성하여 RemoteControl 타입으로 자동변환 
		RemoteControl rc = new Audio();
		//생성된 객체를 필드에 저장
		//지역변수 (로컬변수) : 코드블럭안에서 인터페이스 타입으로 생성되었음
		this.rc =rc;
	}
	
	public void methodB(RemoteControl rc) {
		//매개변수로 받아온 rc를 필드에 저장
		this.rc = rc;
	}
	
}

