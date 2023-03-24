package package2;

public class C {
	
	//외부에서 생성자 접근제한
	private C() {
	}
	
	
	public C(int i) {
		this();
	}
	
	
	public void method1() {
		System.out.println("이건 public");
	//	method2();
	}
	
	private void method2() {
		System.out.println("이건 private");
	}
	
}
