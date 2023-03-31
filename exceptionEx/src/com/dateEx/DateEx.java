package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
	//Date 클래스에서 날짜, 시간을 어떻게 처리하는지 
	//기본 생성자를 통해서 Date 객체를 생성하면 
	//현재 시간과 날짜에 대한 정보를 가지고 객체를 생성한다. 
	
	Date now = new Date();
	System.out.println(now.toString());
	
	
	// 1970년 1월 1일 00시 기준으로 밀리 세컨드 단위로 표기.
	// 한국시간(KST)로 출력될 땐  GMT(그리니치평균시) 보다 
	// +9 증가된 시간으로 표시된다.
	Date when = new Date(1);
	System.out.println(when);
	
	when = new Date(1000);
	System.out.println(when);
	
	System.out.println("getTime()" + now.getTime());
	System.out.println("getYear()" + now.getYear() + 1900);
	System.out.println("getMonth()" + now.getMonth() + 1);
	System.out.println("getDate()" + now.getDate() + 1);
	System.out.println("getDay()" + now.getDay() + 1);
	System.out.println("getHours()" + now.getHours() + 1);
	System.out.println("getMinutes()" + now.getMinutes() + 1);
	System.out.println("getSecondes()" + now.getSeconds() + 1);
	
	
	/**
	 * y: 년도
	 * M: 월
	 * d: 일
	 * h: 시
	 * m: 분
	 * s: 초
	 * E: 요일
	 * a: am/pm
	 */
	
	//데이터 포맷 : 날짜를 입력받아서 원하는 형식으로 출력 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss:SSS초");
	String format = sdf.format(now);
	System.out.println(format);
	
	sdf = new SimpleDateFormat("yyyy-MM-dd");
	System.out.println(sdf.format(now));
	sdf = new SimpleDateFormat("hh-mm-ss-a-E");
	System.out.println(sdf.format(now));
	
	}
}
