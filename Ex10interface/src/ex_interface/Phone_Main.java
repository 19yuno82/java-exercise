package ex_interface;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Phone_Main {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.call();
		p.receive();
		p.sendMessage();
		
		//이벤트
		//버튼을 클릭했을때
		//화면을 길게 클릭했을때 같은....
		
		//익명클래스 -- 1회성 인터페이스
		
		PhoneInterface pi = new PhoneInterface() {
			
			@Override
			public void receive() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void call() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Button btn = new Button();
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
		});
		Button btn2 = new Button();
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bye");
			}
		});

	}

}