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

	public TripAdvWritingReviewPage mouseOverOnRating() throws Exception {

		Actions action = new Actions(driver);
		WebElement w0 = driver.findElement(By.xpath("//span[@id='bubble_rating']"));
		//WebElement w1 = driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_00']"));
	//	action.moveToElement(w0).moveToElement(w1).click().build().perform();
		action.moveToElement(w0,50,0).perform();

	//	WebElement w2 =driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_30']"));
	//	action.moveToElement(w2,50,0).perform();
	//	WebElement w3 =driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_50']")); 
		return this;

	}

	public TripAdvWritingReviewPage enterReviewTitle(String detail) throws Exception {
		driver.findElement(By.id(TripAdvisorWritingReviewLocators.reviewTitle)).sendKeys(detail);
		return this;

	}

	public TripAdvWritingReviewPage enterReview(String detail) throws Exception {
		driver.findElement(By.id(TripAdvisorWritingReviewLocators.review)).sendKeys(detail);
		return this;
	}

	public TripAdvWritingReviewPage clickSubmit() throws Exception {
		driver.findElement(By.id(TripAdvisorWritingReviewLocators.submit)).click();
		return this;
	}
	
	public TripAdvWritingReviewPage selectCheckBox() throws Exception {
		driver.findElement(By.id(TripAdvisorWritingReviewLocators.submitCheckBox)).click();
		return this;
	}

	public TripAdvWritingReviewPage mouseOverByJS() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].onmouseover()",
				driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_50']")));
		return this;
	}

	public TripAdvWritingReviewPage mouseOverOnHotelServiceRating() throws Exception {

		Actions action = new Actions(driver);
		WebElement w0 = driver.findElement(By.xpath("//span[@id='qid12_bubbles']"));

		action.moveToElement(w0,200,0).perform();
		w0.click();
		
		WebElement w2 =driver.findElement(By.xpath("//span[@class='answersBubbles ui_bubble_rating fl qid12 bubble_30']"));
		action.moveToElement(w2,50,0).perform();
		return this;

	}

	public TripAdvWritingReviewPage mouseOverOnHotelLocationRating() throws Exception {

		Actions action = new Actions(driver);
		WebElement w0 = driver.findElement(By.xpath("//span[@id='qid47_bubbles']"));
		action.moveToElement(w0,200,0).perform();
		w0.click();
		WebElement w2 =driver.findElement(By.xpath("//span[@class='answersBubbles ui_bubble_rating fl qid47 bubble_30']"));
		action.moveToElement(w2,50,0).perform();
		return this;

	}
	
	public TripAdvWritingReviewPage mouseOverOnHotelSleepQualityRating() throws Exception {

		Actions action = new Actions(driver);
		WebElement w0 = driver.findElement(By.xpath("//span[@id='qid190_bubbles']"));
		action.moveToElement(w0,200,0).perform();
		w0.click();
		WebElement w2 =driver.findElement(By.xpath("//span[@class='answersBubbles ui_bubble_rating fl qid190 bubble_30']"));
		action.moveToElement(w2,50,0).perform();
		

		return this;

	}
	
	public TripAdvWritingReviewPage verifyWhetherHotelRatingIsAvailable() throws Exception {
		
		if(driver.findElement(By.xpath("//div[text()='Hotel Ratings']")).isDisplayed()) {
			
			this.mouseOverOnHotelServiceRating();
		//	this.mouseOverOnHotelLocationRating();
		//	this.mouseOverOnHotelSleepQualityRating();
			
		}
		return this;
	}

}
