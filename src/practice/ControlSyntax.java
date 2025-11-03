package practice;

import java.util.Scanner;

public class ControlSyntax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("あなたの年齢は？:");
		String inputage = scanner.nextLine();
		int age = Integer.parseInt(inputage);
		System.out.print("あなたの性別は？:");
		String inputSex = scanner.nextLine();
		if (age >= 20) {
			System.out.println("成人です");
			if (inputSex.equals("男")) {
				System.out.println("成人男性です");
			} else if (inputSex.equals("女")) {
				System.out.println("成人女性です");
			}
		} else {
			System.out.println("未成年です");
		}
		scanner.close();
	}
}
