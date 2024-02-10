import java.util.Scanner;

public class 조건문실습07 {

	public static void main(String[] args) {
		// 유저1과 유저2의 이름을 입력받고
		// 가위,바위,보 중 하나를 입력받아
		// 게임결과를 판단하여 출력

		Scanner scan = new Scanner(System.in);

		System.out.print("user1 : ");
		String user1 = scan.next();
		System.out.print("user2 : ");
		String user2 = scan.next();

		System.out.print(user1 + ">> ");
		String rps1 = scan.next();
		System.out.print(user2 + ">> ");
		String rps2 = scan.next();

//		if(rps1.equals("가위")) {
//			if(rps2.equals("바위")) {
//				System.out.println(user2+" 승리!");
//			}else if(rps2.equals("보")) {
//				System.out.println(user1+" 승리!");
//			}else if(rps2.equals("가위")){
//				System.out.println("무승부!");
//			}else {
//				System.out.println("잘못 입력하셨네요.");
//			}
//		}else if(rps1.equals("바위")) {
//			if(rps2.equals("보")) {
//				System.out.println(user2+" 승리!");
//			}else if(rps2.equals("가위")) {
//				System.out.println(user1+" 승리!");
//			}else if(rps2.equals("바위")){
//				System.out.println("무승부!");
//			}else {
//				System.out.println("잘못 입력하셨네요.");
//			}
//		}else if(rps1.equals("보")) {
//			if(rps2.equals("바위")) {
//				System.out.println(user1+" 승리!");
//			}else if(rps2.equals("가위")) {
//				System.out.println(user2+" 승리!");
//			}else if(rps2.equals("보")) {
//				System.out.println("무승부!");
//			}else {
//				System.out.println("잘못 입력하셨네요.");
//			}
//		}else {
//			System.out.println("잘못 입력하셨네요.");
//		}
		
		
		
		// 조건 무승부
		// 조건 user1 이기는 경우만
		// 아니면 user2 이김

		if (rps1.equals(rps2)) {
			System.out.println("무승부!");
			
			//논리곱(&&) : 0*1 = 0 / 1*1 = 0
			//논리합(||) : 1+0 = 1 / 0+1 = 1
		} else if ((rps1.equals("가위") && rps2.equals("보")) || (rps1.equals("바위") && rps2.equals("가위"))
				|| (rps1.equals("보") && rps2.equals("바위"))) {
			System.out.println(user1 + " 승리!");
		} else if ((rps2.equals("가위") && rps1.equals("보")) || (rps2.equals("바위") && rps1.equals("가위"))
				|| (rps2.equals("보") && rps1.equals("바위"))) {
			System.out.println(user2 + " 승리!");
		} else {
			System.out.println("잘못 입력했습니다.");
		}

	}

}
