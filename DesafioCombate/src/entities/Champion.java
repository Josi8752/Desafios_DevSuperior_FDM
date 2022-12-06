package entities;

public class Champion {

	private String name;
	private int life;
	private int atack;
	private int armor;

	public Champion(String name, int life, int atack, int armor) {

		this.name = name;
		this.life = life;
		this.atack = atack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAtack() {
		return atack;
	}

	public int getArmor() {
		return armor;
	}

	public void takeDamage(Champion other) {
		if (other.getArmor() >= this.atack) {
			other.setLife(other.getLife() - 1);
		} else {
			other.setLife(other.getLife() + other.getArmor() - this.atack);
		}
	}

	public String status() {

		if (this.life <= 0) {
			return this.name + ": " + "0 de vida (morreu)";
		} else {
			return this.name + ": " + String.format("%d", this.life) + " de vida";
		}
	}

}