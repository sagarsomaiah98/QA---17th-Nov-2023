package Interface;

public class Citi implements CentralBank{

	public static void main(String[] args) {
		
    Citi c = new Citi();
    c.creditcard();
    c.savings();
    c.loan();
		
	}

	@Override
	public void savings() {
		System.out.println("citi saving balance should be 25k$");
	}

	@Override
	public void loan() {
		System.out.println("citi loan interest is 6%");
		
	}

	@Override
	public void creditcard() {
		System.out.println("citi annual charges for credit card is 100$");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

	

}
