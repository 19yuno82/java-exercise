import java.util.Scanner;

public class 사칙연산 {

	public static void main(String[] args) {
		//사칙연산 메소드 만들기
		//두 개의 정수를 전달받아
		//덧셈,뺄셈,곱셈,나눗셈(소주점까지) 하여
		//출력
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("number1 : ");
		int num1 = scan.nextInt();
		System.out.print("number2 : ");
		int num2 = scan.nextInt();
		
		int value1 = add(num1,num2);
		int value2 = sub(num1,num2);
		int value3 = multip(num1,num2);
		double value4 = div(num1,num2);
		System.out.println("덧셈 : "+ value1);
		System.out.println("뺄셈 : "+ value2);
		System.out.println("곱셈 : "+ value3);
		System.out.println("나눗셈 : "+ value4);
		

	}//main end
	
	public static int add(int a, int b) {
		return a+b;
	}//add
	
	public static int sub(int a, int b) {
		return a-b;
	}//sub
	public static int multip(int a, int b) {
		return a*b ;
	}//multip
	public static double div(int a, int b) {
		return a/(double)b;
	}//div
	

}
