import java.util.Random;
import java.util.Scanner;

public class 조건문while_02 {

	public static void main(String[] args) {
		// 컴퓨터는 랜덤 수(정수) 하나 뽑는다
		// 사용자는 자유롭게 정수를 입력하고
		// 입력한 수가 컴퓨터 숫자보다 클 경우 down 출력
		// 입력한 수가 컴퓨터 숫자보다 작을 경우 up 출력
		// 입력한 수와 컴퓨터 숫자가 같을 경우 success! 출력
		// 정답을 맞히면 종료

		Random random = new Random();

		int com = random.nextInt(20) + 1; // 컴터 랜덤 수

//		System.out.println(com);

		Scanner scan = new Scanner(System.in);
		// int num = 0; //초기값 어떻게 //my code

		System.out.print("정수 입력 : "); // teacher
		int num = scan.nextInt();

		int turn = 1;

		while (num != com) {

			// System.out.print("정수 입력 : "); //my code
			// num = scan.nextInt(); // 입력 수

			turn++; // 심화 1번
//			if(turn>5) {
//				break;
//			}

			if (num < com) {
				System.out.println("UP!");
			} else {
				System.out.println("DOWN!");
			} // if end

			System.out.print("정수 입력 : "); // teacher
			num = scan.nextInt();

//			turn++; //심화 1번
			if (turn == 5) {
				break;
			} // 코드 이동: alt + 방향키 //드래그 : alt + shift + A

		} // while end

		System.out.println(" ");

		if (num == com) {
			System.out.println("SUCESS!");
			System.out.println(turn + "번만에 맞추셨네요.");
		} else {
			System.out.println("Fail!");
		}

	}

}
