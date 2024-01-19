
public class EvenOddCount {
	
	public void evenodd(int[] arr) {
		int evenCount=0;
		int oddCount=0;
		
		System.out.println("total number of odd numbers"+evenCount);
		System.out.println("total number of odd numbers"+oddCount);
	}

	public static void main(String[] args) {
		int[] arr={2,5,6,10,12,9,13,18,20};
		
		EvenOddCount eo= new EvenOddCount();
		eo.evenodd(arr);
	}

}
