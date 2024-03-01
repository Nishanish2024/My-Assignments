package assignments.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		 int input[] = {1,4,3,2,8,6,7}; 
		 int r;
		 int missingNo=-1;
		 System.out.println("--------Find Missing Number in the Array");
		 Arrays.sort(input);
		 for (int i = 0; i < input.length-1; i++)
		 {
			//System.out.print(" "+input[i]);
			
			r=input[i+1] - input[i];
			if(r > 1) 
			{
				missingNo=input[i]+1;
				System.out.println(missingNo);
			}
			
		}
		 
	}

}
