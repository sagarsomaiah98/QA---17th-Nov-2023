import org.testng.annotations.Test;

public class Prior {

	
	@Test(priority=-2)
	public void b() {
		
		System.out.println("b");
	}
	
	@Test(priority=-3)
	public void c() {
		System.out.println("c");
		
	}
	
	@Test(priority=1)
	public void a() {
		System.out.println("a");
		
	}
}
