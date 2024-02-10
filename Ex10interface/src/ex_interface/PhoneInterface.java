package ex_interface;

public interface PhoneInterface {
	
	void call(); //추상메소드 -- 반드시 구현해야 함
	void receive(); //public abstract
	default void sendMessage() {
		
	}
	
	

}
