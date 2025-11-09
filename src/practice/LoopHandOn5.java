package practice;

import java.util.Scanner;

public class LoopHandOn5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;

		System.out.println("正の数だけ加算します");
		while (true) {
			System.out.print("数字を入力してください(Enter or 負の数で終了): ");
			String inputNum = sc.nextLine();
			if (inputNum.isEmpty()) {
				System.out.println("プログラムを終了します");
				break;
			}
			int conversion = Integer.parseInt(inputNum);
			if (conversion > 0) {
				total += conversion;
				System.out.println("現在の合計:" + total);
			} else if (conversion <= 0) {
				System.out.println("プログラムを終了します" + "これまでの合計:" + total);
				break;
			}
		}
		sc.close();
		System.out.println("合計: " + total);
	}
}
