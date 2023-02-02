package flowcontrol;

public class SumOfNaturalNumbers {

	public int naturalNumber(int n) {
		int sum = 0;
		for (int i = n; i >= 1; i--) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNaturalNumbers abc = new SumOfNaturalNumbers();
		System.out.println(abc.naturalNumber(6));
		
	}

}
