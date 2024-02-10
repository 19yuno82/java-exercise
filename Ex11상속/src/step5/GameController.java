package step5;

import java.util.Random;
import java.util.Scanner;

public class GameController {
	private CD규격 cd;
	
	public GameController(CD규격 cd) {
		this.cd = cd;
	}//생성자
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		Random rs = new Random();
		
		
		for (int cnt = 0; cnt < cd.getLife();) {
			cd.makeRandom();
						
			System.out.print(cd.getQuestion());
			int answer = sc.nextInt();
			
			if(cd.isOK(answer)) {
				System.out.println("오우, 당신은 산수 천재?");
			}else {
				System.out.println(cd.failMsg(cnt));
				cnt++;
			}//if

		}//for		
	}

}
