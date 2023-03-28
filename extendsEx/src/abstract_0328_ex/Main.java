package abstract_0328_ex;

public class Main {
	public static void main(String[] args) {
		 
		//Animal로 생성은 할 수 없지만, 변수의 타입으로는 사용가능! >> why? Animal은 추상클래스
	
		//부모 타입으로 형변환
		//dog가 animal로 자동형변환
		//(자식)  (부모)
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		//매개변수의 타입으로 불러올 수 있다.
		cat.print(cat);
		cat.print(dog);
	}
}
