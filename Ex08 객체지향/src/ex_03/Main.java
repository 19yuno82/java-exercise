package ex_03;

public class Main {

	public static void main(String[] args) {
		//메이플 캐릭터의 정보를 저장할 수 있는 MapleVO 클래스 설계
		//1.필드 7개 private
		//2.nick,str,dex,lux,intel는 생성자로 초기화
		//3.job, lv 수정하는 메소드 설계
		//4.모든 필드에 대해 getter 메소드 설계
		
		//캐릭터 3개 생성
		//그림 그리기까지
		MapleVO ch1 = new MapleVO("강철방패",3,2,1,1);
		MapleVO ch2 = new MapleVO("마법모자",1,1,2,3);
		MapleVO ch3 = new MapleVO("눈보다빠른손",2,3,1,1);
		
		//객체 생성할때 필드값 초기화하지 않으면
		//string => null, int => 0
		
		ch1.setJob("전사");
		ch1.setLv(7);
		ch2.setJob("마법사");
		ch2.setLv(3);
		ch3.setJob("도적");
		ch3.setLv(2);
		System.out.println("ch1의 캐릭터");
		System.out.println("nick : " + ch1.getNick());
		System.out.println("job : " + ch1.getJob());
		System.out.println("Lv : "+ch1.getLv());
		System.out.println("str : "+ch1.getStr());
		System.out.println("dex : "+ch1.getDex());
		System.out.println("lux : "+ch1.getLux());
		System.out.println("int : "+ch1.getIntel());
		System.out.println("ch2의 캐릭터");
		System.out.println("nick : " + ch2.getNick());
		System.out.println("job : " + ch2.getJob());
		System.out.println("Lv : "+ch2.getLv());
		System.out.println("str : "+ch2.getStr());
		System.out.println("dex : "+ch2.getDex());
		System.out.println("lux : "+ch2.getLux());
		System.out.println("int : "+ch2.getIntel());
		System.out.println("ch3의 캐릭터");
		System.out.println("nick : " + ch3.getNick());
		System.out.println("job : " + ch3.getJob());
		System.out.println("Lv : "+ch3.getLv());
		System.out.println("str : "+ch3.getStr());
		System.out.println("dex : "+ch3.getDex());
		System.out.println("lux : "+ch3.getLux());
		System.out.println("int : "+ch3.getIntel());
		
		//배열에 저장
		//MapleVO 3칸 배열
		MapleVO[] maples = new MapleVO[3];
		maples[0] = new MapleVO("새캐릭",5,5,5,5);	
			

	}//main

}
