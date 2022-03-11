package pagesTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mymavenproject.testbase.BaseTest;

import pages.LandingPage;
import pages.MyAccountPage;
import pages.SignInPage;

public class SignInPageTest extends BaseTest {

	LandingPage lp;
	SignInPage sp;
	MyAccountPage ap;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
		sp = lp.clickSignInButton();
	}

	@Test
	public void verifyLogin() {
		ap = sp.login(prop.getProperty("email"), prop.getProperty("password"));
		String userName = ap.getUserNameText();
		Assert.assertEquals(userName, "Manvir Singh");
	}

	@Test
	public void verifyTitleOfSignInPage() {
		Assert.assertEquals(wd.getTitle(), "Login - My Store");
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

}
