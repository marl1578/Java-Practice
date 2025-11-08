package practice;

import java.util.Scanner;

public class LoopHandOn4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntTotal = 0;

		while (true) {
			System.out.print("数字を入力してください（Enterのみで終了）: ");
			String input = sc.nextLine();  // 文字列で入力を受け取る

			// Enterのみ（空文字）が入力されたら終了
			if (input.equals("")) {
				System.out.println("Enterが押されたため、処理を終了します。");
				break;
			}

			// 数値変換して加算
			int num = Integer.parseInt(input);
			cntTotal += num;
			System.out.println("現在の合計: " + cntTotal);
		}

		System.out.println("最終合計: " + cntTotal);
		sc.close();
	}
}