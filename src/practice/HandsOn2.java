package practice;

import java.util.Scanner;

public class HandsOn2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("好きな整数を入力してください:");
		String inputnum = scanner.nextLine();
		int num = Integer.parseInt(inputnum);
		if (num == 0) {
			System.out.println("入力された値は0です");
		} else if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("入力された値は3と5の倍数です");
		} else if (num % 3 == 0) {
			System.out.println("入力された値は3の倍数です");
		} else if (num % 5 == 0) {
			System.out.println("入力された値は5の倍数です");
		} else {
			System.out.println("他の倍数です");
		}
		scanner.close();
	}
}
