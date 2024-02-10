package ex_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 포켓몬 도감 만들기
		// 1.포켓몬을 생성할 수 있는 클래스 설계
		// - 이름(name), 공격력(attack), 방어력(shield), 출몰지(area)
		// VO 구성요소 - 필드, 생성자, get/set
		// 모든 피드 생성자로 초기화
		// 수정할 필요가 없음

		// 2.Main 클래스에 메뉴 무한반복하기 [1]추가 [2]삭제 [3]검색
		// 3.입력한 번호에 따라 기능 실행하기

		// ArrayList vs 배열
		// - user가 데이터를 추가/삭제 해야 한다? => ArrayList
		// - 개발자가 데이터 개수를 정해둔다? => 배열

		// 4.추가 선택시 포켓몬의 정보 입력하여 저장하기
		// 5.삭제 선택시 현재 저장된 모든 포켓몬의 정보 출력하고 번호 입력받아 삭제
		// 6.검색 선택시 포켓몬 이름 입력받아 동일한 정보 출력하기, 없으면 없습니다 출력
		Scanner scan = new Scanner(System.in);
		ArrayList<PocketmonVO> pocketmons = new ArrayList<PocketmonVO>();
		int cnt = 0; // 입력된 배열 자리
		while (true) {
			System.out.println("===포켓몬 도감 메뉴 선택===");
			if (pocketmons.size() == 0) { // 포켓몬 도감 상태 출력
				System.out.println("수집된 포켓몬이 없네요, 어서 추가해주세요. 간바레!!!");
			} else {
				System.out.printf("현재 수집된 포켓몬은 %d 마리 있네요! \n", pocketmons.size());
			}
			System.out.println("[1]추가  [2]삭제  [3]검색 [4]종료");
			System.out.print("선택 버튼 : ");
			int choice = scan.nextInt();

			if (choice == 1) { // 1번.추가 기능
				System.out.print("name : ");
				String n = scan.next(); // 포켓몬 이름
				System.out.print("attack : ");
				int a = scan.nextInt(); // 포켓몬 공격력
				System.out.print("shield : ");
				int s = scan.nextInt(); // 포켓몬 방어력
				System.out.print("area : ");
				String ar = scan.next(); // 포켓몬 출몰지
				pocketmons.add(new PocketmonVO(n, a, s, ar));
				System.out.println(cnt + "번에 저장완료, 획득을 축하해요!");
				cnt++;
			} else if (choice == 2) { // 2번. 삭제 기능
//				pocketmonList(pocketmons); //메소드 내 for-each문 사용해서 리스트 전부 출력 가능
				for (int i = 0; i < pocketmons.size(); i++) {
					listPrint(pocketmons, i);
				} // 포켓몬 리스트 출력하기
				System.out.print("삭제할 포켓몬 번호를 선택 : ");
				int i = scan.nextInt();
				pocketmons.remove(i);
				System.out.println("삭제가 완료되었습니다.");
			} else if (choice == 3) {// 3번. 검색 기능

				System.out.print("검색할 포켓몬 이름을 입력해주세요 : ");
				String search = scan.next();
				// 입력된 포켓몬 이름으로 검색하기
				boolean check = false; //보유 여부에 따른 출력 기능 조건
				for (int i = 0; i < pocketmons.size(); i++) {
					if (pocketmons.get(i).getName().equals(search)) {
						listPrint(pocketmons, i);
						check = true;
						break;
					} // if
				} // for
				if (!check) {
					System.out.println("보유 목록에 없습니다.");
				} // if

			} else if (choice == 4) { // 도감 종료 기능
				break;
			} else {
				System.out.println("Error, 다시 선택해주세요");
			} // 메뉴 선택 조건문

		} // while

	}// main
	
	public static void listPrint(ArrayList<PocketmonVO> pocketmons, int i) {
		System.out.printf(i + "번 name:%s attack:%d shield:%d area:%s \n", 
				pocketmons.get(i).getName(),pocketmons.get(i).getAttack(), 
				pocketmons.get(i).getShield(),pocketmons.get(i).getArea());
	}//listprint method
	public static void pocketmonList (ArrayList<PocketmonVO> pocketmons) {
		for(PocketmonVO temp : pocketmons) {
			System.out.println(temp.getName());
		}//for
	}//pocketmonlist method

}
