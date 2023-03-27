package sec01.exam02;

public class StudentExample {

	public StudentExample(){
		
	}
	public static void main(String[] args) {
		Student s = new Student("김지수", "990322", 10);
		System.out.printf("이름 : %s, 생일 : %s, 번호 : %d \n", s.name ,s.ssn , s.studentNo);
		
		System.out.println("toString()-----------------------");
		System.out.println(s.toString());
	
	}
	@Override 
	public String toString() {
		return super.toString();
	}
	

}
