package rit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNotes {

	private static final int maximumNotes = 1;
	private static final int addNote = 2;
	private static final int deleteNote = 3;
	private static final int printNotes = 4;
	private static final int exit = 5;
	private static int maxNotes;
	private static List<String> notes = new ArrayList<>();

	public static void main(String[] args) {
		checkSettingsFile();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			displayMenu();
			System.out.println();
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case maximumNotes:
				setMaxNotes(scanner);
				break;
			case addNote:
				addNote(scanner);
				break;
			case deleteNote:
				deleteNote(scanner);
				break;
			case printNotes:
				printNotes();
				break;
			case exit:
				saveNotesToFile();
				System.out.println("Exiting the program.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 5.");
			}
		}
	}

	private static void checkSettingsFile() {
		File settingsFile = new File("settings.txt");
		if (settingsFile.exists()) {
			try (Scanner fileScanner = new Scanner(settingsFile)) {
				if (fileScanner.hasNextInt()) {
					maxNotes = fileScanner.nextInt();
					fileScanner.nextLine();
					while (fileScanner.hasNextLine() && notes.size() < maxNotes) {
						notes.add(fileScanner.nextLine());
					}
					System.out.printf("Settings.txt file found. Maximum notes set to %d.\n", maxNotes);
					if (!notes.isEmpty()) {

						for (int i = 0; i < notes.size(); i++) {
							System.out.println(notes.get(i));
						}
					}
				}
			} catch (FileNotFoundException e) {
				System.err.println("Error reading settings file: " + e.getMessage());
			}
		} else {
			setMaxNotesFromUser();
		}
	}

	private static void setMaxNotesFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Settings file not found. Enter the number of notes to store:");
		maxNotes = scanner.nextInt();
		scanner.nextLine();
	}

	private static void setMaxNotes(Scanner scanner) {
		System.out.println("Enter your new maximum number of notes:");
		maxNotes = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Maximum number of notes set to: " + maxNotes);
	}

	private static void addNote(Scanner scanner) {
		if (notes.size() < maxNotes) {
			System.out.println("Enter your new note:");
			String note = scanner.nextLine();
			notes.add(note);
			System.out.println("Note added.");
		} else {
			System.out.println("Maximum number of notes reached. Please delete a note before adding a new one.");
		}
	}

	private static void deleteNote(Scanner scanner) {
		if (!notes.isEmpty()) {
			System.out.println("Available notes to delete:");
			for (int i = 0; i < notes.size(); i++) {
				System.out.println("Note " + i + ": " + notes.get(i));
			}
			System.out.println("Enter the number of the note to delete:");
			int noteToRemove = scanner.nextInt();
			scanner.nextLine();
			if (noteToRemove >= 0 && noteToRemove < notes.size()) {
				notes.remove(noteToRemove);
				System.out.println("Note removed.");
			} else {
				System.out.println("Invalid index. Please enter a valid index.");
			}
		} else {
			System.out.println("No notes available to delete.");
		}
	}

	private static void printNotes() {
		if (!notes.isEmpty()) {
			System.out.println("Your notes:");
			for (int i = 0; i < notes.size(); i++) {
				System.out.println("Note number: " + i + "," + "payload: " + notes.get(i));
			}
		} else {
			System.out.println("No notes available.");
		}
	}

	private static void saveNotesToFile() {
		try (PrintWriter writer = new PrintWriter("settings.txt")) {
			writer.println(maxNotes);
			for (String note : notes) {
				writer.println(note);
			}
			System.out.println("Notes saved to settings.txt.");
		} catch (FileNotFoundException e) {
			System.err.println("Error saving to file: " + e.getMessage());
		}
	}

	private static void displayMenu() {
		System.out.println();
		System.out.println("Enter 1 to set maximum number of notes");
		System.out.println("Enter 2 to add a new note");
		System.out.println("Enter 3 to delete a note");
		System.out.println("Enter 4 to print all notes");
		System.out.println("Enter 5 to exit the program");
		System.out.println();
		System.out.print("Enter your choice: ");

	}
}
