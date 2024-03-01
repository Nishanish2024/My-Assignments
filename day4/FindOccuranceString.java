package assignments.day4;

public class FindOccuranceString {

	public static void main(String[] args) {
		String input="TestLeaf";
		char find='e';
		
		System.out.println("Input String: "+ input);
		System.out.println("Occurrences of character--- "+ find + "---in the given String: ");
		int count = 0;
		char[] charInput = input.toCharArray();
		for (int i = 0; i < charInput.length; i++) {
			if(charInput[i] == find){	
				count= count +1;
			}	
		}
		System.out.println("count= " + count);
	}

}
