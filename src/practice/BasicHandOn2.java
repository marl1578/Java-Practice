package practice;

public class BasicHandOn2 {

	public static void main(String[] args) {
		int[] scores = { 72, 88, 95, 63, 80 };
		double averagePoint = 0;
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		averagePoint = (double) total / scores.length;
		System.out.println("平均点:" + averagePoint);
		for (int i = 0; i < scores.length; i++) {
			if (averagePoint <= scores[i]) {
				System.out.println("平均点以上:" + scores[i]);
			}
		}
	}
}
