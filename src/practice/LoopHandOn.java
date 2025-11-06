package practice;

import java.util.Scanner;

public class LoopHandOn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = -1; // 0以外で初期化

		while (inputNum != 0) {
			System.out.print("0を入力してください: ");
			inputNum = Integer.parseInt(scanner.nextLine()); // 条件変数を更新
		}
		System.out.println("入力されました。終了します。");
		scanner.close();
	}
}/*あんまりわかってない。変数を無駄に作る癖がある。修正前と比べて要注意*/