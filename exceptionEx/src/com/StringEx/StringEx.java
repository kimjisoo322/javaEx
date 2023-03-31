package com.StringEx;

import java.io.UnsupportedEncodingException;
//바이트 배열을 문자로 변환
public class StringEx {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//메서드 이름은 같은데 타입이 다다다다달라 = 오버로딩 
		
		//str이 가지고 있는 값을 byte[]로 반환
		String str  = "hello";
		str.getBytes();
	
		byte[] byteArr = str.getBytes();
		byte[] byteArr2 = {67,68,69};

		//byte[]을 String 문자열로 변환
		//시작인덱스, 개수 
		String str1 = new String(byteArr,1,4);
		String str2 = new String(byteArr);
		String str3 = new String(byteArr2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//실습파일 열었을때 문자가 깨졌던 현상
		//문자코드가 일치하지 않는 경우 깨질 수 있음. 
		// euc-kr , ms949 >  한글 표현시 2바이트 사용
		// utf-8          >  한글 표현시 3바이트 사용
		String strK = "반갑습니다. 오늘도 힘내세요! ! !";
		byte[] b= strK.getBytes("euc-kr");
		String s_euckr = new String(b, "euc-kr");
		String s = new String(b);
		
		System.out.println(s_euckr);
		System.out.println(s);
		
	}

}
