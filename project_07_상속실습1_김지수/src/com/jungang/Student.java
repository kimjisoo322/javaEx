package com.jungang;

public class Student extends Person {
	//필드
	private int grade;
	private String major;
	
	//생성자
	public Student() {
		
	}
	//초기화: 생성자의 매개변수를 필드에 입력합니다
	public Student(String name, int age, double height, double weight, int grade, String major) {
		//부모의 생성자를 호출합니다. 
		super(age, height, weight);  //private으로 막혀서 부모생성자를 통해 초기화
		super.name = name;    // 부모 필드값에 직접 접근해서 초기화 
		this.grade = grade;
		this.major = major;
	}

	//메서드
	public String information() {
		return super.information() + " " + getGrade() + " " + getMajor();
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	
}
