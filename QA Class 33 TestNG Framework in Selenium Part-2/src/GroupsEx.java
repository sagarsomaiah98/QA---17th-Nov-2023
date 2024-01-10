import org.testng.annotations.Test;

public class GroupsEx {
	@Test(groups="Smoke")
	public void login() {
		System.out.println("login");
	}
	
	@Test(groups="Smoke")
	public void order() {
		System.out.println("order");
	}
	
	@Test(groups="Reg")
	public void addtocart() {
		System.out.println("addtocart");
	}
	
	@Test(groups="Reg")
	public void settings() {
		
		System.out.println("settings");
	}
	
	@Test(groups="Sanity")
	public void logut() {
		System.out.println("logout");
	}

}

