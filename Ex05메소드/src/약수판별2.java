import java.util.Random;
import java.util.Scanner;

public class 약수판별2 {

	public static void main(String[] args) {
		// 두 개의 정수 num과 i를 전달받아
		// i가 num의 약수라면 true 아니라면 false

		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		System.out.print("number1 : ");
		int num = scan.nextInt();
		System.out.print("number2 : ");
		int i = scan.nextInt();
		
		System.out.println("Divisors? " + isDivisors(num, i));
		사칙연산.add(num,i); //add의 접근제한자가 public이므로 해당클래스의 메소드에 접근해서 가져올 수 있다

	}// main end
		// method

	// return이 boolean이면 is를 붙여서 사용하는 경우가 많다
	public static boolean isDivisors(int a, int b) {
		return a % b == 0; // 비교연산은 결과가 boolean이니깐 굳이 조건문을 쓰지않아도 된다
//		boolean answer = false;
//		if (a % b == 0) {
//			answer = true;
//		}
//		return answer;

	}// isDivisors end

}
