package com.jungang;

public class Casting {

	public static void main(String[] args) {
		int iValue = 65;
		char charValue = (char)iValue;
		System.out.println(charValue);
// int > char
		
		long lValue = 500;
		iValue = (int)lValue;
		System.out.println(iValue);
// long > int
		
		float fValue = 3.14f;
		iValue = (int)fValue;
		System.out.println(iValue);
// float > int 
		
		//-128~127
		int intValue = 160;
		byte byteValue = (byte)intValue;
		System.out.println("==========================");
		System.out.println(byteValue); // 값을 초과하면 로테이션 됨. 
		System.out.println(intValue);  
		
		System.out.println("수정");

	}


}
