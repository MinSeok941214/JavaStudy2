package com.study.java.chapter1;

public class ControlStatementAndFor {
	public static void main (String[] args) {
		/*
		 	*  제어문
		 		: 프로그램의 순차적인 실행 순서를 변경시키는 문법
		 		  조건문, 반복문, 분기문으로 이루어져있다.
		 * */
		
		///////////////////////////////////////////////////
		// 					조건문						 //
		///////////////////////////////////////////////////
		
		/* 1) if문 
		 : 연속적인 값의 비교를 하기에 적합하다.
		 * */
		boolean setYn = false;
		if(setYn) {
			// 참일 때 들어옴
		} else {
			// 거짓일 때 들어옴
		}
		
		/* 2) switch문 
		 	: if문과 다르게 조건식이 변수의 값에 따라 변한다.
		 * */
		int i = 0;
		
		switch(i) {
			case 0 :
				//System.out.println("0입니다.");
				break;
			case 1 : 
				//System.out.println("1입니다.");
				break;
			default :
				//System.out.println("일치하는 값이 없을 경우 default로 들어옵니다.");
		}
		
		///////////////////////////////////////////////////
		// 					반복문						 //
		///////////////////////////////////////////////////
		
		/*
		 	1) for문 : 초기제어식, 증감제어식, 종결제어식을 사용하여 반복문을 실행한다.
		 	for(초기제어식; 종결제어식; 증감제어식;) {
		 		실행문;
		 	}
		 * */
		for(int j = 0; j < 5; j++) {
			//System.out.println(j);
		}
		
		/*
		 	2) while문 : 괄호안에 조건식만 표현한다. 
		 	while (조건식) {
		 	 실행문;
		 	}
		 * */
		int whileVar = 0;
		while(whileVar < 5) {
			//System.out.println("5보다 작을 때 까지 반목문을 실행합니다. 현재값 :: " + whileVar);
			whileVar++;
		}
		
		/*
		 	3) do-while문 : 앞선 while문처럼 조건식을 우선 수행하고 실행문을 하는것이 아니고 
		 				   실행문을 먼저 실행하고 조건식을 실행한다.
		 				   >>> 실행문을 먼저 실행하므로 최소 1번은 무적권 실행된다. 
		 	   do {
		 	   	실행문;
		 	   }while(조건식);
		 * */
		
		
		int mutiyF = 1;
		do {
			int mutiyB = 1;
			
			do {
				//System.out.println(mutiyF + " x " + mutiyB + " = " + (mutiyF * mutiyB));
				mutiyB++;
			} while(mutiyB <= 9);
			mutiyF++;
			mutiyB = 1;
		} while(mutiyF <= 9);
		
		///////////////////////////////////////////////////
		// 					분기문						 //
		///////////////////////////////////////////////////
		
		/*
		 	1) break문 : 반복문 실행 중 반복문을 종료시키는 명령문
		 	   >> 중첩문인 경우 가장 가까운 반복문을 빠져나간다.
		 	   >> 반복문에 label을 설정해주고 break label시 해당 for문을 종료시킨다.
		 	2) continue문 : 반목문 실행 중 해당 차수를 건너뛰고 다음 반복문을 실행시키는 명령문
		 * */
		
		minseok : for(int k = 0; k < 5; k++) {
			System.out.println("k = " + k);
			for(int l = 0; l < 5; l++) {
				if(l == 2) break minseok;
				if(l == 3) break;
				System.out.println("l = " + l);
			}
		}
		
		for(int a = 0; a < 2; a++) {
			//System.out.println("a = " + a);
			label : for(int b = 0; b < 5; b++) {
						//System.out.println("b = " + b);
						for(int c = 0; c < 2; c++) {
							if(b == 1) break label; 
							//System.out.println("c = " + c);
						}
			}
		}
	}
}
