package com.jungang;

public class PrintfEx {

	public static void main(String[] args) {
		String name = "김지수";
		int age = 25;
		String id = "qqq8128";
		double height =1.6;
		int money = 10000000;
		
		System.out.println(money);
		System.out.printf("%,d\n",money);
		
		//형식문자열
		//System.out.println("이름:" + name + " 나이:" + age + " 아이디:" + id);
		//형식문자열
		//지정한 형식 문자열에 맞게 값 또는 변수를 대입할 수 있다. 
		//%s: 문자열, %d: 정수, %f:실수 
		System.out.printf("이름: %s 나이: %d 아이디: %s 키: %f\n", 
				                                          "김지수", 25, "qqq8128", 1.6);
		
		System.out.printf("이름: %5s 나이: %d 아이디: %s 키: %f\n", 
				                                          "김지수", 25, "qqq8128", 1.6);
		System.out.printf("이름: %-5s 나이: %d 아이디: %s 키: %f\n", 
				                                          "김지수", 25, "qqq8128", 1.6);
		System.out.printf("이름: %s 나이: %05d 아이디: %s 키: %f\n", 
				                                          "김지수", 25, "qqq8128", 1.6);
		
		System.out.println("==================실수자릿수===================");
		System.out.printf("이름: %5s 나이: %d 아이디: %s 키: %10.4f\n", 
															"김지수", 25, "qqq8128", 1.6);
		System.out.printf("이름: %-5s 나이: %d 아이디: %s 키: %-5.4f\n", 
                											"김지수", 25, "qqq8128", 1.6);
		System.out.printf("이름: %s 나이: %05d 아이디: %s 키: %08.7f\n", 
                											"김지수", 25, "qqq8128", 1.6);
		
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		// 결과는 정수 = var1을 정수형 변환, var2 + 3 더하면 4.3 int형 하면 소수날라감, 
		// 소수문자열 기본타입변환 함수 Double.parsDouble로 변환하면 3.9 숫자이고 여기서 int 정수변환해서 소수날리기
		int result = (int)var1 + (int)(var2+var3)+ (int)Double.parseDouble(var4);
		System.out.println(result);
		
		
		
		
		
		
	}

}
