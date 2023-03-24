package static_practice;

public class ClassName {
	//인스턴스 필드
	int field;
	
	//인스턴스 메서드
	void method1() {
		
	}
	
	//정적 필드
	static int field2;
	
	//정적 메서드 안에서 인스턴스 필드 사용하려면 main처럼 똑같이 객체 생성
	static void method2() {
		ClassName use=new ClassName();
		use.field = 10;
		use.method1();
		field2 = 10;
	}
}
