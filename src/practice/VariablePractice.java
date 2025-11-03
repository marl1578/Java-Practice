package practice;

public class VariablePractice {

	public static void main(String[] args) {
		int age; //変数　宣言
		age = 20; //変数　代入
		int myAge = 36; //初期化
		final int MY_HEIGHT = 173;//定数の初期化　スネークケース
		System.out.println("私の年齢:" + myAge + "歳");
		System.out.println("私の身長:" + MY_HEIGHT + "cm");
		System.out.println("修正した"); /*同名の変数宣言はできない。再代入なら大丈夫*/
	}
}
