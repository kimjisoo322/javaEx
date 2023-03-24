package getter.setter;

public class CalculatorMain {

	public static void main(String[] args) {
		//static 정적 필드는 new로 생성하지 않고 사용가능 
		double result = 10*10* Calculator.pi;
		System.out.println(result);

		int result1 = Calculator.plus(10, 5);
		System.out.println(result1);
	
		System.out.println(Calculator.minus(15,5));
	
	}

}
