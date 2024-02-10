package for문;

public class 완전수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 10000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				} // 2 if end
			} // 2for
			if (sum == i) {
				System.out.print(sum + "\t is PerfectNumber");
				System.out.println();
			} // 1 if end
		} // 1for

	}

}
