package ex_03;

public class MapleVO {
	private String nick;
	private String job;
	private int lv;
	private int str;
	private int dex;
	private int lux;
	private int intel;
	
	public MapleVO(String nick, int str, int dex, int lux, int intel) {
		this.nick = nick;
		this.str = str;
		this.dex = dex;
		this.lux = lux;
		this.intel = intel;
		
	}//생성자
	public void setJob(String job) {
		this.job = job;
	}//job 수정
	public void setLv(int lv) {
		this.lv = lv;
	}//lv 수정
	public String getNick() {
		return nick;
	}//get nick
	public String getJob() {
		return job;
	}//get job
	public int getLv() {
		return lv;
	}
	public int getStr() {
		return str;
	}//get str
	public int getDex() {
		return dex;
	}//get dex
	public int getLux() {
		return lux;
	}//get lux
	public int getIntel() {
		return intel;
	}//get intel
	

}
