package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import locators.TripAdvisorWritingReviewLocators;


public class TripAdvWritingReviewPage {

	private WebDriver driver;

	public TripAdvWritingReviewPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public TripAdvWritingReviewPage mouseOverOnRating()  throws Exception {

		Actions action = new Actions(driver);
		WebElement w0 = driver.findElement(By.xpath("//span[@id='bubble_rating']"));
		WebElement w1 = driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_00']"));
	//	WebElement w2 = driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_10']"));
	//	WebElement w3 = driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_50']"));
		action.moveToElement(w0).moveToElement(w1).click().build().perform();
	//	action.moveToElement(w1).moveToElement(w3).click().build().perform();
		return this;

	}
	
	public TripAdvWritingReviewPage enterReviewTitle(String detail)  throws Exception {
		driver.findElement(By.id(TripAdvisorWritingReviewLocators.reviewTitle)).sendKeys(detail);
		return this;

	}
	
	public TripAdvWritingReviewPage enterReview(String detail)  throws Exception {
		driver.findElement(By.id(TripAdvisorWritingReviewLocators.review)).sendKeys(detail);
		return this;
	}
	
	public TripAdvWritingReviewPage clickSubmit()  throws Exception {
		driver.findElement(By.id(TripAdvisorWritingReviewLocators.submit)).click();
		return this;
	}
	
	public TripAdvWritingReviewPage mouseOverByJS() throws Exception{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].onmouseover()", driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_50']")));
		return this;
	}

	
	

}
