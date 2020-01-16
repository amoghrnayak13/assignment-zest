package pages;

import org.openqa.selenium.By;
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
		WebElement we = driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_10']"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_50']"))).click().build().perform();
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
	
	

}
