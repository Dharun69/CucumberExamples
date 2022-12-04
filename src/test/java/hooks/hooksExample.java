package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksExample {

	@Before(order = 0)
	public void beforeSnapping() {
		System.out.println("Before hook");
	}
	
	@After(order = 1)
	public void afterSnapping() {
		System.out.println("After hook");
	}
	@Before(order = 1)
	public void beforeSnapping2() {
		System.out.println("Before hook");
	}
	
	@After(order = 0)
	public void afterSnapping2() {
		System.out.println("After hook");
	}
	
}
