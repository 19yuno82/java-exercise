package step5;

public abstract class CD규격 {
	//규칙
	//마이너스 게임과 공통된 부분은 옮긴다
	//구현이 달라지는 부분은 추상메소드로 만든다
	protected int life;
	protected String[] failMsg;
	protected int max;
	protected int num1;
	protected int num2;
	
	public int getLife() {
		return life;
	}
	
	public String failMsg(int cnt) {
		return failMsg[cnt];
		//배열을 리턴할 경우 주소가 복사되기 때문에 주의해야 함
		//꼭 배열을 리턴해야만 한다면 clone()해서 리턴하기
	}
	
	public int getMax() {
		return max;
	}
	
	public abstract void makeRandom();
	
	public abstract String getQuestion();
	
	public abstract boolean isOK(int answer);
	

}
