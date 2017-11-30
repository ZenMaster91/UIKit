package UIKit;

import java.util.Scanner;

public class UIConsole {

	public static void print(String... text) {
		for (String string : text) {
			System.out.print(string);
		}
	}

	public static void print(boolean newlineafterfinish, String... text) {
		print(text);
		if (newlineafterfinish) {
			System.out.println();
		}
	}

	public static void print(boolean newlineafterfinish, String separator,
			String... text) {
		for (String string : text) {
			System.out.print(string + separator);
		}
		if (newlineafterfinish) {
			System.out.println();
		}
	}
	
	@SuppressWarnings("resource")
	public static String readLine() {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}
}
