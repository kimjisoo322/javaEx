package com.jungang;

public class Test_03 {

	public static void main(String[] args) {
		//자동타입변환
		//byte byteValue = 10;
		//int intValue = byteValue;
		
		//System.out.println(intValue);
		
		char charValue = 'A';
		int intValue = charValue;
		System.out.println(intValue);

		//long > int
		intValue = 50;
		long longValue = intValue; 
		System.out.println(longValue);
		
		int intValue1 = 44032;
		char charValue1 = (char)intValue1;
		System.out.println(charValue1);
		
		int intValue2;
		double doubleValue = 3.14;
		intValue2 = (int)doubleValue;
		System.out.println(intValue2);
		
		int x = 1;
		int y = 2;
		int result = x + y;
		System.out.println(result);
		
		byte result2 = 10+02;
		System.out.println(result2);
		
		int value = 123; 
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.141519 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n",10, area );
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
		
		
		
		
		
		
	}

}
