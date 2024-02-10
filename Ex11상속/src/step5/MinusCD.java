package step5;

import java.util.Random;

public class MinusCD extends CD규격 {
	
	Random rs = new Random();	

	public MinusCD(int life, String[] failMsg,int max) {
		this.life = life;
		this.failMsg = failMsg;
		this.max = max;
	}// 생성자

	@Override
	public void makeRandom() {
		num1 = rs.nextInt(max) + 1;
		num2 = rs.nextInt(num1) + 1;
	}

	@Override
	public String getQuestion() {
		return num1 + "-" + num2 + "= ";
	}

	@Override
	public boolean isOK(int answer) {
		return num1 - num2 == answer;
	}

}
