package assignments.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange=10;
		System.out.println("Printing Odd numbers between 1 to " + maxRange);
		for (int i=1; i<=maxRange; i++) {
			if(i%2!=0) {
				System.out.print("  "+i);
			}
		}
	}

}
