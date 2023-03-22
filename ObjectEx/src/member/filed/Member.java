package member.filed;

public class Member {
	String name = "이름";
	String id = "아이디";
	String password = "패스워드";
	int age;
	
	//public void ageUp() {
	//	age += 10;
	//}
	
	public int ageUp() {
		return age += 10;
	}

}
