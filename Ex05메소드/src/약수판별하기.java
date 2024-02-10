import java.util.Scanner;

public class 약수판별하기 {

	public static void main(String[] args) {
		// 정수 1개를 입력받아
		// 완전수라면 true, 아니라면 fales
		// 소수라면 true, 아니라면 false

		Scanner scan = new Scanner(System.in);

		System.out.print("number : ");
		int num = scan.nextInt();

		boolean PerNum = isPerfectNumber(num);
		boolean decNum = isPrimeNumber(num);

		System.out.println("Perfect Number ? : " + PerNum);
		System.out.println("Prime Number ? : " + decNum);

	}// main end
		
	public static boolean isPerfectNumber(int a) {
		int sum = 0;
		for (int i = 1; i <= a/2; i++) {
			if (a % i == 0) {
				sum += i;
			} // if
		} // for
		
		return sum == a;
		
	}// perfectOfNumber

	public static boolean isPrimeNumber(int b) {
//		boolean result1 = true;
//		for (int i = 2; i <= b/2; i++) {
//			if (b % i == 0) {
//				return result1 = false;
//			}//if
//		} // for
//		return result1;
		int cnt = 0;
		for(int i=1;i<=b;i++) {
			if(b%i == 0) {
				cnt++;
			}//if
		}//for
		return cnt == 2;
	}// dacimal

}
