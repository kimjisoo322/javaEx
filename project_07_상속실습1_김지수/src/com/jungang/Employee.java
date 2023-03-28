package com.jungang;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
		
	}

	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight); //private으로 막혀서 부모생성자를 통해 초기화
		super.name = name;   // 부모 필드값에 직접 접근해서 초기화 
		this.salary = salary;
		this.dept = dept;
	}


	public String information() {
		//부모메서드 호출결과 
		return super.information() + " " + getSalary()
		          + " " + getDept(); 
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}

	
	
	
}
