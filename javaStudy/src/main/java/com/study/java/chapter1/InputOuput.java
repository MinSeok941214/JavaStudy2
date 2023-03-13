package com.study.java.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOuput {
	public static void main(String[] args) {
		/*
		 	java는 stream을 통해서 i/o을 실행한다.
		 	
		 	stream : 1. 순서가 있는 byte 열
		 			 2. 단방향 통신, 선입선출(FIFO구조)
		 	
		 	buffer : 1. 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리의 영역
		 	         2. 데이터를 하나씩이 아닌 묶어서 한 번에 전달해 전송 시간의 단축
		 	
		 	< 바이트 단위 입출력을 위한 최상위 입출력 스트림 클래스 >
		 	InputStream / OutputStream	
		 	
		 	< 바이트 단위 입출력을 위한 하위 스트림 클래스 >
		 	FileInputStream / FileOutputStream	
			BufferedInputStream / BufferedOutputStream
			
			< 문자 단위 입출력을 위한 최상위 입출력 스트림 클래스 >
		 	Reader / Writer	 
		 	
		 	< 문자 단위 입출력을 위한 하위 스트림 클래스 >
			FileReader / FileWriter	
			InputStreamReader / OutputStreamWriter
			PrinterWriter
			BufferedReader / BufferedWriter
		 * */
		
		// ex >> 솔직히 잘 모르겠음 ㅋㅋㅋㅋㅋ
		// 오영식 벅휴~
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
