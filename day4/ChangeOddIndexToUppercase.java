package assignments.day4;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		String output="";
		
		System.out.println("------Change Odd Index To Uppercase-------");
		System.out.print("Input String is: ");
		for (int i = 0; i < charArray.length; i++)
		{
			System.out.print(charArray[i]);
			if(i%2 != 0) {
				//System.out.println("i = "+i);
				output = output + Character.toUpperCase(charArray[i]);
				
			}
			else {
				output = output + Character.toLowerCase(charArray[i]);
			}
		}	
		System.out.println("\nOutput is :" + output);
	}

}
