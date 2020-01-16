package pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.HomeLocators;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public HomePage verifyAmazonHomePageIsDisplayed()  throws Exception {

		assertTrue(driver.findElement(By.xpath(HomeLocators.amazonLogo)).isDisplayed(),"Error info : Home page is not displayed");
		return this;
	}

	public HomePage clickSearchIcononAmazon()  throws Exception {

		driver.findElement(By.xpath(HomeLocators.searchIconAmazon)).click();
		return this;

	}

	public HomePage enterSearchDetailsonAmazon(String detail)  throws Exception {

		driver.findElement(By.id(HomeLocators.searchBoxAmazon)).sendKeys(detail);
		this.clickSearchIcononAmazon();
		return this;

	}

	public String getSearchedPhonePriceonAmazon()  throws Exception {

		List<WebElement> myList= driver.findElements(By.xpath("//span[contains(text(),'Choice')]/preceding-sibling::span/parent::span/ancestor::a/parent::span/../../following::div/a/span/span/span[text()='₹']/following::span[1]"));////span[text()='₹']/following::span[contains(text(),'')][1]"
		List<String> all_elements_text=new ArrayList<String>();

		for(int i=0; i<myList.size(); i++){


			all_elements_text.add(myList.get(i).getText());


			//System.out.println(myList.get(0).getText());
		}
		return myList.get(0).getText();
	}

	public HomePage verifyFlipkartHomePageIsDisplayed()  throws Exception {

		if (driver.findElement(By.xpath(HomeLocators.flipkartLoginPopup)).isDisplayed()) {
			driver.findElement(By.xpath(HomeLocators.flipkartLoginPopup)).click();
		}

		assertTrue(driver.findElement(By.xpath(HomeLocators.flipKartLogo)).isDisplayed(),"Error info : Home page is not displayed");
		return this;
	}

	public HomePage clickSearchIcononFlipkart()  throws Exception {

		driver.findElement(By.xpath(HomeLocators.searchIconFlipkart)).click();
		return this;

	}

	public HomePage enterSearchDetailsonFlipkart(String detail)  throws Exception {

		driver.findElement(By.xpath(HomeLocators.searchBoxFlipkart)).sendKeys(detail);
		this.clickSearchIcononFlipkart();
		return this;

	}

	public String getSearchedPhonePriceonFlipkart()  throws Exception {

		List<WebElement> myList= driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		//List<String> all_elements_text=new ArrayList<String>();

		for(int i=0; i<myList.size(); i++){
			//all_elements_text.add(myList.get(i).getText());
			//System.out.println(myList.get(0).getText());
		}
		return myList.get(0).getText();
	}

}
