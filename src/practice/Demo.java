package practice;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("好きな整数を入力してください:");
		String inputnum = scanner.nextLine();
		int num = Integer.parseInt(inputnum);
		if (num > 0) {
			System.out.println("入力された値は正の数です");
		} else if (num < 0) {
			System.out.println("入力された値は負の数です");
		} else {
			System.out.println("入力された値は0です");
		}
		scanner.close();
	}
}
