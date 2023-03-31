package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		double heihgt;
		double weight; 
	//키 한번 입력
		while(true) {
			try {
				System.out.println("키를 입력해주세요(m)");
				heihgt = scan.nextDouble();
				break;
				
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "은 입력 불가능!! \n 숫자를 입력해주세요.");
			}
		}
		System.out.println("키 정상출력");
	// 몸무게 한번 입력
		while(true) {
			try {
				System.out.println("몸무게를 입력해주세요(m)");
				weight = scan.nextDouble();
				
				if(weight > 200 || weight <20) {
					System.out.println("몸무게는 20보다 크고 (그리고) 200보다 작은 값을 입력");
					continue;
				}
				break;
				
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "은 입력 불가능!! \n 숫자를 입력해주세요.");
			}
			
		}
		System.out.println("키: " + heihgt);
		System.out.println("몸무게: " + weight);
		
		double bmi = (weight / (heihgt*heihgt));
		System.out.printf("당신의 bmi는 %.2f  ", bmi);
	}	
				
}	

