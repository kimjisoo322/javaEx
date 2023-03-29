package interfaceEx2;

import interfaceEx.Audio;
import interfaceEx.SmartTv;

public class Main {
	public static void main(String[] args) {
		//기본 생성자를 이용해서 생성 >> Myclass는 그냥 class 타입임 원래대로 생성ㅇㅇ
		// 참조타입 변수에 저장
		
		MyClass mc = new MyClass();
		
		//필드에 직접 접근해서 메서드를 호출 > 
		//필드 접근가능한 이유는 rc 필드 타입이 default / private이면 접근 x
		//1. 인터페이스가 필드에 사용된 경우 
		//1_1. SmartTV를 생성
		mc.rc.turnOn();
		mc.rc.setVolume(15);
		mc.rc.turnOff();
		
		System.out.println("***********호****************");
		//1_2. 필드에 새로운 객체를 생성하여 저장 > Audio 생성
		mc.rc = new Audio();
		mc.rc.turnOn();
		mc.rc.setVolume(10);
		mc.rc.turnOff();
		
		System.out.println("************얍****************");
		//2. 인터페이스가 생성자의 매개변수로 이용된 경우 
		//Audio가 인터페이스를 구현하고 있는 구현체라서 이를 생성하여 매개변수로 전달
		//MyClass 매개변수 타입은 RemoteControl > 
		//그래서 RemoteControl 타입을 구현받는 애들이 올 수 있음
		MyClass mc1 = new MyClass(new SmartTv());
		mc1.rc.turnOn();
		mc1.rc.setVolume(5);
		mc1.rc.turnOff();
		
		System.out.println("***************이얏*************");
		//3.인터페이스가 메서드의 매개변수로 이용된 경우
		//기본생성자로 생성하면 rc = new SmartTV();로 선언되고 있다. 
		// 왜? > 필드의 선언부에서 생성하고 있다.
		
		MyClass mc2 = new MyClass();
		mc2.methodB(new Audio());
		mc2.rc.turnOn();
		mc2.rc.setVolume(10);
		mc2.rc.turnOff();
		
		System.out.println("****************************");
		
		
		MyClass mc3 =new MyClass();
		//메서드에 선언된 로컬변수를 rc에 저장한다. 
		mc3.methodA();
		mc3.rc.turnOn();
		mc3.rc.turnOff();
		
	}

}
