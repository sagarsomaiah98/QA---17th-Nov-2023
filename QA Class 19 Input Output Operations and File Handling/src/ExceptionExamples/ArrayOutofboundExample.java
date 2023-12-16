package ExceptionExamples;

public class ArrayOutofboundExample {

	public static void main(String[] args) {
		int a[] = new int[10];
        a[20] = 9; //exception thrown
        System.out.println(a[2]);
    

	}

}
