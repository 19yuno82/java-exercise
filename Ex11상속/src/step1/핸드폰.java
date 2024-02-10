package step1;

public class 핸드폰 {
	protected int phoneNum ;
	//public : 누구나 접근 가능
	//protected : 하위클래스에서 접근 가능
	//private : 해당클래스만 접근 가능
	
	public void call() {
		System.out.println("전화걸기");
	}
	
	public void send() {
		System.out.println("전화받기");
	}

}//class
