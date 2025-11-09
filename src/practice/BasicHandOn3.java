package practice;

public class BasicHandOn3 {

	public static void main(String[] args) {
		final String LEVEL = "評価:";
		int[] sc = { 72, 88, 95, 63, 80, 45, 100 };
		int cntA = 0, cntB = 0, cntC = 0, cntD = 0, cntE = 0;
		for (int i = 0; i < sc.length; i++) {
			if (sc[i] >= 90) {
				System.out.println(sc[i] + "点" + " 評価:A");
				cntA++;
			} else if (sc[i] < 90 && sc[i] >= 80) {
				System.out.println(sc[i] + "点" + " 評価:B");
				cntB++;
			} else if (sc[i] < 80 && sc[i] >= 70) {
				System.out.println(sc[i] + "点" + " 評価:C");
				cntC++;
			} else if (sc[i] < 70 && sc[i] >= 60) {
				System.out.println(sc[i] + "点" + " 評価:D");
				cntD++;
			} else {
				System.out.println(sc[i] + "点" + " 評価:E");
				cntE++;
			}
		}
		System.out.println(LEVEL + "A " + cntA + "人");
		System.out.println(LEVEL + "B " + cntB + "人");
		System.out.println(LEVEL + "C " + cntC + "人");
		System.out.println(LEVEL + "D " + cntD + "人");
		System.out.println(LEVEL + "E " + cntE + "人");
	}
}
