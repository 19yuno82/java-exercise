package for문;

public class 구구단실습 {

	public static void main(String[] args) {
		// 구구단 왼쪽에서 오른쪽으로 출력
		//2단부터 9단까지
		
//		for(int i=2; i<10;i++) {
//			System.out.print(i+"단 : ");
//			for(int j=1; j<10; j++) {
//				System.out.print(i+"*"+j+"="+(i*j)+" ");
//							
//			}//for2
//			System.out.println();
//		}//for1
		
		//출력은 항상 왼쪽에서 오른쪽으로 진행됩니다.
		//구구단 출력 심화
		
		for(int a=1;a<10;a++) {
			for(int b=2;b<10;b++) {
				System.out.print(b+"*"+a+"="+(b*a)+"\t");
			}//2for
			System.out.println();
		}//1for
			

	}

}
