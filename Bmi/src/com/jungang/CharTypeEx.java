package com.jungang;

public class CharTypeEx {

	public static void main(String[] args) {
		
		char var1 = 'A';
		char var2 = '밥';
		
		char var3 = 65;    //10진수
		char var4 = 0x041; //16진수
		
		String var5 = "문자열";
		System.out.println("===========string타입실습===========");
		System.out.println(var5);
		
		//타입 변환( ) 변수앞 괄호앞에 타입을 넣어줍니다. >> 형변환 
		System.out.println("char타입실습 ========================");
		System.out.println((int)var1);
		System.out.println(var2);
		
		System.out.println(var3);
		System.out.println(var4);
		
		
		System.out.println("\"");
		System.out.println("나는오늘\n\'순대국\'이 먹고싶다.\n \\\\");
		
		
		//정수에 리터럴이 입력되면 int로 받아들이기 때문에
		//long 타입의 경우 뒤에 l을 입력 
		//즉, 처음에 정수는 int로 받게 됨 그런데 범위를 넘어서게 될 경우 오류 생김
		//그래서 난 long 타입으로 할거야 라고 명시적형반환 필요 
		// int의 범위를 벗어나지 않으면 자동형변환
		// int의 범위를 벗어나면 명시적형변환 ex) long은 l붙이기.
		long var6 = 12345678293940594L;
		
		
		//실수 타입 float < double / float 타입 뒤에는 무조건 f 붙이기  
		float var7 = 0.12345678596452123665487f;
		double var8 = 0.1234567825545842657569;
		
		float var9 = 5e-3f;
		System.out.println("=============실수출력=============");
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
		boolean var10 = true;
		boolean var11 = false;
		//참, 거짓을 판단 
		//문자열과 다름! true <=> "true"
		if(true) {
			System.out.println("true");
		}
		if(false) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String var = "나의 직업은 \"개발자\" 입니다.";
		System.out.println(var);
		
		int le2 = 0;
		int v2 = le2;
		
		System.out.println("자바는");
		System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
		System.out.println("입니다.");
		
		
		
		
		
		
	}

}
