package for문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 2개의 정수 (base, n) 입력받아
		// base의 n제곱을 출력
		// ex) base=2,n=3 2*2*2 = 8

		Scanner scan = new Scanner(System.in);

		System.out.print("base : ");
		int base = scan.nextInt();
		System.out.print("n제곱 : ");
		int n = scan.nextInt();

		int multip = 1;

		for (int i = 1; i < n + 1; i++) {
			multip *= base;
		} // for end

		System.out.println(multip);

	}

}
