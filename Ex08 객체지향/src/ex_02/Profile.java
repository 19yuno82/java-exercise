package ex_02;

public class Profile {
	// 새로운 자료형
	private String nick;
	private String myStatus;
	private String pic;
	private long birth;
	private String email;
	
	//생성자 메소드 : 리턴타입을 명시하지 않고 이름을 클래스의 이름과 똑같이 맞추기
	public Profile(String nick, String email) {
		//변수영역에 있는 필드에 매개변수로 전달된 값 복사
		this.nick = nick;
		this.email = email;
	}
	//캡슐화 된 닉네임 변경 기능(메소드)
	public void setNick(String nick) {
		this.nick = nick;
	}
	//확인하고 싶은 필드 소환 기능(메소드)
	public String getNick() {
		return nick;
	}
}//profile
