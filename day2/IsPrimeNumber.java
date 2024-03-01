package assignments.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=15;
		int flag=0;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(num +" is a prime number");
		else
			System.out.println(num +" is a not prime number");
	}

}
