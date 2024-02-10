
public class Pocketmon {
	private String name;
	private int attack;
	private int shield;
	private String area;
	
	public Pocketmon(String name, int attack, int shield, String area) {
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
	
	
	//toString 메소드
	//객체에 저장된 필드값을 문자열로 만들어 리턴
	@Override
	public String toString() {
		return "Pocketmon [name: " + name + ", attack: " + attack + ", shield: " + shield + ", area: " + area + "]";
	}
	
}
