package requirement;

import org.testng.annotations.Test;

import configurations.BrowserConfigurations;
import data.TripAdvisorReviewData;
import data.TripAdvisorSearchData;
import pages.TripAdvSearchResults;
import pages.TripAdvWritingReviewPage;
import pages.TripAdvisorHomePage;

public class WriteAReview  extends BrowserConfigurations{
	
	@Test
	public void writeAReviewOnTripAdvisor () throws Exception  {
		
		String URL = "https://www.tripadvisor.in";
		
		driver.get(URL);
		
		TripAdvisorHomePage tripAdvisorPage = new TripAdvisorHomePage(driver);
		TripAdvSearchResults tripSrchResultPage = new TripAdvSearchResults(driver);
		TripAdvWritingReviewPage tripWritingReviewPage = new TripAdvWritingReviewPage(driver);
		
		tripAdvisorPage.enterSearchDetailsonAmazon(TripAdvisorSearchData.clubMahindra);
	//	String parentHandle = this.driver.getWindowHandle();

		tripSrchResultPage.clickFirstResult();
		for (String winHandle : driver.getWindowHandles()) {
			this.driver.switchTo().window(winHandle);
			
		}
		tripSrchResultPage.clickWriteAReview();
		for (String winHandle : driver.getWindowHandles()) {
			this.driver.switchTo().window(winHandle);
			
		}
		tripWritingReviewPage.enterReviewTitle(TripAdvisorReviewData.reviewTitle)
		                     .enterReview(TripAdvisorReviewData.review)
		                     .mouseOverOnRating();
		
	}

}
