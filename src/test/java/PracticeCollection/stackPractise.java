package PracticeCollection;

import java.util.Stack;

public class stackPractise {
	public static void main(String[] args) {
		Stack<String> books = new Stack<>();
		books.push("WhiteBook");
		books.push("Red Book");
		books.push("Black Book");

		System.out.println(books);
		System.out.println(books.peek());
		System.out.println(books.pop());
		System.out.println(books);

		System.out.println(books.search("Red Book"));

	}
}
