package abstract_0328_ex;

//추상메서드를 하나라도 포함할 경우 추상클래스가 됩니다!!

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//매개변수의 다형성 > 매개변수에 참조타입
	public void print(Animal animal) {
		System.out.println("=================");
		animal.sound();
		System.out.println(animal.kind);
		System.out.println("=================");
	}
	
	
	//추상메서드 : 미완성된 메서드 > (코드블럭이 미완성)
	public abstract void sound();
	
	
}
