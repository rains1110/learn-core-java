package flowcontrol;

public class FibonicciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
int result=0;
int v1=1;
int v2=1;
for(int i=1;i<=n-2;i++) {
	 result=v1+v2;
	v1=v2;
	v2=result;
}
System.out.print("result=" +result);
}
	}


