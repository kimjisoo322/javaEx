package car.common;

public class CarMain {

	public static void main(String[] args) {
		//생성자를 호출할 때는 
		//생성자의 매개변수 타입에 맞춰서 순서대로 입력해줘야 합니다. 
		
		System.out.println("car 정보를 출력합니다==========");
		Car car = new Car();

		
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		
		System.out.println("car1 정보를 출력합니다=========");
		Car car1 = new Car("그랜저");
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		
		System.out.println("car2 정보를 출력합니다=========");
		Car car2= new Car("SM5" , "화이트");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		
		System.out.println("car3 정보를 출력합니다=========");
		Car car3= new Car("소나타" , "블랙", 200);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		
	}

}
