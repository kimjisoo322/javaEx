
package car.object;

public class Person {
	public static void main(String[] args) {
		Car car = new Car("제네시스");
		//car.company = "르노삼성";
		Car car1 = new Car();
		car1.company= "삼성";
		System.out.println("company : " + car.company);
		System.out.println("company : " + car1.company);
		
		System.out.println("speed : " + car.speed);
		
		car.speedUp();
		System.out.println("car.speedUp()");
		System.out.println("speed : " + car.speed);

		
		car.speed = 100;
		car.speedUp();
		System.out.println("speed : " + car.speed);
		
		
		
		
		
	}
}
