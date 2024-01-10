import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@Test(dataProvider="data")
	public void method(String uname, String pwd,String email) {
		
		System.out.println(uname+" | "+pwd+" | "+email);
		
		
	}
	
	
	
	@DataProvider(name="data")
	public Object[][] testData() {
		
		return new Object[][] {{"username1","password1","u@gmail.com"},
			        
			                   {"username2","password2","t@gmail.com"} ,
			                   {"standarduser","secretsauce","e@gmail.com"}  
		};
		
		
	}

}
