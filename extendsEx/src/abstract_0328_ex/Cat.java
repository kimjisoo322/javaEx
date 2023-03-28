package abstract_0328_ex;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	//상속하면서 animal이 가진 추상메서드를 강제로 구현
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
