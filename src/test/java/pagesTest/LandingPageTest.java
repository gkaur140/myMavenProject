package pagesTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mymavenproject.testbase.BaseTest;

import pages.LandingPage;

public class LandingPageTest extends BaseTest {

	LandingPage lp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
	}

	@Test(priority = 1)
	public void verifyTitleOfThePage() {
		String titleOfThePage = wd.getTitle();
		Assert.assertEquals(titleOfThePage, "My Store");
	}

	@Test(priority = 2)
	public void verifyIsLogoDisplayed() {
		boolean isDisplayed = lp.isLogoDisplayed();
		Assert.assertTrue(isDisplayed);
	}

	@AfterMethod
	public void quitDriver() {
		tearDown();
	}
}
