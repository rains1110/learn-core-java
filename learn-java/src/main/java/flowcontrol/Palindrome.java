package flowcontrol;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="nitin";
int j=str.length()-1;
for(int i=0;i<j;i++,j--) {
	if(str.charAt(i)==str.charAt(j))
		continue;
}

System.out.print("string is palindrome");
	}

}
