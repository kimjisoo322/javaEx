package com.StringEx;

//문자추출 CharAt()
public class StringEx1 {
	public static void main(String[] args) {
		//7번째 인덱스 문자를 체크해서
		//1,3 : 남자
		//2,4 : 여자 
		String ssn = "123456-2345645";
		
		//해당 인덱스의 문자열을 char타입으로 반환 ' '
		char personNum = ssn.charAt(7);
		
		if(personNum == '1' || personNum =='3') {
			System.out.println("남자");
		}else if(personNum == '2' || personNum =='4'){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 값!");
		}
		
		//System.out.println(personNum);
	}
}
