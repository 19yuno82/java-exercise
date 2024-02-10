import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex01학생관리프로그램 {

	public static void main(String[] args) {
		// ArrayList
		// 1.학생 추가기능
		// 2.학생 삭제기능
		// 3.학생 변경기능
		Scanner scan = new Scanner(System.in);

		// map
//		HashMap<Integer, String> student = new HashMap<>();
//		student.put(1,"홍길동");
//		System.out.println(student.get(1));

		ArrayList<String> stu = new ArrayList<>();
		while (true) {
			System.out.println("=====학생관리프로그램=====");
			System.out.println("1.학생추가 2.학생삭제 3.학생변경 4.학생목록 전체 조회 5.종료");
			int sel = scan.nextInt(); //기능 선택
			if (sel == 1) { //학생추가 기능
				System.out.println("1.원하는 위치에 추가  2.마지막 위치에 추가");
				int sel2 = scan.nextInt(); //위치 선정
				System.out.print("학생 이름 : "); 
				String name = scan.next();
				if (sel2 == 1) {
					// 원하는 위치 학생추가
					System.out.print("위치를 지정하세요 : ");
					int n = scan.nextInt();
					stu.add(n, name);
				} else if (sel2 == 2) {
					// 마지막 위치 학생추가
					stu.add(name);
				} else {
					System.out.println("잘못 입력했습니다.");
				} // if
			} else if (sel == 2) {
				System.out.println("1.선택삭제  2.전체삭제");
				int sel1 = scan.nextInt();
				if (sel1 == 1) {
					// 선택 삭제
					System.out.print("학생 이름 : ");
					String name = scan.next();
					for (int n = 0; n < stu.size(); n++) {
						if (name.equals(stu.get(n))) {
							stu.remove(n);
						} // if
					} // for
				} else if (sel == 2) {
					// 전체 삭제
					stu.clear();
				}
			} else if (sel == 3) {
				System.err.print("학생 이름 : ");
				String name = scan.next();
				System.out.print("새 이름 : ");
				String name1 = scan.next();
				for (int n = 0; n < stu.size(); n++) {
					if (name.equals(stu.get(n))) {
						stu.set(n, name1);
					} // if
				} // for

			} else if (sel == 4) {
//				for (int i = 0; i < stu.size(); i++) {
//					System.out.println(stu.get(i));
//				} // for
				for(String temp : stu) {
					System.out.println(temp);
				}

			} else if (sel == 5) {
				break;

			} else {
				System.out.println("잘못 입력했습니다");
			} // if

		} // while

	}// main
	//다른 팀 코드 중 참고할 사항
	//메소드 활용
	//변수 재활용, 변수 정리
	//주석 처리
	//예외 처리
	//코드 간결화

}
