package practice;

import java.util.Scanner;

public class LoopHandOn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("0を入力してください:");
		String inputNum = scanner.nextLine();
		int inputNum2 = Integer.parseInt(inputNum);
		while(inputNum2 != 0) {
			
		}
		System.out.println("入力されました。終了します。");
		scanner.close();
	}
	
}
