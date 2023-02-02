package flowcontrol;

public class PrimeNumber {

	public static void main(String[] args) {
		int a[] = { 56, 23, 7, 65, 43 };
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(isPrime(a[i]));
		}
			
	}

	public static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		boolean prime = true;
		for (int i = 2; i * i <= n; i++) {
			//System.out.println("iteration " + i);
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
