package pagesTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mymavenproject.testbase.BaseTest;

import pages.LandingPage;
import pages.MyAccountPage;
import pages.ShoppingCartPage;
import pages.SignInPage;
import pages.WomenCategoryPage;

public class ShoppingCartSlipPageConfirmationTest extends BaseTest {

	LandingPage lp;
	SignInPage sp;
	MyAccountPage ap;
	WomenCategoryPage wp;
	ShoppingCartPage scp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
		sp = lp.clickSignInButton();

	}

	@Test
	public void verifyOrderCompletion() {
		ap = sp.login(prop.getProperty("email"), prop.getProperty("password"));
		wp = ap.clickWomenText();
		wp.clickAddCartBtn();
		scp = wp.clickcheckoutBtn();
		String assertionText = scp.getConfirmationText();
		Assert.assertEquals(assertionText, "Your order on My Store is complete.");
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

}
