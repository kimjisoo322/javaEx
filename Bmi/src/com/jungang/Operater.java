package com.jungang;

public class Operater {

	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue1 = 20;
		
		//byte, short, char 타입은 연산시에
		//int 타입으로 변환되어서 연산됨
		//=> 그 결과 int 타입이 반환됨
		//byte byteValue2 = byteValue + byteValue1; 
		int intValue2 = byteValue + byteValue1; 
		//byte byteValue2 = (byte)(byteValue + byteValue1);
		int byteValue2 = byteValue1 + byteValue1;
		System.out.println(intValue2);
		System.out.println(byteValue2);
		
		int iValue = 10; 
		double dValue = 5.5;
		double result = iValue + dValue; 
		System.out.println(result);
		System.out.println("==========");
		System.out.println((double)iValue);
		System.out.println(5/2);
		System.out.println((double)5/2); // 5.0 / 2를 해서 2.5
		System.out.println(5/(double)2); // 5 / 2.0을 해서 2.5 
		System.out.println((double)(5/2)); //연산된 결과에 double을 붙여서 2 - > 2.0 
		
		// =============문자열을 기본 타입으로 강제 타입 변환하는 방법
		String str = "10";
		// parseInt(string s) : int 
		// string 타입의 매개변수를 넣고 실행결과 int 타입을 반환 받는다. 
		int i = Integer.parseInt(str);
		System.out.println("=========문자열 강제 타입 변환===========");
		System.out.println(i);
		
		String str1 = "10";
		byte value = Byte.parseByte(str1);
		System.out.println(value);
		
		str1 = "400000";
		long lValue= Long.parseLong(str1);
		System.out.println(lValue);
		
		String str3 = "true";
		boolean bValue = Boolean.parseBoolean(str3);
		System.out.println(bValue);
		
		String str4 = "99.0322";
		float fValue = Float.parseFloat(str4);
		System.out.println(fValue);
		
		String str5 = "99.0322";
		double dValue1 = Double.parseDouble(str5);
		System.out.println(dValue1);
		
		int x = 1;
		int y = 2;
		double result4 = (double)x / y;
		System.out.println(result4);
		
		System.out.println("=========문자열 강제 타입 변환===========");
		String strValue = String.valueOf(123);
		System.out.println(String.valueOf(123));

		String.valueOf(123.11);
		String.valueOf(true);
		
		
		
		
		
		
		
	}

}
