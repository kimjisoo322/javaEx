package exceptionEx;

import java.io.IOException;

public class B_Throws {
	public static void main(String[] args) {
		B_Throws b = new B_Throws();
		try {
			b.method1();
		} catch (NullPointerException e) {
			System.out.println("null 오류");
		} catch (IOException e) {
			System.out.println("파일입출력 오류");
		} catch (Exception e) {
			System.out.println("오류발생!");
		}
	}
	public void method1() throws IOException, NullPointerException, Exception {
		
		System.out.println("method1() 호출");
		
		//1~3까지 추출
		int num = (int)(Math.random()*3+1);
		if(num==1) {
			throw new Exception();
		}else if(num==2) {
			throw new IOException();
		}else if(num==3) {
			throw new NullPointerException();
		}
	}
/*	public void method2() {
		System.out.println("method1() 호출");
		
		try {
			method1();
		} catch (NullPointerException e) {
			System.out.println("nullpointer 오류가 발생했습니다.");
		} catch (IOException e) {
			System.out.println("파일입출력 오류가 발생했습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
		
		System.out.println("method1() 종료");
	
	}
	*/
	public void method3() {
		
	}

}
