package chapter17;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}
}
