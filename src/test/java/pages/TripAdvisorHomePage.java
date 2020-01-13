package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.TripAdvisorHomeLocators;

public class TripAdvisorHomePage {
	
	private WebDriver driver;

	public TripAdvisorHomePage(WebDriver driver) {

		this.driver = driver;
	}
	
	public TripAdvisorHomePage clickSearchBuuton()  throws Exception {

		driver.findElement(By.xpath(TripAdvisorHomeLocators.searchBox)).click();
		return this;

	}

	
	public TripAdvisorHomePage enterSearchDetailsonAmazon(String detail)  throws Exception {

		this.clickSearchBuuton();
		driver.findElement(By.xpath(TripAdvisorHomeLocators.mainsearch)).sendKeys(detail);
		driver.findElement(By.id(TripAdvisorHomeLocators.searchButton)).click();
		return this;

	}

}
