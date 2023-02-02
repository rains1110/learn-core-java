package flowcontrol;

public class ReversePattern {
	public void drawPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversePattern a = new ReversePattern();
		a.drawPattern(5);
	}

}
