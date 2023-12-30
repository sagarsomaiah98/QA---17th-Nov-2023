package SauceTests;

public class Run {

	public static void main(String[] args) throws InterruptedException {
	LoginTest l= new LoginTest();
	l.login();
	
	AddToCartTest a = new AddToCartTest();
	a.addtocart();
	
	LogOutTest lo = new LogOutTest();
	lo.logout();
		
	}

}
