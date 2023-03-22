package korea.objrct;

public class KoreanMain {

	public static void main(String[] args) {
		//기본생성자 > 초기화 하는 방법
		Korean korean = new Korean();
		korean.name = "권지용";
		korean.ssn = "1988-0818";
		System.out.println("==============기본생성자======");
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		
		
		//매개변수 있는 생성자 호출 >> 값을 받아서 객체 초기화
		Korean info = new Korean("김지수","1999-0322");
		Korean info2 =new Korean("지민","1995-1013");
		
		System.out.println("===============info========");
		System.out.println(info.name);
		System.out.println(info.ssn);
		
		System.out.println("===============info2=======");
		System.out.println(info2.name);
		System.out.println(info2.ssn);
	}

}
