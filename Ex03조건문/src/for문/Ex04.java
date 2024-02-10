package for문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// for문을 사용하여 구구단 출력
		// 원하는 단 입력받아 구구단을 출력
		Scanner scan = new Scanner(System.in);

		System.out.print(" 단 입력 : ");
		int num = scan.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		} // for end

	}

}
