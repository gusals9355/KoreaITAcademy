package ch07.starcraft;

public class Medic implements Bionic{
	private int currentHP = 3;
	private final int MAX_HP = 15;
	
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public int getMAX_HP() {
		return MAX_HP;
	}
	
	public void heal(Object unit) {
		if(this == unit || !(unit instanceof Bionic)) {
			System.out.println("이 유닛은 치료할 수 없습니다.");
			return;
		}
		
		if(unit instanceof Bionic) {
			if(unit instanceof Marine) {
				Marine marine = (Marine)unit;
				marine.setCurrentHP(marine.getMAX_HP());
			}
			else if(unit instanceof Medic) {
				Medic medic = (Medic)unit;
				medic.setCurrentHP(medic.MAX_HP);
			}
		}
	}
	
}
