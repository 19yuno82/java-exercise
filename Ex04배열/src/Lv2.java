import java.util.Random;
import java.util.Scanner;

public class Lv2 {

	public static void main(String[] args) {
		// 4번째 인덱스에 들어있는 값과 9번째 인덱스에 들어있는 값을 더하여 결과값 출력
		// 각각의 인덱스에 들어있는 값의 총합
		// 배열 안에 있는 수의 평균

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("array length : ");
		int length = scan.nextInt();

		int[] array = new int[length];
		int sum = 0;

		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(length * 2);
			System.out.print(array[i] + " ");
		} // for end
		System.out.println();
		// step1
		System.out.println("4th + 9th = " + (array[4] + array[9]));

		// step2
		for (int j = 0; j < length; j++) {
			sum += array[j];
		} // for end
		System.out.println("array total sum : " + sum);

		// step3
		System.out.println("array average : " + (sum / (double) length));

	}

}
