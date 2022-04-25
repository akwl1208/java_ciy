package day1;

public class Ex2_variable {

	public static void main(String[] args) {
		/*
		* 변수를 선언 방법
		타임 변수명;
		*변수 초기화 방법1: 변수 선언 및 초기화를 같이 하는 방법
		타임 변수명 = 초기값;
		* 변수 초기화 방법2: 변수 선언 후 초기화
		타임 변수명;
		변수명 = 초기값;
		*/
		
		//예제) 초기화 방법 1
		byte num1 = 1; //십진수 1을 저장 
		short num2 = 020; //20(8) = 16(10)
		int num3 = 0x2F; //2F(16) = 47(10)
		long num4 = 10L; //10(10) = long 자료형은 뒤에 L이나 l(소문자)을 붙여야함
		
		//선언한 변수값이 맞는지 반환해서 확인해보기
		System.out.println("십진수 1: "+ num1);
		System.out.println("8진수 20: "+ num2);
		System.out.println("16진수 2F: "+ num3);
		
		//문자는 한글자를 의미, '1'은 있음, '11'은 없음
		//문자열은 0글자 이상 의미, ""로 감싼다.
		char ch = 'a'; //문자 a를 저장
		
		float num5 = 1.23f; //실수 1.23을 저장, float형이면 뒤에 f나 F를 붙여야 함
		double num6 = 3.14; //3.14 저장
		
		boolean isTrue = true; //참을 저장
		
		
		/* 예제) 변수명 에러 
		1. int num1; //중복선언으로 인해 에러 발생
		2. int 1num; //첫문자가 숫자이어서 에러 발생
		3. int int; //변수명이 예약어 사용하여 에러 발생
		4. int $num7; //오류 아님
		5. int %num8; //_ 또는 $가 아니기 때문에 에러 발생 
		 */


	}

}
