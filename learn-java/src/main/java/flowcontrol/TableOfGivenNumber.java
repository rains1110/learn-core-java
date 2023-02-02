package flowcontrol;

public class TableOfGivenNumber {

	public int tableMethod(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
		return n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableOfGivenNumber m1 = new TableOfGivenNumber();
		m1.tableMethod(5);
	}

}
