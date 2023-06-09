package com.chapter1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamEx {
	public static void main(String[] args) {
		FileByteStreamEx ex = new FileByteStreamEx();
		ex.fileSave();
		ex.fileRead();
	}
	
	public void fileRead() {
		//입력
		FileInputStream fis = null;
		
	
	try {
		//InputStream을 열고 ( 파일 이름) 
		fis = new FileInputStream("a_byte.dat");
		
		/*
		 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용하면 된다.
		 * 하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다.
		 * read()메소드는 더이상 읽어올 데이터가 없으면 -1 리턴
		 * 따라서 반복문을 사용해서 read()메소드에서 -1이 리턴되기 전까지 데이터를 읽어오면 됨.
		 * 
		 */
		int value = 0;
		
//		while(true) {
//			value = fis.read();
//			if(value == -1) {
//				break;
//			}
//			System.out.print((char)value);
//		}
//>> 위의 while문은 우리가 평소 하던 방식 		
		
		//데이터를 읽어서 value 변수에 저장
		// -1 : 문장의 끝 
			while((value = fis.read()) != -1 ) {
				System.out.print((char)value);
			}
		
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	} catch (IOException e) {
		System.out.println(e.getMessage());
	} finally {
		try {
			fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
	
	public void fileSave() {
		//출력
		FileOutputStream fos = null;
		System.out.println("파일 저장 실행");

		// 소문자 a 저장
		try {
			//프로젝트 내부에 파일이 생성
			fos = new FileOutputStream("a_byte.dat");
			fos.write(97); // a저장
			fos.write('b');// b저장
			fos.write(10); // 줄바꿈
			fos.write('c');
			fos.write('한');
			
			byte[] byteArr = {'a','b','c','d'};
			fos.write(byteArr);
			fos.write(10);
			//wirte(배열, 시작인덱스, 개수)
			fos.write(byteArr, 1, 2);
			
			//파일 저장 
			fos.flush();
			
			//자원 해제
//			fos.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			//사용중인 자원이 있다면 종료시켜준다. 
			if(fos != null) {
				try {
					//스트림을 이용했으면 닫아줘야 한다. 자원 해제! 
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
