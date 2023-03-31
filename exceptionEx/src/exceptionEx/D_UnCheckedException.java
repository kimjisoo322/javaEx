package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * UnCheckedException
 *  - RuntimeException을 상속하고 있는 예외들 >> 실행예외 
 *  - 컴파일시 예외처리코드가 있는지 검사하지 않는다.
 *  - 프로그램 실행 도중 문제가 발생되므로 오류를 예측해봐야함.
 * @author user
 *
 *RuntimeException의 후손들 
 *-ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 이용한 경우
 *-NegativeArraySizeException : 배열의 사이즈를 음수로 지정한 경우
 *-ArithmeticException : 0으로 나눈 경우
 *-NullPointerException : 참조변수의 값이 null인 경우 주소접근연산자를 사용시
 *-ClassCastException : 잘못된 cast연산자 사용자 
 *-InputMismatchException : scanner 입력시 숫자를 문자로 입력한 경우 
 *
 */


public class D_UnCheckedException {
	public static void main(String[] args) {
		D_UnCheckedException d= new D_UnCheckedException();
	//	d.method1();
	//	d.method2();
		d.method3();
	}
	
	public void method1() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.println("숫자를 입력해주세용> <");
				int num = scan.nextInt();
				break;
			//scanner 입력시 숫자를 문자로 입력한 경우 
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "은 입력 불가능합니다.");
				
			}
		}
		
		System.out.println("문자를 입력해주세요");

		//nextInt() _> 숫자 값을 받아올 경우 
		//엔터가 그냥 남아있어서 nextLine() 했을 때 문자를 입력받지 않고 엔터를 출력 
		String str = scan.nextLine();
		int str1 = Integer.parseInt(scan.nextLine());
	}
	
	public void method2() {
		int i = 10;
		int j = 0;
		if(j ==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
	}
	
	public void method3() {
		int size = 0;
		Scanner scan1 =new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		try {
			size = scan1.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println(" 문자 오류가 발생합니다.");
			return;
		}
		
		
		//배열을 생성하는데 배열의 사이즈를 음수로 설정할 경우
		//NegativeArraySizeException이 발생할 소지가 있으므로
		//입력된 값이 양수인지 체크합니다. 
		if(size < 0) {
			System.out.println("배열의 사이즈는 음수입니다. 음수는 입력할 수 없습니다.");
			return; //음수가 입력되면 더이상 프로그램을 실행하지 않겠다= break와 같은 의미
		}
		int[] arr = new int[size];
		
		try {
			//방번호는 0부터 시작하므로 배열의 생성길이 size보다 1 작은수까지 참조가 가능. 
			//현재 size는 0으로 방이 없는 상태! 그래서 유효하지 않은 방번호에 접근하려고 할 경우 오류 발생
			// 현재 방이 0인데 3을 부를 수가 없어! 없거둔 
			int num = arr[size]; 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 길이를 입력했습니다.");
		}
	}
	
}




 






