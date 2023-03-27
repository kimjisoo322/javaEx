package exam06;

public class Main {
	public static void main(String[] args) {
		// 자식클래스는 부모타입으로 자동 형변환 할 수 있다.
		Cat cat = new Cat();
	
		Animal anumal = cat; 
		Animal anumal2 = new Cat();
	
		//최상위 객체 : 모든 객체는 object를 상속받는다. 
		Object obj = anumal;
	
	}
	
}
