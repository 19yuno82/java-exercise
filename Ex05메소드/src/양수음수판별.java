import java.util.Scanner;

public class 양수음수판별 {

	public static void main(String[] args) {
		//한 개의 정수를 전달받아
		//양수라면 양수입니다 출력
		//음수라면 음수입니다 출력
		//0이라면 zero입니다 문자열 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("number : ");
		int num = scan.nextInt();
		
		String result = signOfNumber(num);//method
		System.out.println(result);	

	}//main
	
	public static String signOfNumber(int a) {
		String str;
		if(a>0) {
			str = "양수입니다.";
		}else if(a == 0) {
			str = "zero입니다.";
		}else {
			str = "음수입니다.";
		}
		return str;
	}//signOfNumber

}
