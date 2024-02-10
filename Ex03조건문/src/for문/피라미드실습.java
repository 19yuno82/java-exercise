package for문;

public class 피라미드실습 {

	public static void main(String[] args) {
		//pyramid
		
		int tree = 1;
		for(int i=10; i>=0; i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}//2for
			for(int k=1;k<=tree;k++) {
				System.out.print("*");
			}//3for
			tree +=2;
			System.out.println();
		}//1for
		
		
		
	}

}
