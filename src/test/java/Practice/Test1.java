package Practice;

import org.testng.annotations.Test;

@Test
public class Test1 {

	@Test(groups = { "smoke" })
	// @Test
	// @Test(priority = 0)
	public void openBrowser() {
		System.out.println("Open Browser Method in Test1 Class");
	}

	@Test(groups = { "sanity", "smoke" })
	// @Test
	// @Test(priority = 1)
	public void login() {
		System.out.println("Login method in Test1 Class");
	}

	@Test(groups = { "smoke", "exploratory" })
	// @Test
	// @Test(priority = 2)
	public void testMethod() {
		System.out.println("Test method in Test1 Class");
	}

	@Test(groups = { "functional" })
	// @Test
	// @Test(priority = 3)
	public void logOut() {
		System.out.println("LogOut method in Test1 Class");
	}

	@Test(groups = { "smoke", "sanity", "exploratory", "functional" })
	// @Test
	// @Test(priority = 4)
	public void closeBrowser() {
		System.out.println("Close Browser method in Test1 Class");
	}

}
