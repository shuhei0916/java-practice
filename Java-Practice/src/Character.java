
public class Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 0;
		System.out.println("敵に？？ポイントのダメージを与えた!");
	}
}