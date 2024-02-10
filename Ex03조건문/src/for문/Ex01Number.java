package for문;

public class Ex01Number {

	public static void main(String[] args) {
		// 1. for문을 이용해 10부터 ; 72까지 ; 2씩 증가하면 출력
		for (int i = 10; i < 73; i += 2) {
			System.out.print(i + " ");

		} // for end
		System.out.println(" ");
		// 2. for문을 이용해 94부터 3까지 1씩 감소하며 출력
		for (int a = 94; a > 2; a--) {
			System.out.print(a + " ");

		} // for end
		System.out.println(" ");

		// 3. for문을 이용해 21부터 57까지 수 중 짝수만 출력
		for (int b = 21; b < 58; b += 2) {
			System.out.print(b + " ");
		} // for end
		System.out.println(" ");

		for (int c = 21; c < 58; c++) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			} // if end

		} // for end

	}

}
