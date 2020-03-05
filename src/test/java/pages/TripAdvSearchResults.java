package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.TripSearchResultLocator;

public class TripAdvSearchResults {
	
	private WebDriver driver;

	public TripAdvSearchResults(WebDriver driver) {

		this.driver = driver;
	}
	
	public TripAdvSearchResults clickFirstResult()  throws Exception {

		driver.findElement(By.xpath(TripSearchResultLocator.firstResult)).click();
		return this;

	}
	
	public TripAdvSearchResults clickWriteAReview()  throws Exception {

		driver.findElement(By.xpath(TripSearchResultLocator.writeAReview)).click();
		return this;

	}

}
