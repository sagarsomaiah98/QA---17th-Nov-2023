import java.util.Arrays;

public class ArrayCopytoArray {
	//copy from one array arr to another empty array output and print it
	
	
	public void copyArray(int[] arr) {
		int output[] = new int[arr.length];
		
		
		System.out.println(Arrays.toString(output));
		
		
	}

	public static void main(String[] args) {
		int arr[] = {3, 2, -1, 9, -8, 6, -2,-15,20,11,-13};
		ArrayCopytoArray ac = new ArrayCopytoArray();
		ac.copyArray(arr);
		

	}

}
