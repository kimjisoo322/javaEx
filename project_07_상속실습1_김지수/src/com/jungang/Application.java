package com.jungang;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*
		 * 3명의 학생정보를 기록할 수 있게 객체 배열을 할당
		 * 데이터를 참고해 3명의 학생 객체 생성 > 반복문을 통해 출력
		 * 배열선언 : 같은 타입의 데이터를 여러개 보관
		 * 배열선언 : 타입[] 변수명 = new 타입[길이];
		 */
		Student[] sdArr = new Student[3];
		sdArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과" );
		sdArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과" );
		sdArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과" );
		
		System.out.println("=======3명의 학생정보======");
		for(Student input :sdArr) {
			System.out.println(input.information()+ "\n");
		}
		
//========================최대 10명의 사원정보 =================
		//1.최대 10명의 사원 정보를 기록할 객체 배열 생성
		//2.키보드로 사원 정보를 입력받도록 구현 
		
		//employee타입을 담을 수 있는 10개의 방이 생성되고,
		//참조변수의 초기값이 null로 초기화된다. 
		Employee[] em = new Employee[10];
		Scanner scan = new Scanner(System.in);
		
		int index =0;
		
		while(true) {
			//사용자로부터 입력받고 저장하기 위해 변수에 저장. 
			System.out.println("======사원의 정보를 입력해주세요=====");
			System.out.println("이름 :");
			String name = scan.next();
			System.out.println("나이 :");
			int age = scan.nextInt();
			System.out.println("신장 :");
			double height = scan.nextDouble();
			System.out.println("몸무게 :");
			double weight = scan.nextDouble();
			System.out.println("급여 :");
			int salary = scan.nextInt();
			System.out.println("부서 :");
			String dept = scan.next();

			//매개변수 생성자를 이용하여 필드를 초기화 
			Employee emp = new Employee(name, age, height, weight, salary,dept);
			
			//사용자로부터 입력받은 값으로 사원을 생성하고 
			//배열에 입력 
			em[index] = emp;
			//사원이 입력된 후, 다음번 방으로 이동 
			index++;
			
			
			//반복문 탈출 
			System.out.println("종료하시려면 n을 입력해주세요: ");
			String user = scan.next();
			
			if(user.equals("n") || index == 10) {
				break;
			}
			
		}
		
		for(Employee e :em) {
			//null 체크 
			//배열이 초기화 될 때 null값으로 초기화 
			//오류 > e. 주소로 접근!! 
		
			if(e == null) {
				break;
			}
			System.out.println(e.information());
		}
		
		}
		
	}

