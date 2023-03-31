package com.systemEx;

public class SystemEx {
	
	public static void main(String[] args) throws InterruptedException {
		//수행시간 구하기
		//1/10000초를 구한다. 
		//초로 환산해주기 위해서 100으로 나눠줌! 
		Long startTime = System.currentTimeMillis();
		int sum =0;
		
		for(int i=0; i<5; i++) {
			sum += i;
			
			if(i == 4) {
				// JVM 강제 종료 
				System.out.println("정상종료");
				System.exit(0);
			}
			
			
			//1초 대기 (sleep 오류발생 > throws로 예외넘기기) 
			//0~5까지 더해주는데 1초씩 기다려줌. 
			Thread.sleep(1000);
		}
		System.out.println("총 합계는 : " + sum);
		
		Long endTime = System.currentTimeMillis();
		
		long result = (endTime - startTime)/1000;
		System.out.println(result + "초 소요되었습니다.");
		
	}
	

}
