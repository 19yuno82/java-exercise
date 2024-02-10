package Model;

public class MusicVO {
	//제목(String), 가수(String), 경로(String), 재생시간(int)
	//1.필드
	//2.생성자 (모든 필드 초기화)
	//3.get/set
	//4.toString
	
	private String title;
	private String singer;
	private String route;
	private int runTime;
	
	public MusicVO(String title, String singer, String route, int runTime) {
		super();
		this.title = title;
		this.singer = singer;
		this.route = route;
		this.runTime = runTime;
	}
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public String getRoute() {
		return route;
	}
	public int getRunTime() {
		return runTime;
	}
	@Override
	public String toString() {
		return "재생곡 [title: " + title + ", singer: " + singer + ", route: " + route + ", runTime: " + runTime + "]";
	}
	
	
}
