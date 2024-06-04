
public class OverloadSample {
	public static int add(int x, int y) {
		return x + y;
	}
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static String add(String x, String y) {
		return x + y;
	}
	// 
	// 仮引数の個数か型が異なれば同じ名前のメソッドを複数定義できる。
	// シグネチャ（メソッド名、引数の個数や型）が重複しない場合のみ許される、ということ。
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello", "World"));
	}
}
