import java.util.Random;
import java.util.Scanner;

public class FinalTest {

	public static void main(String[] args) {
		//데이터 탐색하기
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		//데이터 생성
		String[] str = {"김","이","박","정","장"};
		
		System.out.print("입력 >> ");
		String input = scan.next();
		
		//int cnt = 0;
		boolean isChecked = false; //teacher
		
		//알고리즘
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(input)) {
				System.out.println(input +"는(은) " + i +"번에 존재합니다.");
				isChecked = true; //teacher
				break;
			}   //else if(cnt == 4) {
				//break;
			    //}//else if end
				//cnt++;
		}//for end
		
		//일치하지 않을 경우만 출력
		
		//if(str[cnt].equals(input) == false) {
		//System.out.print("존재하지 않습니다.");
		//}
		
		//teacher
		if(!isChecked) {
			System.out.print("존재하지 않습니다.");
		}//if end
		
		
		

	}

}
