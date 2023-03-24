package getter.setter;

import java.util.Calendar;

public class Person {
	
	static final double PI = 3.141519;
	static final double EARTH_RADIUS = 6400;
	
	//final (상수): 한번 값이 정해지고 나면 수정이 불가능
	final String nation = "Korea";
	final String ssn;
	String name;
	
	//생성자에서 초기화 해주기 
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
		//this.ssn = "990322-12345";
		//this.name = "김지수";
	}

	
	public static void main(String[] args) {
		Person p = new Person("990322-12345", "김지수");
		
		
		//p.nation = "한국";
		System.out.println(p.nation);
		System.out.println(p.ssn);
		p.name = "박지민";
		System.out.println(p.name);
		
		//staic으로 상수를 선언했기 때문에 객체 생성 안하고 바로 사용 가능
		System.out.println("파이값 : " + Person.PI);
		System.out.println("지구반지름 : " + Person.EARTH_RADIUS);
		
		
		
		Calendar cal = Calendar.getInstance();
		//int day =cal.get(Calendar.DATE);
		int day1 = cal.get(5);
		
		System.out.println(cal.get(Calendar.YEAR)+ "년");
		System.out.println(day1 + "일");
		System.out.println((Calendar.HOUR_OF_DAY) + "시");
		System.out.println((Calendar.MINUTE) + "분");
		System.out.println((Calendar.SECOND) + "초");
		
		long before = System.currentTimeMillis();
		System.out.println("실행전 : "+ before);
		long after = System.currentTimeMillis();
		System.out.println("실행후 : "+after);
		
		long result = before - after;
		System.out.println("속도보자" + result);
	}
}


