package flowcontrol;

public class PatternPrint {
	public void drawPattern(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternPrint a = new PatternPrint();
		a.drawPattern(5);
	}

}
