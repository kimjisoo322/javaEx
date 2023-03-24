package exam02_정적메서드오류;
//정적 메서드 안에서 인스턴스 필드, 메서드 사용하기
public class ClassName {
	int field;
	
	void method() {
		
	}
	
	static void method1() {
		ClassName a = new ClassName();
		a.field = 10;
		a.method();
		
	}

}
