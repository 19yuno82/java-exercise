package for문;

public class 약수심화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				} // if end
			
			} // 2for
			System.out.println();
		} // 1for

	}

}
