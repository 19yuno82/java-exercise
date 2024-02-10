package View;

import java.util.Scanner;

import Controller.Controller;

public class MainView {

	public static void main(String[] args) {
		//View의 역할 : 사용자 인터페이스(UI), 기능을 사용자가 선택하도록 만들기
		
		Scanner scan = new Scanner(System.in);
		Controller con = new Controller();
		boolean isPlay = true;
		while(isPlay) {
			System.out.println("[1]재생 [2]이전곡 [3]다음곡 [4]정지");
			System.out.print(">> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				//맨 처음에는 첫번째 곡 재생
				con.play();
				System.out.println("현재 재생곡 :" +con.playList());
				break;
			case 2:
				//이전곡 재생
				con.prePlay();
				System.out.println("현재 재생곡 :" +con.playList());
				break;
			case 3:
				//다음곡 재생
				con.nextPlay();
				System.out.println("현재 재생곡 :" +con.playList());
				break;
			case 4:
				con.stop();
				isPlay = false;
				break;
			}//switch
			
		}//while

	}

}
