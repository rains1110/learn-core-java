package flowcontrol;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> v = new TreeSet<Integer>();
		v.add(212345);
		v.add(112344);
		v.add(389995);
		v.add(712345);
		v.add(389995);
		v.add(712345);

		for (Integer i : v) {
			System.out.println(i);
		}
	}

}
