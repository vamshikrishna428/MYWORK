package Practice;

import org.testng.annotations.Test;

@Test
public class Test2 {

	@Test(groups = { "smoke", "functional" })
	// @Test
	// @Test(priority = 0)
	public void openBrowser() {
		System.out.println("openBrowser method in Test2 class");
	}

	@Test(groups = { "sanity" })
	// @Test
	// @Test(priority = 1)
	public void login() {
		System.out.println("Login method in Test2 class");
	}

	@Test(groups = { "exploratory", "functional" })
	// @Test
	// @Test(priority = 2)
	public void testMethod() {
		System.out.println("Test method in Test2 class");
	}

	@Test(groups = { "smoke", "sanity" })
	// @Test
	// @Test(priority = 3)
	public void logOut() {
		System.out.println("LogOut method in Test2 class");
	}

	@Test(groups = { "exploratory" })
	// @Test
	// @Test(priority = 4)
	public void closeBrowser() {
		System.out.println("Close Browser method in Test2 class");
	}

}
