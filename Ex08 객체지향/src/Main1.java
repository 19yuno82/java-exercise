import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in); // 도구 생성
	      
	      ArrayList<Pocketmon> pocketmons = new ArrayList<Pocketmon>();
	      
	      while(true) {
	      
	         System.out.println("[1]추가 [2]삭제 [3]검색");
	         int choice = scan.nextInt();
	         
	         switch(choice) { //switch-case 문
	         case 1:
	        	 System.out.print("이름 : ");
	             String name = scan.next();
	             System.out.print("출몰지 : ");
	             String area = scan.next();
	             System.out.print("공격력 : ");
	             int attack = scan.nextInt();
	             System.out.print("방어력 : ");
	             int shield = scan.nextInt();
	             
	             pocketmons.add(new Pocketmon(name, attack, shield, area));
	             
	        	 break; //case 1 end
	         case 2:
	        	 //모든 포켓몬 정보 출력
	        	 for(int i=0;i<pocketmons.size();i++) {
	        		 System.out.println(pocketmons.get(i));
	        	 }
	        	 
	        	 System.out.print("삭제할 번호 >> ");
	        	 int num = scan.nextInt();
	        	 
	        	 System.out.println(pocketmons.get(num-1).getName() + "삭제!");
	        	 pocketmons.remove(num-1);
	        	 
	        	 break; //case 2 end
	         case 3:
	        	 System.out.print("검색 >> ");
	        	 String keyword = scan.next();
	        	 
	        	 boolean isOk = false;
	        	 
	        	 //for-each문
	        	 for(Pocketmon temp : pocketmons) {
	        		 if(temp.getName().equals(keyword)) {
	        			System.out.println(temp);
	        			isOk = true;
	        		 }//if
	        	 }//for
	        	 if(!isOk) {
	        		 System.out.println("목록에 없습니다.");
	        	 }
	        	 break; //case 3 end
	         case 4:
	        	 break;
	         default: //else
	        	 System.out.println("잘못 입력하셨습니다.");
	        		 
	         
	         }//switch
	         
	         
	         
	         
	         
	         
	      } // while 끝

	}

}
