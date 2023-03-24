package static_practice;

public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		System.out.println(Calculator.plus(10, 20));
	}

}
