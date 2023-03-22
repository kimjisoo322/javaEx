package korea.objrct;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	//기본 생성자
	//안에 데이터가 없기때문에 초기화가 안된 상태
	public Korean() {
		
	}
	
	//매개변수 있는 생성자
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
