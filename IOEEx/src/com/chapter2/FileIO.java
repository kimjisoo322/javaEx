package com.chapter2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//read와 write를 합치는 방법 (입력-출력)
//자바 파일을 읽어서 새로운 파일을 생성한다. 
public class FileIO {
	public static void main(String[] args) {
		FileIO fileio = new FileIO();
	//	fileio.fileIoCopy();
		fileio.fileCopy();
	//	fileio.filecopy2();
	}
	
	/**
	 * <<<<파일 복사하기>>>>
	 * a_byte.dat 파일을 읽어서 파일을 생성한다.
	 */
	public void fileIoCopy() {
		long stratTime, endTime; 
		stratTime = System.currentTimeMillis();
		
		
		File file = new File("D:\\workspace\\IOEEx\\a_byte.dat");
		file.exists();
		
		//파일의 존재 여부를 확인 후 존재하지 않으면 종료 >
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		//오류가 발생할 수 있는 코드 > 예외처리
		//try문 안에 오류 코드 작성
		//+) try 문에 여러개 가능 문장이 끝나면 세미콜론;
		//+) 입력과 출력을 동시에 try문에 작성한다. 먼저 입력으로 file을 가져오고 출력으로 A_File_copy.java 파일 생성
		try (FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")){
			
			//1byte씩 읽어옴
		//	fis.read();
			
			int value = 0;
			while((value = fis.read()) != -1){
			//	System.out.print((char)value);
				fos.write(value);
			}
			//출력 버퍼에 잔류하는 모든 바이트 출력하기 
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " +(endTime - stratTime));
	}
	
	
	public void fileCopy() {
		
		long startTime1, endTime1;
		startTime1 = System.currentTimeMillis();
		
		//파일 복사하기 
		File file = new File("D:\\workspace\\IOEEx\\answer.pdf");
		file.exists();
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		//파일 가져오기 
		//파일 출력하기 
		try (FileInputStream fis1 = new FileInputStream(file);
				FileOutputStream fos1 = new FileOutputStream("answer_copy.pdf")){
			
			//fis1.read();
			
			int value = 0;
			/*
			while((value = fis1.read()) != -1){
				System.out.print((char) value);
				fos1.write(value);
			}
			*/
			// i = 바이트 배열에 읽어온 갯수를 반환합니다. 
			int i = 0;
			byte[] byteArr = new byte[1000];
			while((i = fis1.read(byteArr)) != -1){
				//System.out.print((char) value);
				//읽어온 갯수만큼 출력합니다. 
				//마지막 출력시 배열의 갯수를 다 채우지 못하면 이전에 읽어들인 내용이 출력됨. 
				
				fos1.write(byteArr,0,i);
			}
			fos1.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		endTime1 = System.currentTimeMillis();
		
		System.out.println("소요시간2 : " + (endTime1 - startTime1) );
	}
	
	
	
	public void filecopy2() {
		try (
				FileInputStream fis = new FileInputStream("D:\\workspace\\IOEEx\\13_1_컬렉션프레임워크.pptx");
				FileOutputStream fos = new FileOutputStream("컬렉션프레임워크_copy.pptx");
				) {
			
			int value = 0;
			while( (value = fis.read()) != -1) {
				fos.write(value);
			}
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	//	try {
	//	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		}
	}
	
	
	
	
