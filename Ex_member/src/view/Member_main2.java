package view;

import java.util.ArrayList;
import java.util.Scanner;

import Model.MemberDAO;
import Model.MemberDTO;

public class Member_main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MemberDAO mdao = new MemberDAO();

		while (true) {
			System.out.println("회원관리 프로그램");
			System.out.println("1. 전체조회 2. 회원가입 3. 회원삭제 4. 비밀번호 수정 5. 종료");
			int choiceNum = sc.nextInt();

			if (choiceNum == 5) {
				System.out.println("프로그램 종료");
				break;
			} else if (choiceNum == 1) {

				ArrayList<MemberDTO> list_dto = mdao.selectAll();
				for (int i = 0; i < list_dto.size(); i++) {
					System.out.println("id : " + list_dto.get(i).getId());
					System.out.println("pw : " + list_dto.get(i).getPw());
					System.out.println("age : " + list_dto.get(i).getAge());
					System.out.println("name  : " + list_dto.get(i).getName());
					System.out.println("---------------");
				}

			} else if (choiceNum == 2) {
				System.out.print("id 입력 >> ");
				String inputId = sc.next();
				System.out.print("pw 입력 >> ");
				String inputPw = sc.next();
				System.out.print("name 입력 >> ");
				String inputName = sc.next();
				System.out.print("age 입력 >> ");
				int inputAge = sc.nextInt();
				
				int row = mdao.signUp(new MemberDTO(inputId, inputPw, inputName, inputAge));
				
				if (row > 0) {
					System.out.println("insert success");
				} else {
					System.out.println("insert fail");
				}

			} else if (choiceNum == 3) {
				System.out.println("삭제할 id를 입력해 주세요");
				String delId = sc.next();

				int row = mdao.delete(delId);

				if (row > 0) {
					System.out.println("delete success");
				} else {
					System.out.println("delete fail");
				}

			} else if (choiceNum == 4) {
				System.out.print("수정할 id 입력 >> ");
				String udtId = sc.next();
				System.out.print("pw를 새롭게 입력 >> ");
				String udtPw = sc.next();
				
				int row = mdao.update(new MemberDTO(udtId, udtPw));

				if (row > 0) {
					System.out.println("update success");
				} else {
					System.out.println("update fail");
				}

			} else {
				System.out.println("잘못입력했습니다.");
			}

		} // while

	}// main

}
