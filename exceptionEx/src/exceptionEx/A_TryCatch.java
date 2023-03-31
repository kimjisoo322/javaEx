package exceptionEx;

/**
 * try{
 *  //예외가 발생할 수 있는 코드들을 작성 
 * } catch(Exception){
 *      > exception을 상속받아서 작성된 클래스들 > 일반/실행으로 나눠짐 
 *  //try블록에서 예외가 발생시 실행을 멈추고 catch 블록을 실행 
 * }finally{
 *  //생략이 가능
 *  //예외가 발생하거나 예외가 발생하지 않았을 경우 모두 실행 
 *  //보통 자원을 반납하는 문장이 작성
 * }
 *
 *오류처리 2가지
 *1. 오류 떠넘기기 (throws Exception) >>계속 오류나면서 프로그램이 종료될 수 있음 (강제종료의 위험)
 *2. 오류 처리   (try catch문) >> 프로그램이 강제 종료되지 않도록 처리 (오류내용 출력+ 사용자에게 메세지 출력가능)
 *
 *
 */


public class A_TryCatch {
	public static void main(String[] args) throws Exception {
		A_TryCatch a = new A_TryCatch();
		a.method1();
		System.out.println("================");
		a.method3();
	}
	
	public void method3() throws Exception {
		method2();
	}
	
	public void method1()  {
		//오류가 발생할 소지가 있는 메서드를 try-catch문으로 감싸 오류 처리 가능
		//프로그램이 강제 종료 되지 않도록 처리 
		try {
			System.out.println("method2() 호출 전");
			method2();
		} catch (Exception e) {
			System.out.println("method2() 호출 도충 오류 발생!");
		//	e.printStackTrace();
		}finally {
			//필수로 작성해야하는 건 아님! > 자원을 반납할때는 쓰기 
			//무조건 실행 (오류발생 or 오류미발생) 
			System.out.println();
		}
	}
	// 오류가 발생할 소지가 있다면 throws Exception을 알려줘야함.
	// throw Exception =메서드를 호출한 곳으로 예외처리를 떠넘기기
	public void method2() throws Exception {
		System.out.println("오류가 발생했습니다.");
		throw new Exception("강제로 예외를 발생시켰습니다.");
	}
}
