package com.StringEx;

/**
 * String 클래스
 * indexOf() :매개값의 문자열의 포함 여부를 확인
 * substring() : 원하는 문자열 추출 / 문자열 잘라내기 
 * length() : 문자열의 길이 
 * replace() : 문자 교체 
 * toLowerCase() : 소문자로 변경
 * toUpperCase() : 대문자로 변경 
 * equalsIgnoreCase( ) : 대소문자를 구분하지 않고 문자열 비교 
 * trim() : 공백 제거
 * valueOf() :기본타입을 문자로 변경
 //static 메서드라서 생성없이 바로 사용 가능
 */

//문자열 찾기 indexOf()
// 매개값의 문자열의 포함 여부를 확인
// 포함 : 시작인덱스값을 반환 
// 불포함 : -1 반환
public class StringEx2 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		str.indexOf("프로");
		
		System.out.println(str.indexOf("자바"));
		System.out.println("+" +str.indexOf("얍"));
		
		//substring과 함께 사용될 수 있다. 
		System.out.println(str.substring(str.indexOf("프로")));
		
		if(str.indexOf("자바") > 0) {
			System.out.println("자바 관련 책! ");
		}else {
			System.out.println("관련 없음");
		}
		
		//문자열의 길이 
		//id의 길이는 5자 이상이어야 합니다.
		String id = "id";
		
		if(id.length()<5){
			System.out.println("아이디는 5자 이상 14자 이하로 작성 가능합니다.");
		}
		
		String ssn = "9903222876391";
		if(ssn.length() != 14) {
			System.out.println("주민등록번호를 정확히 입력해주세요.");
		}
		
		//원하는 문자열을 추출
		ssn.subSequence(0, 5);
		System.out.println("=============원하는 주민번호 =============");
		System.out.println(ssn.substring(6));
		System.out.println("추가"+ssn.subSequence(0, 5));
		
		//문자 교체
		str = "자바는 객체지향 언어입니다. 자바를 자바봅시다.";
		System.out.println(str.replace("자바", "java"));
		
		
		//대소문자 교체 
		str = "java LANGUAGE";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		str = "q";
		str.equalsIgnoreCase("Q");
		System.out.println(str.equalsIgnoreCase("q"));
		System.out.println(str.equalsIgnoreCase("Q"));
		
		//공백을 제거하기 
		id = "      go!    ";
		System.out.println(id);
		System.out.println(id.trim());
	
		
		//기본타입을 문자로 변경
		//static 메서드라서 생성없이 바로 사용 가능
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(10.5));
		
		
		
		
		
	}
}
