package practice;

public class BasicHandOn {

	public static void main(String[] args) {
		int[] numbers = { 3, 8, 2, 10, 6 };
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("出力:" + numbers[i]);
			total += numbers[i];
		}
		System.out.println("合計:" + total);
		System.out.println("平均:" + ((double)(total) / numbers.length));
	}
}
