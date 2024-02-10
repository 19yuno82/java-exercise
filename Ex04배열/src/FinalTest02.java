import java.util.Random;
import java.util.Scanner;

public class FinalTest02 {

	public static void main(String[] args) {
		// 배열 원소의 값만큼 별을 출력하세요
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		// data input
		System.out.print("array length : ");
		int index = scan.nextInt();

		int[] starcount = new int[index];

		// algorism
		for (int i = 0; i < starcount.length; i++) {
			starcount[i] = random.nextInt(100) + 1;
			System.out.print((i + 1) + "(" + starcount[i] + ")" + "\t: ");
			for (int j = 1; j <= starcount[i]; j++) {
				System.out.print("*");
			} // for end
			System.out.println();
		} // for end
		
		


	}

}
