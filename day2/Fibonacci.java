package assignments.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int input=8;
		int n1=0;
		int n2=1;
		System.out.println("Fibonacci series....  ");
		for(int i=0; i < input; i++)
		{
			System.out.print(n1+"  ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
