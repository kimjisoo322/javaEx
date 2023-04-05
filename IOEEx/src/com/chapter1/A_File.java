package com.chapter1;

import java.io.File;
import java.io.IOException;

public class A_File {
	public static void main(String[] args) {
		//객체 생성
		A_File af = new A_File();
		// 객체변수에 주소접근연산자(.)를 이용해서 실행
	//	af.method1();
		af.method2();
		
	}
	public void method2() {
		//파일, 폴더 모두 File로 생성
		File file = new File("d:/test/test.txt");
		File dir = new File("d:/test/");
		//파일 입출력 때문에 IOE예외 생김
		try {
			//디렉토리(폴더) 만들기 (1개)
			dir.mkdir();
			//디렉토리(폴더) 만들기 (여러개)
			//dir.mkdirs();
			
			//파일생성
			file.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public void method1() {
		//경로를 지정하지 않으면 현재 프로젝트 폴더에 파일을 생성한다.
		//메모리상에만 존재
		File file = new File("test.txt");
		System.out.println("파일명 : " + file.getName());
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		System.out.println("상대 경로 : " + file.getPath());
		System.out.println("파일 용량 : " + file.length());
		System.out.println("파일존재여부 : "+ file.exists());
		
		//실제 파일 생성
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("파일존재여부 : "+ file.exists());
	}
}
