package flowcontrol;

public class EvenNumbers {
	// find all the even numbers from an array of numbers
	public static void main(String[] args) {
		int[] input = {2,33,4,55,66,34,53,56,87,46,98};
		
		for(int i=0; i < input.length; i++) {
			if(input[i]%2 == 0) {
				System.out.print(input[i] + " ");
			}
		}
	}
}
