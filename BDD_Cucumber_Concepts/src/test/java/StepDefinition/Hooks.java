package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void init() {
		
	}
	
	
	@After
	public void teardown() {
		LoginStepDef.driver.quit();
	}

}
