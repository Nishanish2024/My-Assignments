package assignments.day4;

public class CompareArrays {

	public static void main(String[] args) {
		   int array1[] = {3,2,11,4,6,7};           
		   int array2[] = {1,2,8,4,9,7}; 
		   //Arrays.sort(array1);
		   System.out.println(".....Compare two Arrays.....");
		   System.out.println("Duplicates are: ");
		   for (int i = 0; i <= array1.length-1; i++) {
			for (int j = 0; j <= array2.length-1; j++) {
				if(array1[i] == array2[j]) {
					System.out.print(array1[i] +" ");
				}
			}
		}
	}
}
