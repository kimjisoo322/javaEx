package com.chapter2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {
	/*
	 * 보조 스트림
	 * 		-기반 스트림(Input/OutputStream , Reader/Writer) 과 연결되어
	 *       여러가지 편리한 기능을 제공해주는 스트림을 말함.
	 *      -단독으로 사용x 
	 *      -기반 스트림을 먼저 생성하고 보조 스트림을 연결해줘야 함.
	 *      
	 * 성능 향상 보조 스트림
	 * 		-기반 스트림의 속도를 향상시켜주는 기능
	 * 		-기반 스트림에 대한 레퍼런스가 필요
	 * 		-버퍼라는 공간을 사용해서 속도 향상에 도움
	 * 			(버퍼라는 공간에 데이터를 쌓아놨다가 한번에 입/출력 시킴)
	 *  	-기반 스트림에서 제공하지 않은 메소드(newLine() , readLine() 을 제공.
	 * 
	 * ==== 속도향상의 역할 ** 
	 */

	public static void main(String[] args) {
		BufferedStream bs = new BufferedStream();
		bs.fileSave();
		bs.fileRead();  //읽을때마다 늘어남? 왜? 
	
	
	}
	public void fileRead() {
		try (	
				BufferedReader bw = new BufferedReader(new FileReader("c_buffer.txt"));
				){
			
			String str = "";
			//기반 스트림에서 제공하지 않는 메서드
			//파일에서 한줄을 읽어올 때 사용한다. 
			while((str = bw.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	
	public void fileSave() {
		try (    //true: 이어서 작성 
				 //false : 덮어쓰기 ( 기본값 ) 
				FileWriter fw = new FileWriter("c_buffer.txt", true);
				//보조 스트림 = 내가 만든 writer 기반 스트림을 매개변수로 넣어줌 
				BufferedWriter bw = new BufferedWriter(fw);
				
				//생성과 동시에 넣어주는 방법 
				//	BufferedWriter bw1 = new BufferedWriter(new FileWriter("c_buffer.txt", true));
				
				){
			
			bw.write("안녕하세요~");
			bw.newLine();
			bw.write("네넨선생님!!");
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}
