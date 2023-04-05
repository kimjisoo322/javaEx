package com.chapter1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCharStreamEx {
	public static void main(String[] args) {
		FileCharStreamEx fcs = new FileCharStreamEx();
		fcs.fileSave();
		fcs.fileRead();
	}
	// 파일을 만든거 출력(읽는) 부분 1. FileReader > fr.read > 반복문 이용
	// read()메소드는 더이상 읽어올 데이터가 없으면 -1 리턴
	// * 따라서 반복문을 사용해서 read()메소드에서 -1이 리턴되기 전까지 데이터를 읽어오면 됨.
	public void fileRead() {  
		try(FileReader fr = new FileReader("b_char.txt")) {
			int value = 0;
			//문서 한글자씩 출력
	//		System.out.println((char)fr.read());
			
			//문서를 끝까지 출력
			while((value = fr.read()) != -1){
				System.out.print((char)value);
			}
	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	// 파일을 만들어서 입력하는 부분 1. FileWriter > fw.write > fw.flush() 
	public void fileSave() {
		//새로운 try-catch문
		//리소스를 자동으로 close()  

		//FileWriter를 이용해서 파일을 생성하고 데이터를 문자단위로 저장.
		try(FileWriter fw = new FileWriter("b_char.txt")) {
			fw.write("얏호");
			fw.write("IO 어떠신가요?! \n");
			fw.write("혼자서도 잘할 수 있습니다. \n");
			fw.write('A');
			fw.write('\n');
			fw.write(new char[]{'a','b','c','d'});
			
			fw.flush();
			
			
		} catch (Exception e) {
			
		}finally {
			System.out.println("fileSave() 종료");
		}
	}
}
