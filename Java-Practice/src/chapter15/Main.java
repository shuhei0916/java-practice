package chapter15;

public class Main {
	public static void main(String[] args) {
		String s1 = "すっきりJava";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)) {
			System.out.println("s2 equals to s3");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length());
		System.out.println(s1.substring(1, 3));
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
	}
}
