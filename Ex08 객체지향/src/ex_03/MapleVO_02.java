package ex_03;

public class MapleVO_02 {
	//Eclipse 자동완성으로 VO 설계하기
	
	//1.필드는 손으로 입력한다.
	private String nick;
	private String job;
	private int lv;
	private int str;
	private int dex;
	private int lux;
	private int intel;
	
	//2.생성자 - 반드시 값을 지정해야 하는 필드에 대해 초기화
	//반드시 모든 필드값을 매개변수로 전달받지 않아도 된다
	//객체 생성 시 결정 vs 설계단계에서 결정
	public MapleVO_02(String nick, int str, int dex, int lux, int intel) {
		super();
		this.nick = nick;
		this.str = str;
		this.dex = dex;
		this.lux = lux;
		this.intel = intel;
		this.job = "모험가"; //생성자 메소드에서 초기값을 지정해주도록 한다
		this.lv = 1;	   //생성자 매개변수에 모두 다 넣을 필요는 없다
	}//생성자 메소드
	
	//3.get/set
	public String getNick() {
		return nick;
	}

	public String getJob() {
		return job;
	}

	public int getLv() {
		return lv;
	}

	public int getStr() {
		return str;
	}

	public int getDex() {
		return dex;
	}

	public int getLux() {
		return lux;
	}

	public int getIntel() {
		return intel;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
		
	

}
