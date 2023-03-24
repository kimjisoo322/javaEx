package getter.setter;

public class SingletonEx {
	
	private static SingletonEx singleton = new SingletonEx();
	
	
//	1. 생성자를 private 접근제한자 이용해 외부에서 이용하지 못하게 함. 
//  하나 만들어놓고 어디에서든 공통적으로 쓰고싶을 때!
	private SingletonEx() {
		
	}
	
//	2. 외부에서 접근할 수 있는 메서드를 만들고 생성된 객체를 반환한다.
//	   -생성을 할 수 없으므로 정적 메서드로 만들기
//	   -정적필드에 자신을 생성하여 리턴해주기
	public static SingletonEx getInstance(){
		return singleton;
	}
	
}
