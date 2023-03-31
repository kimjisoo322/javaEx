package com.classEx;
//Class 클래스
public class ClassEx {
	public static void main(String[] args) {
		
		//객체로부터 직접 생성 
		//Class clazz = Car.class;
		
		Class clazz;
		try {
			// 해당 경로(패키지를 포함한 클래스 이름) 에 
			// 클래스가 존재할 경우 클래스를 반환 
			// 없는 경우 오류발생 
			
			//오류 발생 예제 car2는 없으니까
			//clazz = Class.forName("com.classEx.Car2");

			//라이브러리가 잘 로드되었는지 확인할 때 사용
			clazz = Class.forName("com.classEx.Car");
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			
			//클래스 경로를 활용하여 리소스 절대경로를 얻어오기
			//절대 경로 : 최상위까지 가는 것 
			String path = clazz.getResource("photo1.jpg").getPath();
			System.out.println(path);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 정보를 얻기 실패");
		}
	}
}
