import java.util.Scanner;

public class 조건문while_01 {

	public static void main(String[] args) {
		// 사용자로부터 반복하여 정수를 입력받아서
		// 10보다 큰 수를 입력하면 종료
		// 종료되었습니다 출력

		Scanner scan = new Scanner(System.in);

		int num = 0;

		while (true) {

			System.out.print("정수 입력 : ");
			num = scan.nextInt();

			if (num > 10) {
				break;
			} // if end

		} // while end

		System.out.println("종료되었습니다.");

	}

}
