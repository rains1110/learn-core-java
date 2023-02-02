package flowcontrol;

public class FactorialByRecursion {

	public int factorial1(int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 2;
		}
		return n * factorial1(n - 1);
	}

	{

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialByRecursion rec = new FactorialByRecursion();
		System.out.print(rec.factorial1(5));
	}

}
