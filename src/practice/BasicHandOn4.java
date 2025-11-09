package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicHandOn4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int total = 0;
		double averagePoint = 0;
		System.out.println("整数値を加算します");
		while (true) {
			System.out.print("整数を入力してください(負の数を入力で終了します):");
			String input = scanner.nextLine();
			int inputConversion = Integer.parseInt(input);
			if (inputConversion < 0) {
				System.out.println("プログラムを終了します");
				break;
			}
			scores.add(inputConversion);
			total += inputConversion;
		}
		averagePoint = (double) total / scores.size();
		System.out.println("合計: " + total + "点");
		System.out.println("平均: " + averagePoint + "点");
		System.out.print("平均点以上: ");
		for (int score : scores) {
			if (averagePoint <= score) {
				System.out.print(score + " ");
			}
		}
		scanner.close();
	}
}
