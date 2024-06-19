package chapter14;

public class Hero {
	String name;
	int hp;
	// 静的フィールド：クラスに対して一つの変数の箱が用意される
	// 静的フィールドはクラス変数とも呼ばれる。
	static int money; 
	
	public String toString() { // toStringメソッドをオーバーライド
		return "name: " + this.name + "/HP: " + this.hp;
	}
	
	// 静的メソッド、クラスメソッド
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		// 静的メソッド内では同一クラス内のstaticがついていないフィールドやメソッドは利用できない
//		System.out.println(this.name + "らの所持金を初期化しました"); 
	}
}
