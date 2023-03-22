package com.jungang;

public class NullPointerException {

	public static void main(String[] args) {
		//name 초기값으로 null 입력
		//참조변수가 아무런 객체도 참조하고 있지 않다.
		//. : 주소 접근자, 객체 접근 연산자 >> 참조 변수로 접근해서 객체가 가진 필드나 메서드를 사용하겠다 
		//.이후 객체가 가지고 있는 접근가능한 필드, 메서드 목록을 보여준다.
		//필드(속성), 메서드
		//변수이름.필드명;
		//변수이름.메서드명(매개변수);
		String name = null;
		name = "안녕";
		//.length(): 문자열의 총 길이를 반환 
	    //System.out.println("총 문자수:"+ name.length());
		
		//nullPointerException 해결방안 
	    // 해결방안: 참조변수가 null인 경우 실행되지 않도록 처리한다.
		if(name != null) {
			System.out.println("총 문자수: " + name.length());
		}
		
		System.out.println("정상종료되었습니다.");
		
		
	}

}
