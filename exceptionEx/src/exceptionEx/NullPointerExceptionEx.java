package exceptionEx;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		String str = null;
		
		// 참조변수가 null 값을 가지고 있을때 
		// 참조변수로부터 객체접근연산자(.)을 이용해서 접근할때 발생하는 오류
		
		try {
			//str.toString();
			print(str);

		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
	
		//프로그램은 오류가 발생되면 나를 호출한 곳으로 떠넘김 > print가 실행되면 str이 널값이라서 프로그램 오류 발생
		//처음은 prinln 실행하고 그 코드를 print로 보내면서 main안에서 오류가 발생
	}
    
	public static void print(String str) throws Exception {
		throw new Exception("강제 오류 발생"); 
	}

}
