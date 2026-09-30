package lab3;

import java.util.Scanner;

public class Main {
// input:
// The word "array" is usually shortened as "arr". Shorts are short that's why they are called this way. Forrest Gump ran into a forest. Was there a forest spirit?
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		try {
//			var dict = new Dictionary("./src/lab3/dict1.txt");
//			var dict = new Dictionary("./src/lab3/broken.txt"); // InvalidFileFormatException
			var dict = new Dictionary("./src/lab3/doesnt_exist.txt"); // FileReadException
			System.out.println("Введите текст для перевода:");
			var input = scanner.nextLine();
			var translated = dict.translate(input);
			System.out.println("Перевод:");
			System.out.println(translated);
		} catch (FileReadException | InvalidFileFormatException e) {
			e.printStackTrace();
		}
	}
}
