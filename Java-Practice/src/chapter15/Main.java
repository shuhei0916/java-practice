package chapter15;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {
//		String s1 = "すっきりJava";
//		String s2 = "Java";
//		String s3 = "java";
//		
//		if (s2.equals(s3)) {
//			System.out.println("s2 equals to s3");
//		}
//		if (s2.equalsIgnoreCase(s3)) {
//			System.out.println("s2とs3はケースを区別しなければ等しい");
//		}
//		System.out.println("s1の長さは" + s1.length());
//		System.out.println(s1.substring(1, 3));
//		
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < 100; i++) {
//			sb.append("Java");
//		}
//		String s = sb.toString();
//		System.out.println(s);
//		
//		String s4 = "abc,def:ghi";
//		String[] words = s4.split("[,:]");
//		for (String w : words) {
//			System.out.print(w + "->");
//		}
		
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime());
//		Date past = new Date(150000L);
//		System.out.println(past);
		
//		Calendar c = Calendar.getInstance();
//		c.set(2019, 8, 22, 1, 23, 45);
//		Date d = c.getTime();
//		System.out.println(d);
//		
//		Date now = new Date();
//		c.setTime(now);
//		int y = c.get(Calendar.YEAR);
//		System.out.println("今年は" + y + "年です");
		
		Instant i1 = Instant.now();
		
		Instant i2 = Instant.ofEpochMilli(160000004L);
		long l = i2.toEpochMilli();
		
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020,  1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		
		
//		System.out.println("Tokyo: " + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		
		
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		// ZonedDataTimeの利用方法
		System.out.println("東京: " + z2.getYear() + z2.getMonth() + z2.getDayOfMonth()+ ", " + z3.getHour() + ":" + z3.getMinute());
		System.out.println("ロンドン: " + z3.getYear() + z3.getMonth() + z3.getDayOfMonth() + ", " + z3.getHour() + ":" + z3.getMinute());
		
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
	}
}



















