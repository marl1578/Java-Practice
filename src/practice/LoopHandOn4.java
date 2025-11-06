package practice;

import java.util.Scanner;

public class LoopHandOn4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intNum = 0;
		int cntTotal = 0;
		while (intNum >= 0) {
			System.out.print("数字を入力してください:");
			String inputNum = sc.nextLine();
			intNum = Integer.parseInt(inputNum);
			cntTotal += intNum;
		}
		System.out.println("合計:" + cntTotal);
		sc.close();
	}
}//UI的にはわからない。これ修正しないと次回に

