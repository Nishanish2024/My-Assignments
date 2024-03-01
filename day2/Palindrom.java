package assignments.day2;

public class Palindrom {

	public static void main(String[] args) {
		int input=545;
		int output=0;
		
		System.out.println("Input : "+input);
		int temp=input;
		while (input >0){
			output=output*10+input%10;
			input=input/10;
			//System.out.println("inside while...output : "+output);
			//System.out.println("inside while...input : "+input);
		}
		//System.out.println("outside while...input : "+temp);
		if(temp==output)
		{
			System.out.println("It is a Palindrome Number");
		}
		else
			System.out.println("It is a not Palindrome Number");
	}

}
