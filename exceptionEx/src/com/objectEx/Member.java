package com.objectEx;

public class Member {
	public static void main(String[] args) {
		
		
		Member mem1 = new Member("id");
		mem1.hashCode();
		
		System.out.println("****************************");
		 
		/**
		 *hashCode()
		 *
		 * 객체를 식별하는 하나의 정수값
		 * Object 클래스의 객체 '해시코드 메소드'는 
		 * 객체 메모리 번지를 이용하여 해시코드를 만들어 리턴한다.
		 * ===> 객체마다 다른 값을 가진다.
		 * 
		 * 두 객체가 동등한지 비교하는데 사용된다! 
		 */
		Object obj = new Object();
		obj.equals(obj);
		
		System.out.println("해쉬코드 : " + mem1.hashCode() );
		
		//숫자를 16진수로 변환 
		String str = Integer.toHexString(mem1.hashCode());
		str.equals(str);
		System.out.println("hashCode 16진수로 변환 : " + str);

		System.out.println("toString : " + mem1.toString());
		System.out.println("****************************");
		
		Member mem2 = new Member("id");
		//두 객체를 비교한다. 
		System.out.println(mem1.equals(mem2));
		
	}
	private static String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	@Override
	/**
	 * this(Member객체)가 가지고 있는 id값과
	 * 매개변수로 받은 Object의 id값이 일치하는지 비교 
	 * 
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			System.out.println("obj.equls : " + super.equals(obj));
			System.out.println("memeber.equals : " + getId().equals(member.id) );
		}
		// 객체가 가지고 있는 id의 값이 같다면 true로 리턴, 아니면 false
		if( getId().equals(Member.id)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
}
