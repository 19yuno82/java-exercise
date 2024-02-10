package ex_02;

public class Main {

	public static void main(String[] args) {
		// 카톡 프로필 설계
		// 닉네임(String), 상태메세지(String), 사진(String), 생일(long), email(String)

		// 5개의 속성을 가진 자료형을 설계하고
		// 프로필 3개 생성
		
		//1.캡슐화를 적용하여 카톡 프로필을 설계해봅시다
		
		//1-1.개체를 생성할 때 반드시 지정해줘야 하는 값(속성) 처리
		//ex)메이플 캐릭터 생성할 때 닉네임 안쓰면 안됨
		//메소드(기능)를 설계하자 =  꼭 필요한 속성(필드)을 지정(초기화)하는 메소드
		
		//1-2. newProfile메소드 수정 => 객체 생성할 때 딱 한번만 호출되게
		//		생성자  메소드 => 리턴타입을 명시하지 않고 이름을 클래스의 이름과 똑같이 맞추기
		//1-3. 수정하고 싶은 필드는 어떻게? => 기능(메소드) 정의
		//		setter 메소드
		//1-4. 확인하고 싶은 필드는 어떻게? => 기능(메소드) 정의
		//		ex) p1 주소에 저장된 닉네임을 출력
		//		getter 메소드 => 객체 필드에 저장된 값을 return
		
		
		
		Profile p1 = new Profile("홍길동","aaa@company.com");
		p1.setNick("이몽룡"); //닉네임 변경 기능
		System.out.println(p1.getNick());
	
		
//		p1.newProfile("홍길동","aaa@company.com");
//		p1.email = "aaa@company.com";
//		p1.birth = 20230101;
//		p1.myStatus  = "행복함";
//		p1.nick = "홍길동";
//		p1.pic = "사진1";
		
		Profile p2 = new Profile("임꺽정", "bbb@company.com");
//		p2.email = "bbb@company.com";
//		p2.birth = 20230201;
//		p2.myStatus  = "배부름";
//		p2.nick = "임꺽정";
//		p2.pic = "사진2";
		
		Profile p3 = new Profile("장길산","ccc@company.com");
//		p3.email = "ccc@company.com";
//		p3.birth = 20230301;
//		p3.myStatus  = "따스함";
//		p3.nick = "장길산";
//		p3.pic = "사진3";

	}// main

}
