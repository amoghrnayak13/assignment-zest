package requirement;

import org.testng.annotations.Test;

import configurations.BrowserConfigurations;
import data.HomeData;
import pages.HomePage;
import pages.Utilities;


//To run the test cases please right click on the class file and select Runas>>TestNg
public class SearchPriceOfThePhone extends BrowserConfigurations{
	
	String valueOfIphoneOnAmazon,
	       valueOfIphoneOnFlipKart;

	@Test(priority=0, description = "Find out the Iphone XR 64Gb price in Amazon") 
	public void phonePriceOnAmazon() throws Exception{

		HomePage homePage = new HomePage(driver);

		String amazonURL = "https://www.amazon.in"; driver.get(amazonURL);

		homePage.verifyAmazonHomePageIsDisplayed()
		        .enterSearchDetailsonAmazon(HomeData.iphoneXR);

		valueOfIphoneOnAmazon= homePage.getSearchedPhonePriceonAmazon();//For this function we can even add the Sorting
	
		homePage.verifyIphoneXRModelIsSearchedonAmazon();

		valueOfIphoneOnAmazon = valueOfIphoneOnAmazon.replaceAll("[^a-zA-Z0-9]","");// Using Regular expression to remove special chars
		
		System.out.println(valueOfIphoneOnAmazon); 
		}

	@Test(priority=1,description = "Find out the Iphone XR 64Gb price in Flipkart")
	public void phonePriceOnFlipKart() throws Exception{

		HomePage homePage = new HomePage(driver);

		String flipKartURL = "https://www.flipkart.com";

		driver.get(flipKartURL);
        driver.manage().deleteAllCookies();
		homePage.verifyFlipkartHomePageIsDisplayed()
		        .enterSearchDetailsonFlipkart(HomeData.iphoneXR);
		
		String value = homePage.getSearchedPhonePriceonFlipkart();//For this function we can even add the Sorting
		
		homePage.verifyIphoneXRModelIsSearchedonFlipkart();
	
		valueOfIphoneOnFlipKart = value.substring(1);  
		valueOfIphoneOnFlipKart = valueOfIphoneOnFlipKart.replaceAll("[^a-zA-Z0-9]","");// Using Regular expression to remove special chars;
	
		System.out.println(valueOfIphoneOnFlipKart);
		
	}
	
	@Test(priority=3,description = "Compare Amazon and Flipkart prices")
	public void compareThevalues() throws Exception {
		
		int valueOnAmazon = Integer.parseInt(valueOfIphoneOnAmazon);
		int valueOnFlipkart = Integer.parseInt(valueOfIphoneOnFlipKart);
		
		Utilities utilitiesPage = new Utilities();
		
		utilitiesPage.compareTwoValues(valueOnAmazon, valueOnFlipkart);
	}
}
