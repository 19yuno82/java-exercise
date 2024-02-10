import java.util.Scanner;

public class 피보나치수열 {

	public static void main(String[] args) {
		// 한 개의 정수 n를 전달받아 피보나치 수열의 n번째 항을 반환하는 메소드 설계
		//hint 메소드는 자기 자신을 반환할 수 있다
		//1번 항과 2번 항은 값로 선언해줘야, 3항부터 규칙이 발생
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" n : ");
		int n = scan.nextInt();
		
		System.out.println(fibonacci(n));

	}//main
	
	//다시 고민해보기
	public static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}//fibonacci
	

}
