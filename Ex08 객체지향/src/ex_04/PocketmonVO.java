package ex_04;

public class PocketmonVO {
	private String name;
	private int attack;
	private int shield;
	private String area;
	
	public PocketmonVO(String name, int attack, int shield, String area) {
		this.name = name;
		this.attack = attack;
		this.shield = shield;
		this.area = area;
	}//생성자
	
	//필드 4개 Get 메소드
	public String getName() {
		return name;
	}

	public int getAttack() {
		return attack;
	}

	public int getShield() {
		return shield;
	}

	public String getArea() {
		return area;
	}
		

}
