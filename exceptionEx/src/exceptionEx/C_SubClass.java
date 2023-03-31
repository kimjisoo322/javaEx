package exceptionEx;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C_SubClass extends C_SuperClass{
	
	
//	@Override
	//부모클래스의 메서드보다 상위타입의 예외를 발생시키는 것은 불가능 
//	public void method() throws IOException{
	//	super.method();
	//}
	
	@Override
	//오버라이딩시 예외를 작성하지 않아도 된다. (부모메서드는 예외를 던지고 있지만, 나는 던지지 않아도 됨!) 
	// 하지만 예외를 던지게 될 때 부모보다 더 상위타입만 x 
//	public void method(){
//		super.method();
//	}
	
	
	//부모 클래스의 메소드보다 하위타입의 예외를 발생시킬 수 있다. 
	public void method() throws FileNotFoundException{
//		super.method();
	}
}
