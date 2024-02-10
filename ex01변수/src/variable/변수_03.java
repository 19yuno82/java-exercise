package variable;

import java.util.Scanner;

public class 변수_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자로부터 숫자를 입력받아 2로 나눈 값을 출력
		//1단계: 소수점X
		//1.5단계: 나눌 숫자도 입력받기
		//2단계: 소수점O
		
		//문제풀이
		//Scanner 생성
		Scanner scan = new Scanner(System.in);
		//입력받은 숫자을 저장할 변수 생성
		int num1;
		//1.5단계에 쓰일 변수 생성
		int num2;
		//2단계에 쓰일 변수 생성 
		//float a;
		//실수 자료형 : float(4byte), double(8byte)
		float f = 2.0f;
				
		
		
		System.out.print("숫자1 : ");
		num1 = scan.nextInt();
		System.out.print("숫자2 : ");
		num2 = scan.nextInt();
		//a = (float)num/2;
		
		//받은 숫자 문제 수식에 대입
		//1단계 결과 출력
		System.out.print("1단계 결과값은 : ");
		System.out.println(num1/2); 
		//System.out.println(num/2.0);
		//System.out.println((double)num/2); //명시적 형변환(or 강제적 형변환)
		//정수 / 정수 = 정수(int / int = int)
		//정수 / 실수 = 실수(int / double = double) : type casting 형변환(자동,묵시적) 
		//실수 / 실수 = 실수
		
				
		//1.5단계 결과 출력
		System.out.print("1.5단계 결과값은 : ");
		System.out.println(num1/num2);
		
		//2단계 결과 출력
		System.out.print("2단계 결과값은 : ");
		System.out.println((float)num1/2);
		System.out.println(num1/(double)num2);
		
		
		
		//더치페이 계산기를 만들어봅시다
		//금액과 인원수를 입력받아 한명 당 얼마씩 내야 되는지 계산해보기
		//소수점 둘째자리에서 자르기
		
		
		//주말동안 코드 복습해오기
		//혼자 술술 입력할 수 있을 때까지

		
		
		
		
		
		
		

	}

}
