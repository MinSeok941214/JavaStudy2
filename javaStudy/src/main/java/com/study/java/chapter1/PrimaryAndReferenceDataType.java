package com.study.java.chapter1;

public class PrimaryAndReferenceDataType {
	public static void main(String[] args) {
		/*
		 	* 기본 자료형 ( Primary Data Type)
		 		1. 기본 자료형은 종류마다 할당되는 메모리 크기가 플랫폼마다 일정하다.
		 		2. 객체가 아니기 때문에 null을 가질 수 없다.
		 		
		 		boolean : 논리형 , 1bit, true/false
		 		char : 문자형, 2byte, 유니코드, 0~65535
		 		
		 		< 정수형 > 
		 		byte, 1byte, -128 ~ 127
		 		short, 2byte, -32,768 ~ 32,767
		 		int , 4byte, -2,47,438,648 ~ 2,147,438,647
		 		long, 8byte, 어후..    >>>  long에 값을 할당하는 경우엔 리터럴 뒤에 L,l를 추가해야한다.
		 		
	 		 	< 실수형 > 
	 		 	float, 4byte  >>> float에 값을 할당하는 경우엔 리터럴 뒤에 F,f를 추가해야한다.
	 		 	double, 8byte
		 * */
		
		// 자료형 리터럴 뒤에 해당 자료형의 첫글자를 대입하는 이유 
		// 자바는 기본적으로 정수는 항상 int형 타입으로 잡히고 실수는 double형 타입으로 잡힌다.
		// 따라서 ex) long test = 29873212321; 으로 long형에 값을 대입해도 int로 인식해서 에러가 나기 때문에 어떤 변수형인지 명시를 해주어야한다.
		
		//byte와 short는 자바 변환모듈에 의해서 자동으로 형 변환이 된다. >> 형변환 할 필요가 없다.
		
		
		
		/*
		 	* 참조형 ( Reference Type )
		    	1. 기본형 8종류를 제외한 모든 데이터 유형
		    	2. 기본적으로 java.lang.Object를 상속 받는다
		    	3. 데이터를 그대로 저장하지 않고 데이터를 저장하는 메모리의 주소만 저장
		    	4. null을 가질 수 있다.
		    	
		    	String : 
		    		1) 참조형에 속하지만 기본적인 사용은 기본형처럼 사용
		    		2) 불변(immutable) 객체 > 값을 변경해주는 메소드들이 존재하지만, 해당 메소드를 통해 데이터를 변경한다면 새로운 String 클래스 객체를 만들어내는 것
		    	
		    	Wrapper Class, Interface Type, Array, 생성자 등등..
		 * */
	}
}
