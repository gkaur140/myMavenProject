package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mymavenproject.testbase.BaseTest;

public class ShoppingCartPage extends BaseTest {
	public ShoppingCartPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "p a[title=\"Proceed to checkout\"]")
	WebElement checkoutBtn;
	@FindBy(css = "button[class=\"button btn btn-default button-medium\"] ")
	WebElement checkoutBtn1;
	@FindBy(css = "input[type=\"checkbox\"]")
	WebElement agreeCheckBox;
	@FindBy(css = "button[class=\"button btn btn-default standard-checkout button-medium\"]")
	WebElement checkoutBtn2;
	@FindBy(css = "a.bankwire")
	WebElement bankWireBtn;
	@FindBy(css = "button[class=\"button btn btn-default button-medium\"]")
	WebElement confirmationBtn;
	@FindBy(css = "p strong.dark")
	WebElement confirmationText;

	public String getConfirmationText() {
		checkoutBtn.click();
		checkoutBtn1.click();
		agreeCheckBox.click();
		checkoutBtn2.click();
		bankWireBtn.click();
		confirmationBtn.click();

		return confirmationText.getText();
	}

}
