package variable;

import java.util.Scanner;

public class 변수_02 {

	public static void main(String[] args) {
		
		//사용자로부터 숫자를 입력받아 10을 곱한 결과를 출력하는 키오스크를 만드세요
		//int num;
		
		//Scanner scan = new Scanner(System.in);
		
		//System.out.print("숫자를 입력해주세요 : ");
		//num = scan.nextInt();
		//System.out.println("축하드립니다. 10배에 당첨되셨네요!! ");
		//System.out.print("당신이 받을 결과값은 : ");
		//System.out.print(num*10);
		
		//문제풀이는 순서대로 정해서
		int i = 0; //생성 먼저
		
		//1. Scanner 생성
		Scanner a  = new Scanner(System.in);
		//2. 숫자 입력받아서 변수에 저장 : 출력 때 사용해야 하니깐
		i = a.nextInt();
		//3. 곱한 결과를 출력
		System.out.println(i*10);
		//출력명령 안에 연산자 사용가능
		
		
		
		
		
		
		
		

	}

}
