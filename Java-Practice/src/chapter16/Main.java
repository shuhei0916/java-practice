package chapter16;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		ArrayList<Integer> points = new ArrayList<Integer>();
//		points.add(10);
//		points.add(80);
//		points.add(75);
//		for (int i: points) {
//			System.out.println(i);
//		}
//		
//		Iterator<Integer> it = points.iterator();
//		while(it.hasNext()) {
//			Integer i = it.next();
//			System.out.println(i);
//		}

//		Set<String> colors = new HashSet<String>();
//		
//		colors.add("Red");
//		colors.add("Blue");
//		colors.add("Yellow");
//		colors.add("Red");
		
		ArrayList<Hero> heroes = new ArrayList<Hero>();
		Hero suzuki = new Hero("suzuki");
		heroes.add(suzuki);
		
		for (Hero h : heroes) {
			System.out.println(h);
		}
	
	}
}
