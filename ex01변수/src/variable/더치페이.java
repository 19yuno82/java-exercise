package variable;

import java.util.Scanner;

public class 더치페이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int pay = 0;
		double people = 0;
		double result = 0;
	
		System.out.println("더치페이 계산기");
		System.out.print("총액은 : ");
		pay = scan.nextInt();
		System.out.print("나눌 인원은 : ");
		people = scan.nextInt();
		
		result = pay / people;
		System.out.println("1인당 금액은 "+ result +"입니다.");
		System.out.printf("1인당 금액은 "+"0.2%f",result); //소수점 자리

	}

}
