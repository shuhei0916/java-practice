
public class ForSample {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 60};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("=====");
		//拡張for文
		for (int value: scores) {
			System.out.println(value);
		}
	}
}
