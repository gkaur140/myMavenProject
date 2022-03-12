package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mymavenproject.testbase.BaseTest;

public class LandingPage extends BaseTest {

	public LandingPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.header_user_info")
	WebElement signInButton;

	public SignInPage clickSignInButton() {
		signInButton.click();
		return new SignInPage();
	}

}
