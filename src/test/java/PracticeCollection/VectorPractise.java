package PracticeCollection;

import java.util.Vector;

public class VectorPractise {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		v1.add("Bhuvaneshwari");
		v1.add("Reddy");
		v1.add(0, "gayathri");
		v1.add("Reddy2");
		System.out.println(v1);
		System.out.println("Size  " + v1.size());
		System.out.println("capacity  " + v1.capacity());

		Vector<String> v2 = new Vector<>();
		v2.add("Ramesh");
		v2.add("Suresh");
		v2.add("gayathri");

		// for (int i = 0; i < v2.size(); i++) {
		// v1.add(v2.get(i));
		// } //instead of using this process try addAll();
		v1.addAll(v2);
		// v1.addAll(0, v2);
//		System.out.println(v1.get(3));
		System.out.println(v1);
		// v1.remove(1);
		// v1.remove("Reddy2");
		// v1.removeAll(v2);
		// System.out.println(v1);
		// v1.clear();
		// System.out.println(v1);
		System.out.println(v1.contains("gayathri"));
		// System.out.println(v1.containsAll(v2));
		/**
		 * To replace the value with someother value we need to use set method
		 */
		v1.set(0, "murthy");
		System.out.println(v1);
		System.out.println(v1.indexOf("Ramesh"));
	}

}
