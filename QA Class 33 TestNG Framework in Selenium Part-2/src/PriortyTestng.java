import org.testng.annotations.Test;

public class PriortyTestng {
	
	@Test(priority=-1)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority=5)
	public void order() {
		System.out.println("order");
	}
	
	@Test(priority=-3)
	public void addtocart() {
		System.out.println("addtocart");
	}
	
	@Test(priority=2)
	public void settings() {
		
		System.out.println("settings");
	}
	
	@Test(priority=4)
	public void logut() {
		System.out.println("logout");
	}

}
