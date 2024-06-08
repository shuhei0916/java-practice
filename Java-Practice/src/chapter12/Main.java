package chapter12;

public class Main {
	// 箱の型：どのメソッドを「呼べるか」決定する
	// 中身の型：メソッドが呼ばれたら、「どう動くか」を決定する
	public static void main(String[] args) {
		Slime s = new Slime(); Monster m = new Slime();
		s.run(); m.run();
	}
}	
