package step5;

import java.util.Random;

public class PlusCD extends CD규격{

	Random rs = new Random();	

	public PlusCD(int life, String[] failMsg,int max) {
		this.life = life;
		this.failMsg = failMsg;
		this.max = max;
	}// 생성자	
	

	public void makeRandom() {
		num1 = rs.nextInt(max) + 1;
		num2 = rs.nextInt(max) + 1;
	}

	public String getQuestion() {
		return num1 + "+" + num2 + "= ";
	}

	public boolean isOK(int answer) {
		return num1 + num2 == answer;
	}

}
