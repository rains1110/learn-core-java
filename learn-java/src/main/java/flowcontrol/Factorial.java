package flowcontrol;

public class Factorial {
	public int numFactorial(int n) {
		int mult = 1;
		for (int i = n; i >= 1; i--) {
			mult = mult * i;

		}
		return mult;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fac = new Factorial();
		System.out.print(fac.numFactorial(3));

	}
}
