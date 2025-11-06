package practice;

import java.util.Scanner;

public class HandsOn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("好きな整数を入力してください:");
		String inputnum = scanner.nextLine();
		int num = Integer.parseInt(inputnum);
		if (num == 0) {
			System.out.println("入力された値は0です");
		} else if (num % 2 == 0) {
			System.out.println("入力された値は偶数です");
		} else {
			System.out.println("入力された値は奇数です");
		}
		scanner.close();
	}
}
