package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mymavenproject.testbase.BaseTest;

public class WomenCategoryPage extends BaseTest {

	public WomenCategoryPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.button-container a[data-id-product=\"1\"]")
	WebElement addToCartbtn;

	@FindBy(css = "a.product_img_link img[title=\"Faded Short Sleeve T-shirts\"]")
	WebElement imageIcon;
	@FindBy(css = "a[title=\"Proceed to checkout\"]")
	WebElement checkoutBtn;

	public void clickAddCartBtn() {
		JavascriptExecutor Js1 = (JavascriptExecutor) wd;
		Js1.executeScript("window.scrollBy(0,1000)");
		Actions act = new Actions(wd);
		act.moveToElement(imageIcon);
		addToCartbtn.click();
	}

	public ShoppingCartPage clickcheckoutBtn() {
		checkoutBtn.click();
		return new ShoppingCartPage();
	}

}
