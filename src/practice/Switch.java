package practice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1～7までの数字を入力してください:");
		String inputnum = scanner.nextLine();
		switch (inputnum) {
		case "1":
			System.out.println("月曜日");
			break;
		case "2":
			System.out.println("火曜日");
			break;
		case "3":
			System.out.println("水曜日");
			break;
		case "4":
			System.out.println("木曜日");
			break;
		case "5":
			System.out.println("金曜日");
			break;
		case "6":
			System.out.println("土曜日");
			break;
		case "7":
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な番号です");
		}
		scanner.close();
	}

}
