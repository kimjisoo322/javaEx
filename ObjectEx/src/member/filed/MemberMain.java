package member.filed;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		
		System.out.println(member.name);
		member.name = "최하얀";
		System.out.println(member.name);
		
		member.age = 23;
		System.out.println(member.age);
		
		member.ageUp();
		System.out.println(member.age);
	}

}
