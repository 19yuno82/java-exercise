package for문;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 정수를 입력 받아 모든 약수를 출력

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = scan.nextInt();

		System.out.print(num + "의 약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		} // for end

	}

}
