package flowcontrol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 23, 55, 54, 9, 76, 66, 2, 91, 88, 77, 45, 1, 0, 45, 87, 88, 24 };
		int[] output = getOddNumbers(array);
		System.out.println(Arrays.toString(output));
	}

	/**
	 * Write a method which accepts int array as input parameter and return array of
	 * odd numbers
	 * Don't use Collections
	 */
	public static int[] getOddNumbers(int[] input) {
		// identify count of odd numbers
		int counter = 0;
		for (int number : input) {
			if (number % 2 != 0) {
				counter++;
			}
		}

		// create temp array;
		int[] temp = new int[counter];
		int p = 0;
		for (int number : input) {
			if (number % 2 != 0) {
				temp[p] = number;
				p++;
			}
			if (p == counter)
				break;
		}

		return temp;
	}

	/**
	 * Write a method which accepts int array as input parameter and return array of
	 * odd numbers
	 * Use Collections
	 */
	public static List<Integer> getOddNumbers(List<Integer> input) {
		List<Integer> temp = new ArrayList<Integer>();
		for (Integer number : input) {
			if (number % 2 != 0) {
				temp.add(number);
			}
		}
		return temp;
	}

}
