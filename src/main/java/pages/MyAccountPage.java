package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mymavenproject.testbase.BaseTest;

public class MyAccountPage extends BaseTest {

	public MyAccountPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.header_user_info a span")
	WebElement userName;

	public String getUserNameText() {
		String userNameText = userName.getText();
		return userNameText;
	}
}
