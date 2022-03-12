package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mymavenproject.testbase.BaseTest;

public class MyAccountPage extends BaseTest {

	public MyAccountPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "li a[title=\"Women\"]")
	WebElement textWomen;

	public WomenCategoryPage clickWomenText() {
		textWomen.click();
		return new WomenCategoryPage();
	}
}
