package com.jungang;

public class Literal {

	public static void main(String[] args) {
		int i = 0b1011; //2진수
		int j = 013;    //8진수
		int k = 0x83;   //16진수
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		byte var1 = -1;
		int var2 = (byte)128; //허용범위를 벗어나면 오류남.
		byte var3 = 0;
		byte var4 = 1;
		byte var5 = 30;
		byte var6 = -30;
		
		//byte 값의 허용범위 : -128~127
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		
		
		
		
	}

}
