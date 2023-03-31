package com.mathEx;

/**
 * Math 클래스 
 * Math.abs() : 절대값 반환
 * Math.floor() : 버림값 (소수점처리)
 * Math.ceil() : 올림값 
 * Math.round() : 반올림값
 * Math.max() : 최대값
 * Math.min() : 최소값
 * 
 */


public class MathEx {
	public static void main(String[] args) {
		//절대값
		int i = Math.abs(-5);
		double d = Math.abs(-5.123);
		System.out.println("절대값: " + i);
		System.out.println("절대값: " + d);
		
		//버림값(소수점처리)
		System.out.println("버림: " +Math.floor(d));
		
		//올림값
		System.out.println("올림: " +Math.ceil(d));
		
		//반올림 
		System.out.println("반올림: " + Math.round(d));
		
		Math.max(5.3, 2.5);
		System.out.println("최대값은 : " + Math.max(5.3, 2.5));
		System.out.println("최소값은 : " + Math.min(100, 300));
		
		
		
		
	}
}
