package com.kh.object.practice;

public class StaticSample {
	//접근제한자 : private이므로 직접 접근이 불가능.
	//이럴 때 get, set 메서드를 통해 접근
	private static String value;
	public static void toUpper() {
		//모두 대문자로 변경
		//대문자로 반환된 값을 value에 저장! 
		value = value.toUpperCase();
	}
	public static void setChar(int index, char c) {
		//전달받은 인덱스 위치의 value값을 전달받은 문자로 변경
		//String 문자열을 char[]로 반환
		//한글자씩 배열의 방에 저장
		char [] charArr = value.toCharArray();
		//배열이름[방번호] = 값; 
		//값을 배열의 방번호에 입력 -> 덮어쓰기 
		charArr[index] = c;
		value = String.valueOf(charArr);
	}
	public static int valueLength() {
		//문자열의 길이
		return value.length();
	}
	public static String valueConcat(String str) {
		//str.concat(str) : 문자열을 연결하여 반환
		//문자열을 연결할 때 사용 >> 기존의 value값은 변경x 
		value = value.concat(str);
		return value;
	}
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		StaticSample.value = value;
	}
}
