
public class SwapNumbers {
	
	public void swap(int a, int b) {
		
		System.out.println(a+" ->"+ a);
		System.out.println(b+" ->"+b);
	}

	public static void main(String[] args) {
		SwapNumbers sw = new SwapNumbers();
		sw.swap(10, 20);
		sw.swap(45, 65);
		sw.swap(32, 15);

	}

}
